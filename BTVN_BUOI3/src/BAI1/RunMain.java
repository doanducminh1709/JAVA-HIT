package BAI1;
import java.util.Scanner;
public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person person1 = new Person("Minh" , 19 , "Nam" , "Bóng đá");
        System.out.println("Thong tin person1 :"+ person1);
        
        Person person2 = new Person();
//        person2.setName("Mai Anh");
//        person2.setAge(19);
//        person2.setGender("Nữ");
//        person2.setHobby("Mua sắm");
//        System.out.print("Thong tin person2 :" + person2);
//        System.out.println("\n");
        person2.setName(sc.nextLine());
        person2.setAge(sc.nextInt());
        sc.nextLine();//Xoa bo ki tu thua 
        person2.setGender(sc.nextLine());
        person2.setHobby(sc.nextLine());

      System.out.println("person2 " + person2);
      
//        System.out.print("Name :"+ person2.getName(sc.nextLine()));
//        System.out.print(", Age :" + person2.getAge());
//        System.out.print(", Gender : " + person2.getGender());
//        System.out.println(", Hobby :"+ person2.getHobby());
  
    }
    
}
