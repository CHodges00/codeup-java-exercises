package shapes;

class Rectangle {


    public int width;
    public int length;


    public Rectangle(int width, int length){
        this.width = width;
        this.length = length;

    }




    public int getPerimeter(){
        int perimeter = (2*this.width)+(2*this.length);
        return perimeter;
    }

    public int getArea() {
        int area = this.length * this.width;
        return area;
    }
}
