package shapes;


class Square extends Rectangle{

    public int side;

    public Square(int side) {
        super(side, side);
        this.side = side;

    }


    public int getArea() {
        System.out.println("OVERRIDDEN");
        return super.getArea();
    }


    public int getPerimeter() {
        System.out.println("OVERRIDDEN");
        return super.getPerimeter();
    }
}
