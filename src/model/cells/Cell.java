package model.cells;

public class Cell {
    /**
     * Game rules:
     * https://cdn.mosigra.ru/mosigra.product.other/560/685/dorozhnye_seti_siniy.pdf
     *
     * Cell is 3x3 array.
     * Dots in cell can be:
     * 0 — nothing is here
     * 1 — road
     * 2 — rails
     * 3 — scaffolding (1+2=3 — crossing but not connected)
     * 4 — station
     * 5 — lake
     * 6 — river
     */
    private int[][] shape = new int[3][3];

    public void rotateRight() {
        int[][] rotatedShape = new int[3][3];
        for (int i = 0; i < shape.length; i++) {
            for (int j = 0; j < shape.length; j++) {
                rotatedShape[i][j] = shape[shape.length - j - 1][i];
            }
        }
        shape = rotatedShape;
    }

    public void rotateLeft() {
        //TODO:todo
    }

    public void flipUpsideDown() {
        int[] firstLine = shape[0];
        shape[0] = shape[2];
        shape[2] = firstLine;
    }

    public void flipLeftRight() {
        for (int[] line : shape) {
            int dot = line[0];
            line[0] = line[2];
            line[2] = dot;
        }
    }

    public int[][] getShape() {
        return shape;
    }

    public void setShape(int[][] shape) {
        this.shape = shape;
    }

    @Override
    public String toString() {
        StringBuilder cell = new StringBuilder();

        for (int[] line : shape) {
            for (int dot : line) {
                cell.append(dot);
            }
            cell.append("\n");
        }
        return cell.toString();
    }
}