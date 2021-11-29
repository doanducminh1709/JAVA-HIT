
package Bai4;
import java.util.Arrays;
public class RunMain {
    public static void main(String[] args) {
        

        
        SUM<Integer>SumT = new SUM<Integer>(3,2);
        System.out.println("Sum of type Interger = " + SumT.getNbA() + SumT.getNbB());
       
        SUM<Long>SumL = new SUM<Long>(3L , 4L);
        System.out.println("Sum of type Long = " + SumL.getNbA() + SumL.getNbB());
        
        SUM<Float>SumF = new SUM<Float>(4F , 3F);
        System.out.println("Sum of type Float = " + SumF.getNbA() + SumF.getNbB());
            
        SUM<Double>SumD = new SUM<Double>(4.3 , 4.3);
        System.out.println("Sum of type Double = " + SumL.getNbA() + SumL.getNbB());

        
    }
}
