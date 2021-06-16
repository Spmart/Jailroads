package model.cells.road;

import model.cells.Cell;

public class RoadTShape extends Cell {
    public RoadTShape() {
        int[][] shape = {
                {0, 1, 0},
                {1, 1, 1},
                {0, 0, 0}
        };
        super.setShape(shape);
    }
}
