package Bai2;

public class RunMain {
    public static void main(String[] args) {
        IShape[] Shapes = new IShape[3];
        Shapes[0] = new Rectangle(3.4 , 5.3);
        Shapes[1] = new Circle(5.5);
        Shapes[2]= new Rectangle(7.4 , 4.3);
        for(int i = 0 ; i < 3 ; i++){
            System.out.println( "Area of shapes ["+i+"]:" + Shapes[i].getArea());
            System.out.println( "Area of shapes ["+i+"]:" + Shapes[i].getPerimeter());
        }
    }
}
