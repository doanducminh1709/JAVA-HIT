
package Bai3;
import java.util.Scanner;
public class Products {
   private String ProductId;
   private String ProductName;
   private float PriceProduct;
   Scanner sc = new Scanner(System.in);
   
   public void Inputs(){
       System.out.print("\tEnter  Product Id :");
        ProductId = sc.nextLine();
        System.out.print("\tEnter Product Name :"); 
        ProductName = sc.nextLine();
        System.out.print("\tEnter price product :");
        PriceProduct = sc.nextFloat();
   }
   public float ResultPriceProduct(){
//       System.out.println(PriceProduct);
       return PriceProduct;
}
   public void Ouputs(){
       System.out.println("\tProduct Id :" + ProductId);
       System.out.println("\tProduct Name :"+ ProductName);
       System.out.println("\tPriceProduct :" +PriceProduct);
   }
}
