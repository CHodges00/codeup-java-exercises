package shapes;

class Rectangle {


    public int width;
    public int length;


    public Rectangle(int width, int length){
        this.width = width;
        this.length = length;

    }




    public int getPerimeter(){
        return (2* this.width)+(2* this.length);
    }

    public int getArea() {
        return this.length * this.width;
    }
}
