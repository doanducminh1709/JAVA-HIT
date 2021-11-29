package Bai4;
import java.util.Scanner;
public class Machine {
  private String MachineId;
  private String StyleMachine;
  private String Stutus;
  Scanner sc = new Scanner(System.in);
 public void Inputs(){
     System.out.print("\tEnter information Machine : ");
     MachineId = sc.nextLine();
     System.out.print("\tEnter style Machine : ");
     StyleMachine = sc.nextLine();
     System.out.print("\tEnter Stutus Machine :");
     Stutus = sc.nextLine();
 } 
 public void  Ouputs(){
     
     System.out.println("\tInformation Machine : " +  MachineId );
    
     System.out.println("\tStyle Machine : " +StyleMachine);
    
     System.out.println("\tEnter Stutus Machine :" + Stutus);

 }
}
