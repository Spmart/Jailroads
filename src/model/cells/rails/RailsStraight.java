package model.cells.rails;

import model.cells.Cell;

public class RailsStraight extends Cell {
    public RailsStraight() {
        int[][] shape = {
                {0, 2, 0},
                {0, 2, 0},
                {0, 2, 0}
        };
        super.setShape(shape);
    }
}