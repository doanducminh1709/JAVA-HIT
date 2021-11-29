
package Bai4;
import java.util.ArrayList;
public class SUM<T>{
    private T NbA;
    private T NbB;
    
    public SUM(){}

    public T getNbA() {
        return NbA;
    }

    public void setNbA(T NbA) {
        this.NbA = NbA;
    }

    public T getNbB() {
        return NbB;
    }

    public void setNbB(T NbB) {
        this.NbB = NbB;
    }

    public SUM(T NbA, T NbB) {
        this.NbA = NbA;
        this.NbB = NbB;
    }
   
}
