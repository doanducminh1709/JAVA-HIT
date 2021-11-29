package Bai4;
import java.util.Scanner;

public class EngineRoom {
    Scanner sc = new Scanner(System.in);
    private String RoomId;
    private String RoomName;
    private float RoomArea;     
    private int n;
    private Manager A;
    private Machine[] Y;
    
    public void Inputs(){
        System.out.print(" Enter n ");
        n = sc.nextInt();
        
        A = new Manager();
//enter infro engineroom
        sc.nextLine();
        System.out.println("Enter information engineroom ");
        System.out.print("\t Enter Room Id : "); RoomId = sc.nextLine();
        System.out.print("\t Enter Room Name : ");RoomName = sc.nextLine();
        System.out.print("\t Enter Roome Area : "); RoomArea = sc.nextFloat();
 //Enter manager
        A.Inputs();
 //Enter machine
          Y = new Machine[n];
         for(int i= 0 ; i < n ; i++)
         {
             Y[i] = new Machine();
             System.out.println("Enter infor Machine th " + (i+1));
             Y[i].Inputs();
         }

    }
    public void Ouput(){
        
        System.out.println("Information engineroom ");
        System.out.println("\tRoom Id : " + RoomId ); 
        System.out.println("\tRoom Name : " + RoomName);
        System.out.println("\tRoome Area : " + RoomArea);
        A.Ouputs();
         for(int i= 0 ; i < n ; i++)
         {
             System.out.println(" Infor Machine th " + (i+1));
             Y[i].Ouputs();
         }
    }
     
}

