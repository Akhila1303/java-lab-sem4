package pkg2c;


interface IPoint {
    void noOfPoints();
}

abstract class Shape{
    void shapePrint(){
        System.out.println("This is a method inside shape class");
    }
}

class Triangle extends Shape implements IPoint{
    int points = 3;

    public void noOfPoints() {
        System.out.println("The number of points in triangle are: " + points);
    }
}

class Circle extends Shape{
    int r;
    Circle(){
        r=0;
    }
    Circle(int r){
        this.r = r;
    }
    void getArea(){
        System.out.println("Area of circle: " + 3.14*r*r);
    }
}

class ThreeDCircle extends Circle{
    ThreeDCircle(int r) {
        super(r);
    }

    void getVolume(){
        System.out.println("Volume of sphere: "+(float)(4/3)*Math.PI*r*r*r);
    }
}

class Hexagon extends Shape implements  IPoint{
    int points = 6;
    @Override
    public void noOfPoints() {
        System.out.println("The number of points in hexagon are: " + points);
    }
}

public class Driver {
    public static void main(String[] args) {
        Triangle tri = new Triangle();
        tri.noOfPoints();
        tri.shapePrint();
        Circle cir = new Circle(3);
        cir.getArea();
        cir.shapePrint();
        ThreeDCircle sphere = new ThreeDCircle(10);
        sphere.getVolume();
        Hexagon hex = new Hexagon();
        hex.noOfPoints();
        hex.shapePrint();
    }
}
