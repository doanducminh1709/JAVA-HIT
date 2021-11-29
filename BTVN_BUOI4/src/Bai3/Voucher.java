
package Bai3;
import java.util.Scanner;
public class Voucher {
  Scanner sc = new Scanner(System.in);
  private String VoucherId;
  
  private int n ;
  private Products[] product;
  
 

  public void Inputs(){  
      System.out.print("Enter n :");
      n = sc.nextInt();
      sc.nextLine(); 
      product = new Products[n]; 
      System.out.print("Enter VoucherId : ");
      
      VoucherId = sc.nextLine();
      for(int i = 0 ; i < n ; i++){
          product[i] = new Products();
          System.out.println("Enter info product td " +(i+1));
          product[i].Inputs();
      }
  }
  
  public void Ouputs(){
      System.out.println("Voucher Id :" + VoucherId);
      for(int i = 0 ; i < n ; i++)
      {
          System.out.println("===>Info product td " +(i+1));
          product[i].Ouputs();
      }
  }
  public void SumMoneyOfVoucher(){
      
      float SUM = 0;
      for(int i = 0 ; i < n ; i++)
      {
         SUM += product[i].ResultPriceProduct();
      }
      System.out.println("SUM OF MONEY IS "+ SUM + "$"  );
  }
}
