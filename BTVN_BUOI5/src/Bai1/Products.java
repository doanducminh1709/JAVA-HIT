
package Bai1;
import java.util.Scanner;

public class Products {
    protected String ProductID;
    protected String ProductName;
    protected String BrandName;
    protected int Date;

    public String getProductID() {
        return ProductID;
    }

    public void setProductID(String ProductID) {
        this.ProductID = ProductID;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    public String getBrandName() {
        return BrandName;
    }

    public void setBrandName(String BrandName) {
        this.BrandName = BrandName;
    }

    public int getDate() {
        return Date;
    }

    public void setDate(int Date) {
        this.Date = Date;
    }
    public Products(){}
    public Products(String ProductID, String ProductName, String BrandName, int Date) {
        this.ProductID = ProductID;
        this.ProductName = ProductName;
        this.BrandName = BrandName;
        this.Date = Date;
    }
    Scanner sc = new Scanner(System.in);
   public void Inputs(){
       System.out.println("Enter Products ");
       System.out.print("    Enter product Id : ");
       ProductID = sc.nextLine();
       
       System.out.print("    Enter product Name : ");
       ProductName = sc.nextLine();
       
       System.out.print("    Enter Brand Name : ");
       BrandName = sc.nextLine();
       
       
       System.out.print("Enter Date : ");
       Date = sc.nextInt();
       
   } 
   public void Ouputs(){
       System.out.println("     Product Id : " + ProductID);
       System.out.println("     Product Name : " + ProductName);
       System.out.println("     BrandName "+ BrandName);
       System.out.println("     Date " + Date);
   }
    
}
