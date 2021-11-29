
package Bai2;
import java.util.Scanner;
public class Date {
    Scanner sc = new Scanner(System.in);
    private int Day , Month , Year;
    
    public void Inputs(){
        System.out.print("\tEnter day :");
        Day = sc.nextInt();
         System.out.print("\tEnter month :");
        Month = sc.nextInt();
         System.out.print("\tEnter Year :");
        Year = sc.nextInt();
    }
    
    public void Ouputs(){        
        System.out.print("\tInfo Date :");
        System.out.println(Day + "\\" + Month + "\\"+Year);    
    }
}
