package Bai2;

public class Circle implements IShape {
    private double radious;
    private double PI = Math.PI;
    public Circle(){}
    public Circle(double radious) {
        this.radious = radious;
    }

    @Override
    public double getArea() {
        return PI*Math.pow(radious,2);
    }

    @Override
    public double getPerimeter(){
      return 2*PI*radious;
    }
}
