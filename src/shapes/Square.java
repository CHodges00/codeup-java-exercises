package shapes;


class Square extends Rectangle{

    public int side;

    public Square(int side) {
        super(side, side);
        this.side = side;

    }

    @Override
    public int getArea() {
        return super.getArea();
    }

    @Override
    public int getPerimeter() {
        return super.getPerimeter();
    }
}
