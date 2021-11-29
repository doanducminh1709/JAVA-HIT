
package Bai3;
import java.util.Scanner;
public class RunsMain {
       public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str ;
  
        System.out.print("Nhap vao chuoi : ");
        str = sc.nextLine();
       str = str+" ";
        int n = str.length();
        int i = 0 , SumNumber = 0 , temp ,  count = 0;     
           while(i<n){
           if(str.charAt(i) >='0' && str.charAt(i) <='9'){
            temp = Integer.parseInt(String.valueOf(str.charAt(i)));
            SumNumber += temp;
            count++; 
            }
            i++;
           }
          //c2 SumNumber +=temp;
          
           if(count != 0){
            System.out.println("true");
            float Tbc = (float)SumNumber/count;
            System.out.print("Tbc cac so trong chuoi la :" + Tbc);
            }else{
               System.out.println("false");
               System.out.println("Khong co ki tu so trong xau " );
         }
    }
}
