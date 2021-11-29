
package Bai2;
import java.util.Scanner;
public class DateTime {
    Scanner sc = new Scanner(System.in);
    protected  int Day;
    protected int Month;
    protected int Year;

    public DateTime(int Day, int Month, int Year) {
        this.Day = Day;
        this.Month = Month;
        this.Year = Year;
    }
    public DateTime(){
    }
    public int getDay() {
        return Day;
    }

    public void setDay(int Day) {
        this.Day = Day;
    }

    public int getMonth() {
        return Month;
    }

    public void setMonth(int Month) {
        this.Month = Month;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }
    
    public void InputDate(){
        System.out.println("Enter INFO DATE");
        System.out.print("      Enter Day : ");
        Day = sc.nextInt();
        System.out.print("      Enter Month : ");
        Month = sc.nextInt();
        System.out.print("      Enter Year : ");
        Year = sc.nextInt();
    }
    
    public void OuputDate(){
        System.out.println("INFO DATE " + Day + "\\" + Month + "\\" + "Year");   
    }
}
