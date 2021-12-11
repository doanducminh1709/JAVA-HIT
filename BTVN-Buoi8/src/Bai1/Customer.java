package Bai1;

public class Customer extends  Person{

    private int palance;

    public Customer(){}
    public Customer(String name, String address, int palance) {
        super(name, address);
        this.palance = palance;
    }

    @Override
    void display() {
        System.out.println("Employee name :" + getName() + "\nEmployee address :"
                +getAddress() + "\nEmployee salary : " +this.palance);
    }
}
