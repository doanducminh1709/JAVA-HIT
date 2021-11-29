
package Bai2;
import java.util.Scanner;
public class Personael {
    private String PersonaelId;
    private String Name;
    private Date NS;
    Scanner sc = new Scanner(System.in);
    
   public void Inputs(){
       
        System.out.print("\tEnter Personael Id :");
        PersonaelId = sc.nextLine();
        System.out.print("\tEnter PersonealId Name : ");
        Name = sc.nextLine();
        System.out.println("Enter infor Date ");
         NS = new Date();
         NS.Inputs();    
        
    }
    public void Ouputs(){
        System.out.println("\tPersonael Id : " + PersonaelId);
        System.out.println("\tPersoneal Name :" + Name);
        NS.Ouputs();
    }
    
}
