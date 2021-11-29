package BAI2;
import java.util.Random;
public class RunMain {
    public static void main(String[] args) {
        
        Array arr1 = new Array();
        System.out.println("Enter n and array1 ");
        arr1.InputData();
        arr1.Show();
        //Random random = new Random();
        
        Array arr2 = new Array();
        System.out.println("Enter n and array2 ");
        arr2.InputData();
                
        arr2.Show_();
        
        System.out.print("\nEnter flag arr1(true || false) : ");
        arr1.Filter(Math.round(Math.random()) == 0);
        
        System.out.print("\nEnter flag arr2(true || false) : ");
        arr2.Filter(Math.round(Math.random())==0);
 //random ra 1 gia tri bat ki 
 //con 1 phuong thuc xuat ra gia tri nữa là sử dụng Arrays.toString())
        float ARR_Tb1 = (float)arr1.Sum()/arr1.CountNumber();
        float ARR_Tb2 = (float)arr2.Sum()/arr2.CountNumber();
        
                
        if(ARR_Tb1>ARR_Tb2 ){
            System.out.println("\nAvg of Arr1  >  Avg of Arr2");
        }else if(ARR_Tb1<ARR_Tb2){
             System.out.println("\nAvg of Arr2  >  Avg of Arr1");
        }else {
            System.out.println("\nBye");
        }
    }
}
