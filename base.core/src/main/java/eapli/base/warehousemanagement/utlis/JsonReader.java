package eapli.base.warehousemanagement.utlis;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class JsonReader {

    private List<String> warehouseAtribute;
    private List<List<String>> aisleList;
    private List<String> aisleAtribute;
    private List<String> rowAtribute;
    private List<List<String>> rowList;
    private Map<String,List<List<String>>> rowsList;
    private List<String> agvDockAtribute;
    private List<List<String>> agvDockList;

    public JsonReader(String path) throws IOException {
        reader = Files.newBufferedReader(Paths.get(path));
        jsonObject = JsonParser.parseReader(reader).getAsJsonObject();
        warehouseAtribute = new ArrayList<>();
        aisleList = new ArrayList<>();
        rowList = new ArrayList<>();
        rowsList = new TreeMap<>();
        agvDockList = new ArrayList<>();
        warehouseReader();
        agvDocksReader();
        aislesReader();
        rowsReader();
    }

    Reader reader;
    JsonObject jsonObject;

    private boolean warehouseReader(){
        warehouseAtribute.add(jsonObject.get("Warehouse").getAsString());
        warehouseAtribute.add(jsonObject.get("Length").getAsString());
        warehouseAtribute.add(jsonObject.get("Width").getAsString());
        warehouseAtribute.add(jsonObject.get("Square").getAsString());
        warehouseAtribute.add(jsonObject.get("Unit").getAsString());
        return true;
    }

    private boolean aislesReader(){
        JsonArray aisles = jsonObject.get("Aisles").getAsJsonArray();
        for (int i= 0;i<aisles.size();i++) {
            JsonObject aisle = aisles.get(i).getAsJsonObject();
            aisleAtribute = new ArrayList<>();
            aisleAtribute.add(aisle.get("Id").getAsString());
            aisleAtribute.add(aisle.get("begin").getAsJsonObject().get("lsquare").getAsString());
            aisleAtribute.add(aisle.get("begin").getAsJsonObject().get("wsquare").getAsString());
            aisleAtribute.add(aisle.get("end").getAsJsonObject().get("lsquare").getAsString());
            aisleAtribute.add(aisle.get("end").getAsJsonObject().get("wsquare").getAsString());
            aisleAtribute.add(aisle.get("depth").getAsJsonObject().get("lsquare").getAsString());
            aisleAtribute.add(aisle.get("depth").getAsJsonObject().get("wsquare").getAsString());
            aisleAtribute.add(aisle.get("accessibility").getAsString());
            aisleList.add(aisleAtribute);
        }
        return true;
    }

    private boolean rowsReader(){
        JsonArray aisles = jsonObject.get("Aisles").getAsJsonArray();
        for (int i= 0;i<aisles.size();i++) {
            rowList = new ArrayList<>();
            JsonObject aisle = aisles.get(i).getAsJsonObject();
            String idAisle = aisle.get("Id").getAsString();
            JsonArray rows = aisle.get("rows").getAsJsonArray();
            for (int j= 0;j<rows.size();j++){
                JsonObject row = rows.get(j).getAsJsonObject();
                rowAtribute =new ArrayList<>();
                rowAtribute.add(row.get("Id").getAsString());
                rowAtribute.add(row.get("begin").getAsJsonObject().get("lsquare").getAsString());
                rowAtribute.add(row.get("begin").getAsJsonObject().get("wsquare").getAsString());
                rowAtribute.add(row.get("end").getAsJsonObject().get("lsquare").getAsString());
                rowAtribute.add(row.get("end").getAsJsonObject().get("wsquare").getAsString());
                rowAtribute.add(row.get("shelves").getAsString());
                rowList.add(rowAtribute);
            }
            if (rowsList.containsKey(idAisle)){
                rowsList.get(idAisle).addAll(rowList);
            }else {
                rowsList.put(idAisle,rowList);
            }
        }
        return true;
    }

    private boolean agvDocksReader(){
        JsonArray docks = jsonObject.get("AGVDocks").getAsJsonArray();
        for (int i= 0;i<docks.size();i++){
            JsonObject dock = docks.get(i).getAsJsonObject();
            agvDockAtribute = new ArrayList<>();
            agvDockAtribute.add(dock.get("Id").getAsString());
            agvDockAtribute.add(dock.get("begin").getAsJsonObject().get("lsquare").getAsString());
            agvDockAtribute.add(dock.get("begin").getAsJsonObject().get("wsquare").getAsString());
            agvDockAtribute.add(dock.get("end").getAsJsonObject().get("lsquare").getAsString());
            agvDockAtribute.add(dock.get("end").getAsJsonObject().get("wsquare").getAsString());
            agvDockAtribute.add(dock.get("depth").getAsJsonObject().get("lsquare").getAsString());
            agvDockAtribute.add(dock.get("depth").getAsJsonObject().get("wsquare").getAsString());
            agvDockAtribute.add(dock.get("accessibility").getAsString());
            agvDockList.add(agvDockAtribute);
        }
        return true;
    }

    public List<String> getWarehouseAtribute() {
        return warehouseAtribute;
    }

    public List<List<String>> getAisleList() {
        return aisleList;
    }

    public Map<String,List<List<String>>> getRowsList() {
        return rowsList;
    }

    public List<List<String>> getAgvDockList() {
        return agvDockList;
    }
}
