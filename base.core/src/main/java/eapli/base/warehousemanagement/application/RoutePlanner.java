package eapli.base.warehousemanagement.application;

import eapli.base.agvmanagement.domain.Position;
import eapli.base.warehousemanagement.application.graph.Algorithms;
import eapli.base.warehousemanagement.application.graph.matrix.MatrixGraph;


import java.util.LinkedList;
import java.util.List;

public class RoutePlanner {
    private AGVMemory AGVMemory;
    private MatrixGraph<Position, Integer> warehousePlant;

    public RoutePlanner(AGVMemory AGVMemory) {
        this.AGVMemory = AGVMemory;
    }

    public synchronized List<Position> createRoutePlanner() {
        LinkedList<Position> positions = new LinkedList<>();

        Algorithms.shortestPath(createMatrixGraph(), AGVMemory.getActualPosition(), AGVMemory.getDestination(), Integer::compare, Integer::sum, 0, positions);

        if (!positions.isEmpty()) {
            AGVMemory.setAgvPath(positions);
        }
        return positions;
    }


    public synchronized MatrixGraph<Position, Integer> createMatrixGraph() {
        warehousePlant = new MatrixGraph<>(true);
        int[][] matrix = AGVMemory.getWarehousePlant();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    if (i - 1 >= 0) {
                        warehousePlant.addEdge(new Position(j + 1, i + 1), new Position(j + 1, i), 1);
                    }
                    if (j - 1 >= 0) {
                        warehousePlant.addEdge(new Position(j + 1, i + 1), new Position(j, i + 1), 1);
                    }
                    if (i + 1 < matrix.length) {
                        warehousePlant.addEdge(new Position(j + 1, i + 1), new Position(j + 1, i + 2), 1);
                    }
                    if (j + 1 >= 0) {
                        warehousePlant.addEdge(new Position(j + 1, i + 1), new Position(j + 2, i + 1), 1);
                    }
                }
            }
        }
        return warehousePlant;
    }
}




