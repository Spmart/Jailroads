package model.cells.rails;

import model.cells.Cell;

public class RailsTShape extends Cell {
    public RailsTShape() {
        int[][] shape = {
                {0, 2, 0},
                {2, 2, 2},
                {0, 0, 0}
        };
        super.setShape(shape);
    }
}
