package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {

    protected int length;
    protected int width;


    public Quadrilateral(int width, int length){
        this.width = width;
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    abstract void setLength(int length);

    abstract void setWidth(int width);

    //IMPLEMENT METHODS
    public double perimeter() {
        return perimeter();
    }


    public double area() {
        return area();
    }
}
