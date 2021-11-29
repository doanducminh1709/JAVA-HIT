package Bai1;
    
import java.util.Scanner;
public class RunsMain {

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a , b , c;
        System.out.print("Nhap a : ");
        a = sc.nextInt();
        System.out.print("Nhap b : ");
        b = sc.nextInt();
        System.out.print("Nhap c : ");
        c = sc.nextInt();
        System.out.println(" Max trong 3 số : " + Max_So(a,b,c));    
     
    }
    public static int Max_So(int a, int b , int c){
        int max = a;
        if(b>max){
            max = b;
        }
        if(c>max){
            max = c;
        }
        return max;
        
       //  return Math.max(a, Math.max(b, c));
    }
}
