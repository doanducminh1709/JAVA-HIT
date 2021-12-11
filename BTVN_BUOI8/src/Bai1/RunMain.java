package Bai1;

public class RunMain {
    public static void main(String[] args) {
        Person person1 = new Employee("Minh" , "Thanh Hoa" , 1709);
        Person person2 = new Customer("Khoa" , "Hung Yen" , 13245);
        person1.display();
        System.out.println("---------------");
        person2.display();
    }
}
