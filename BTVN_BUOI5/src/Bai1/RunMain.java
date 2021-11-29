
package Bai1;
import java.util.Scanner;
import java.util.ArrayList;
public class RunMain {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n ;
        System.out.print("Enter n : ");
        n = sc.nextInt();
        
        ArrayList<AirConditional>List_pr= new ArrayList<>();
        
        for(int i = 0 ; i < n ; i++)
        {
           AirConditional nb = new AirConditional();
            System.out.println("Enter AirConditonal " + (i+1));
            nb.Inputs();
            List_pr.add(nb);
        }
        System.out.println("=====> SHOW RESULT <=====");
        CheckFunction(List_pr , "Electrolux");
    }
    public static void CheckFunction(ArrayList<AirConditional>List_pr , String BrandElectrolux){
        
        double MinPrice = List_pr.get(0).getPrice();
        int mark = 0;
      
        
        for(int i = 0 ; i < List_pr.size() ; i++){
            if(List_pr.get(i).getPrice()< MinPrice){
                MinPrice = List_pr.get(i).getPrice();
            }
        }
        
        for(int i = 0 ; i < List_pr.size() ; i++){
            if(List_pr.get(i).getPrice() == MinPrice &&
               List_pr.get(i).getBrandName().compareTo(BrandElectrolux) == 0){
              
                List_pr.get(i).Ouputs(); mark = 1;
            }
        }
        if(mark == 0){
            System.out.println("Does not exits brand Electrolux");
            return;
        }
        
    }
}
