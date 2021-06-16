package model.cells.rails;

import model.cells.Cell;

public class RailsTurn extends Cell {
    public RailsTurn() {
        int[][] shape = {
                {0, 2, 0},
                {2, 2, 0},
                {0, 0, 0}
        };
        super.setShape(shape);
    }
}
