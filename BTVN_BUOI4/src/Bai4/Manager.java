package Bai4;
import java.util.Scanner;
public class Manager {
    
    Scanner sc = new Scanner(System.in);
    private String ManagerId;
    private String ManagerName;
    
    public void Inputs(){
         System.out.println("Enter information Manager");
         System.out.print("\tEnter  Manager Id :");
         ManagerId = sc.nextLine();
         System.out.print("\tEnter Manager Name :");
         ManagerName = sc.nextLine();
        
    }
    public void Ouputs(){
         System.out.println("\tManager Id :" + ManagerId);
         System.out.println("\tManager Name :" + ManagerName);
    }
}
