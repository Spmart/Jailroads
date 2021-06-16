package model.cells.road;

import model.cells.Cell;

public class RoadTurn extends Cell {
    public RoadTurn() {
        int[][] shape = {
                {0, 1, 0},
                {1, 1, 0},
                {0, 0, 0}
        };
        super.setShape(shape);
    }
}
