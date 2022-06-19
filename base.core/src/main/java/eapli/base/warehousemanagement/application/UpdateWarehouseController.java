package eapli.base.warehousemanagement.application;


import eapli.base.warehousemanagement.domain.*;
import eapli.base.warehousemanagement.utlis.JsonReader;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.transaction.Transactional;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class UpdateWarehouseController {


    private Warehouse warehouse;

    EntityManagerFactory factory = Persistence.createEntityManagerFactory("eapli.base");
    EntityManager manager = factory.createEntityManager();

    public UpdateWarehouseController() {

    }

    public boolean updateWarehouse() throws IOException {
        manager.getTransaction().begin();
        manager.createQuery("DELETE FROM RowAisle").executeUpdate();
        manager.createQuery("DELETE FROM Aisle").executeUpdate();
        manager.createQuery("DELETE FROM AGVDock").executeUpdate();
        manager.createQuery("DELETE FROM Warehouse").executeUpdate();
        manager.getTransaction().commit();
        //warehouse
        addWarehouse();
        //agvDock
        addAGVDocks(this.warehouse);
        //aisles
        addAisles(this.warehouse);
        return true;
    }

    @Transactional
    boolean addWarehouse() throws IOException {
        JsonReader jsonReader = new JsonReader("base.core/src/main/resources/warehouse1.json");
        List<String> warehouseList = jsonReader.getWarehouseAtribute();
        warehouse = new Warehouse(warehouseList.get(0),Integer.parseInt(warehouseList.get(1)),
                Integer.parseInt(warehouseList.get(2)),Integer.parseInt(warehouseList.get(3)),warehouseList.get(4));
        manager.getTransaction().begin();
        manager.persist(warehouse);
        return true;
    }
    private boolean addAisles(Warehouse warehouse) throws IOException {
        JsonReader jsonReader = new JsonReader("base.core/src/main/resources/warehouse1.json");
        List<List<String>> aisles = jsonReader.getAisleList();
        Map<String,List<List<String>>> rowMap = jsonReader.getRowsList();
        for(int i =0; i<aisles.size(); i++){
            List<String> aisle = aisles.get(i);
            Aisle aisleTemp = new Aisle(Integer.parseInt(aisle.get(0)),Begin.valueOf(Integer.parseInt(aisle.get(1)),Integer.parseInt(aisle.get(2))),
                    End.valueOf(Integer.parseInt(aisle.get(3)),Integer.parseInt(aisle.get(4))),
                    Depth.valueOf(Integer.parseInt(aisle.get(5)),Integer.parseInt(aisle.get(6))),
                    aisle.get(7),warehouse);
            manager.persist(aisleTemp);
            if(rowMap.containsKey(String.valueOf(i+1))){
                List<List<String>> rowList = rowMap.get(String.valueOf(i+1));
              addRow(rowList,aisleTemp);
            }
        }

        manager.getTransaction().commit();

        return true;
    }

    private boolean addRow(List<List<String>> rowList, Aisle aisleTemp){
        for (int j=0;j<rowList.size();j++){
            List<String> row = rowList.get(j);
            manager.persist(new RowAisle(Integer.parseInt(row.get(0)),aisleTemp,Begin.valueOf(Integer.parseInt(row.get(1)),Integer.parseInt(row.get(2))),
                    End.valueOf(Integer.parseInt(row.get(3)),Integer.parseInt(row.get(4))),Shelve.valueOf(row.get(5))));

       }
        return true;
    }

    private boolean addAGVDocks(Warehouse warehouse) throws IOException {
        JsonReader jsonReader = new JsonReader("base.core/src/main/resources/warehouse1.json");
        List<List<String>> agvDocks = jsonReader.getAgvDockList();


        for(int i =0; i<agvDocks.size(); i++){
            List<String> agvDock = agvDocks.get(i);
            manager.persist(new AGVDock(agvDock.get(0),Begin.valueOf(Integer.parseInt(agvDock.get(1)),Integer.parseInt(agvDock.get(2))),
                    End.valueOf(Integer.parseInt(agvDock.get(3)),Integer.parseInt(agvDock.get(4))),
                    Depth.valueOf(Integer.parseInt(agvDock.get(5)),Integer.parseInt(agvDock.get(6))),
                    agvDock.get(7),warehouse));
        }
        return true;
    }

}
