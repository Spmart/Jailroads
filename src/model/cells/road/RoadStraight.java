package model.cells.road;

import model.cells.Cell;

public class RoadStraight extends Cell {
    public RoadStraight() {
        int[][] shape = {
                {0, 1, 0},
                {0, 1, 0},
                {0, 1, 0}
        };
        super.setShape(shape);
    }
}
