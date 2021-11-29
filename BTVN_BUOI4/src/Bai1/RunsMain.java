
package Bai1;
import java.util.Scanner;
public class RunsMain {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n : ");
        int n = sc.nextInt();
         Books[] theBook = new Books[n];
         for(int i = 0 ; i < n ; i++)
         {
             System.out.println("Enter information of book " + (i+1));
             theBook[i] = new Books();
             theBook[i].Inputs();
         }
         for(int i = 0 ; i < n ; i++)
         {
             System.out.println("==>Information Book is "+(i+1));
             theBook[i].Ouputs();
         }
    }
    
}
