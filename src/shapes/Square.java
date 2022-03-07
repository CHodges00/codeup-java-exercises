package shapes;

public class Square extends Quadrilateral {
    public Square(int side) {
        super(side, side);
        side = width;
        side = length;
    }

    @Override
    void setLength(int length) {
        this.length = length;
    }

    @Override
    void setWidth(int width) {
        this.width = width;
    }
}

