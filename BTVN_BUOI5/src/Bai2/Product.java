
package Bai2;
import java.util.Scanner;
public class Product {
    Scanner sc = new Scanner(System.in);
    private String ProductId;
    private String ProductName;
    private int Account;
    private float Price;


    public String getProductId() {
        return ProductId;
    }

    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    public int getAccount() {
        return Account;
    }

    public void setAccount(int Account) {
        this.Account = Account;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float Price) {
        this.Price = Price;
    }
    
public void InputProduct(){
    System.out.println("ENTER INFORMAION PRODUCT ");
    System.out.print("       Enter Product Id : ");
    ProductId = sc.nextLine();
    System.out.print("       Enter Product Name : ");
    ProductName = sc.nextLine();
    System.out.print("       Enter Account : ");
    Account = sc.nextInt();
    System.out.print("       Enter Price of product : ");
    Price = sc.nextFloat();
    
}
public void OuputProduct(){
    System.out.println("INFORMAION PRODUCT ");
    System.out.println("      Product Id : " + ProductId);
    System.out.println("      Product Name : " + ProductName); 
    System.out.println("      Account : " + Account);
    System.out.println("      Price of product : " + Price);
   }
public float ResulMoney(){
  return  Account*Price;
  }
}
