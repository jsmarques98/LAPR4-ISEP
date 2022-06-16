package eapli.base.warehousemanagement.application;

import eapli.base.agvmanagement.domain.AGV;
import eapli.base.agvmanagement.domain.Position;
import eapli.base.agvmanagement.repository.AGVRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;


public class Positioning {

    private AGVMemory AGVMemory;
    private AGVRepository agvRepository;

    public Positioning(AGVMemory AGVMemory) {
        this.AGVMemory = AGVMemory;
        agvRepository = PersistenceContext.repositories().agvs();
    }

    @Transactional
    public synchronized void teste() throws InterruptedException {


        AGV agv = AGVMemory.getAgv();


        Position position = AGVMemory.getActualPosition();





        int direction = AGVMemory.getDirection();
        if (AGVMemory.getSpeed() != 0) {

            double speed = AGVMemory.getSpeed();

            System.out.println(position);
            System.out.println(AGVMemory.getSpeed());
            Thread.sleep((long) (1/speed)*1000);

            System.out.println(AGVMemory.getSpeed());
            System.out.println("-------------------");
            if(AGVMemory.getSpeed()!=0) {

                if (!AGVMemory.isFlag()) {
                    AGVMemory.setFlag(true);
                    AGVMemory.setSpeed(AGVMemory.getSpeed() * 2);
                }

                if (direction == 0) {

                    position.setWsquare(position.wsquare() - 1);

                    AGVMemory.setActualPosition(position);
                    agv.setPosition(position);
                    agvRepository.save(agv);
                }
                if (direction == 1) {

                    position.setWsquare(position.wsquare() + 1);

                    AGVMemory.setActualPosition(position);
                    agv.setPosition(position);
                    agvRepository.save(agv);
                }
                if (direction == 2) {

                    position.setLsquare(position.lsquare() + 1);

                    AGVMemory.setActualPosition(position);
                    agv.setPosition(position);
                    agvRepository.save(agv);
                }
                if (direction == 3) {

                    position.setLsquare(position.lsquare() - 1);

                    AGVMemory.setActualPosition(position);
                    agv.setPosition(position);
                    agvRepository.save(agv);
                }
            }
        }

    }
}

