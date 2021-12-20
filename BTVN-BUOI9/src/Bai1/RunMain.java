package Bai1;
import java.util.*;

public class RunMain {
    static Scanner sc = new Scanner(System.in);
    static List<Person> person = new ArrayList<>();
    public static void main(String[] args) {
        Person X = new Person();
        Input();
        Collections.sort(person);
        person.forEach(person1 ->{
            System.out.println(person1.toString());
        } );
        System.out.println("\n-------------------\n");
        Collections.sort(person, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if(o1.getName().compareTo(o2.getName()) != 0){
                    return o1.getName().compareTo(o2.getName());
                }else{
                   return o2.getAddress().compareTo(o1.getAddress());
                }
            }
        });
        person.forEach(person2 ->{
            System.out.println(person2.toString());
        });
    }
    private static void Input(){

        try{
            int n;
            System.out.println(" Enter n : ");
            n = sc.nextInt();
            Person X[] = new Person[n];
            for (int i = 0 ; i < n ; i++){
                System.out.println("Enter infor " +(i+1));
                X[i] = new Person();
                sc.nextLine();
                System.out.println("Enter Id : ");
                X[i].setId(sc.nextLine());
                System.out.println("Enter name : ");
                X[i].setName(sc.nextLine());
                System.out.println("Enter address : ");
                X[i].setAddress(sc.nextLine());
                person.add(X[i]);
            }

        }catch (Exception e){
            System.out.println("lOI NHAP! ");
        }
    }
}
