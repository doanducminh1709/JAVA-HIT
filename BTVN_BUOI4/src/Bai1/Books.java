
package Bai1;
import java.util.Scanner;
public class Books {
    
    private String BookId;
    private String BookName;
    private String Athour;
    private int BookPageNb;
    private float PriceBook;
    
    Scanner sc = new Scanner(System.in);
    public void Inputs(){
     
        System.out.print("\tEnter book id : ");
        BookId = sc.nextLine();
        System.out.print("\tEnter Book Name :");
        BookName = sc.nextLine();
        System.out.print("\tEnter Athourt Books :");
        Athour = sc.nextLine();
        System.out.print("\tEnter Book page Nb : ");
        BookPageNb = sc.nextInt();
        System.out.print("\tEnter Price Book :");
        PriceBook = sc.nextFloat();
        
    }
    public void Ouputs(){
        
        System.out.println("Book ID : " +  BookId);
        System.out.println("Book Name :" + BookName);
        System.out.println("Athout : " + Athour);
        System.out.println("BookPage Nb : " + BookPageNb);
        System.out.println("Prive Book : " + PriceBook);
    }
    
}
