package shapes;
import java.lang.Math;
class Circle {

    private int radius;

    public Circle(int radius){
        this.radius = radius;
    }

    public Circle(double radius){
        this.radius = (int) radius;
    }

    public double getArea(){
        int area = pi * (radius ^ 2);
        return area;
    }

    public double getCircumference(){

    }

}
