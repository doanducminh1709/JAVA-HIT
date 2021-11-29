
package Bai1;
import java.util.Scanner;
public class RunsMain {
    public static void main(String[] args) {
 
     Scanner scanner = new Scanner(System.in);
        int m , n;
        System.out.print(" Nhap  m : ");
        m = scanner.nextInt();
        System.out.print(" Nhap n : ");
        n = scanner.nextInt();
        
        for(int i = 1 ; i <= m ; i ++)
        {
            for(int j = 1 ; j <= n ; j++)
            {
                if(i == 1 || i == m || j == 1 || j == n){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println("\n");
        }
    }
}
