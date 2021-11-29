
package Bai1;
import java.util.Scanner;
public class AirConditional extends Products{
     
    private int Wattage;
    private double Price;
    
    
      public AirConditional(int Wattage, double Price, String ProductID, String ProductName, String BrandName, int Date) {
        super(ProductID, ProductName, BrandName, Date);
        this.Wattage = Wattage;
        this.Price = Price;
    }
    
    public AirConditional(){}
    
    public AirConditional(int Wattage , double Price){
        this.Wattage = Wattage;
        this.Price = Price;
    }
  

    public int getWattage() {
        return Wattage;
    }

    public void setWattage(int Wattage) {
        this.Wattage = Wattage;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }
    
    Scanner sc = new Scanner(System.in);

    public void Inputs(){
        System.out.println("ENTER INFO AIR CONDITIONAL ");
        System.out.print("     Enter Watrage of Air Conditional : ");
        Wattage = sc.nextInt();
        
        System.out.print("     Enter Price ");
        Price = sc.nextFloat();
        super.Inputs();
        
    }
    public void Ouputs(){
        
        System.out.println("     Watrage of Air Conditional : " + Wattage);
        System.out.println("     Price of Air Conditional " + Price);
        super.Ouputs();
    }
    
}
