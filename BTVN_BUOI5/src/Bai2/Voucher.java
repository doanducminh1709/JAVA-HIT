
package Bai2;
import java.util.Scanner;
import java.util.ArrayList;
public class Voucher {
    
    private String VoucherId;
    private String VoucherName;
    private DateTime a ;
    private Product[]x;
    private int n;


    public String getVoucherId() {
        return VoucherId;
    }

    public void setVoucherId(String VoucherId) {
        this.VoucherId = VoucherId;
    }

    public String getVoucherName() {
        return VoucherName;
    }

    public void setVoucherName(String VoucherName) {
        this.VoucherName = VoucherName;
    }

    public DateTime getA() {
        return a;
    }

    public void setA(DateTime a) {
        this.a = a;
    }

    public Product[] getX() {
        return x;
    }

    public void setX(Product[] x) {
        this.x = x;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
  ArrayList<Product> prd;//prd:products
  
   public void InputVoucher(){
       Scanner sc = new Scanner(System.in);
       System.out.println("===>ENTER INFORMATION OF VOUCHER ");   
        System.out.print("    Enter voucher Id :");
        VoucherId = sc.nextLine();
       
        System.out.print("    Enter VoucherName :");
        VoucherName = sc.nextLine();
       //date
       a = new DateTime();
       a.InputDate();
       //product 
    
       System.out.print(" Enter number product : "); n = sc.nextInt();
       prd = new ArrayList<>(); 
       for(int i = 0 ; i < n ; i++){
           Product sp = new Product();
           System.out.println("Enter infor Product th : "+(i+1));
           sp.InputProduct();
           prd.add(sp);
       }  
       
    }
   
    public void OuputVoucher(){
       System.out.println("===>SHOW INFORMATION OF VOUCHER ");   
        System.out.println("  Voucher Id " + VoucherId);
  
        System.out.println("  VoucherName : " + VoucherName );

        for(int i = 0 ; i < n ; i++){
         System.out.println("==>Infor Product th : "+(i+1));
         prd.get(i).OuputProduct();
            System.out.println(" Result money sp"+ (i+1)  + " = " +  prd.get(i).ResulMoney());
        }  
    }
    
}
