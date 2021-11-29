
package BAI3;
import java.util.Scanner;
public class Guns {
    static Scanner sc = new Scanner(System.in);
    private String weaponName;
    private int ammoNumber;
    
    Guns(){ }
    Guns(String weaponName , int amoNumber){
        this.weaponName = weaponName;
        this.ammoNumber = amoNumber;                
    }
    public void setWeaponeName(String weaponName ){
         this.weaponName = weaponName;
    }
    public String getWeaponName(){
        return  weaponName;
    }
    
    public void setAmmoNumber(int ammoNumber ){
         this.ammoNumber = ammoNumber;
    }
    public int getAmmoNumber(){
        return ammoNumber;
    }
    
    public void Load(int x){
        ammoNumber += x;     
    } 
    public void Shoot(int x){
     if(ammoNumber==0){
         System.out.println("Het dan");
     }else if(ammoNumber - x >=0){
    ammoNumber -= x;
   }
  }
}
