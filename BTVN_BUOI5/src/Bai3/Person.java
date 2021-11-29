package Bai3;
import java.util.Scanner;
public class Person {
    Scanner sc = new Scanner(System.in);
    protected String FullName;
    protected String Birthday;
    protected String Country;

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    public String getBirthday() {
        return Birthday;
    }

    public void setBirthday(String Birthday) {
        this.Birthday = Birthday;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public Person(){}
    
    public Person(String FullName, String Birthday, String Country) {
        this.FullName = FullName;
        this.Birthday = Birthday;
        this.Country = Country;
    }
   
   public void InputPerson(){
       
       System.out.print("      Enter Full Name  :"); 
       FullName = sc.nextLine();
       
       System.out.print("      Enter Birthay  :"); 
       Birthday = sc.nextLine();
       
       System.out.print("      Enter Country  :"); 
       Country = sc.nextLine();
       
   }
   public void OuputPerson(){

       
       System.out.print("    Full Name : " + FullName);  
       System.out.print("    Birthay  : " + Birthday);        
       System.out.print("    Country : " + Country ); 
       
   }
}
