package shapes;

class Rectangle {

    protected int length;
    protected int width;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle() {
    }

    public int perimeter() {
        return (2 * width) + (2 * length);
    }

    public int area() {
        return length * width;
    }


}
