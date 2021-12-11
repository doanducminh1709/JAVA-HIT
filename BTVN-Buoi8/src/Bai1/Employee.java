package Bai1;

public class Employee extends Person{
   private  int salary;


    public Employee(String name, String address, int salary) {
        super(name, address);
        this.salary = salary;
    }

    @Override
    void display() {
        System.out.println("Employee name : " + getName() + "\nEmployee address : "
                +getAddress() + "\nEmployee salary : " +this.salary);
    }
}
