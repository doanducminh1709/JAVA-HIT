package BAI3;
import java.util.Random;
public class RunMain {
    
    public static void main(String[] args) {
      Guns nv1 = new Guns();
      Guns nv2 = new Guns();
      Random rd = new Random();
     
     
     nv1.setWeaponeName("Diep Be De");
      nv1.setAmmoNumber(100);
     
      nv2.setWeaponeName("Doan Xinh Gai");
      nv2.setAmmoNumber(100);
       
      while(nv1.getAmmoNumber() !=0 && nv2 .getAmmoNumber()!=0){
           // ban nhau  
             nv2 .Shoot(rd.nextInt(11));
             nv1.Shoot(rd.nextInt(11));
          if(nv1.getAmmoNumber() == 0 && nv1.getAmmoNumber() == 0){          
             nv1.Load(rd.nextInt(11));
             nv2 .Load(rd.nextInt(11));
          }else{
              
              if(nv1.getAmmoNumber() == 0 && nv2.getAmmoNumber() > 0){
                  System.out.println(nv1.getWeaponName() + " thua");
                  break;
              }      
               if(nv2.getAmmoNumber() == 0 && nv1.getAmmoNumber() > 0){
                  System.out.println(nv2.getWeaponName() + " thua");
                  break;
              }
                   
          } 
       }
    }

    @Override
    public String toString() {
        return "RunMain{" + '}';
    }
  }