
package Bai2;

public class Book extends Document{

    protected int Id;
    protected String Name;
    protected String Publisher;
    protected float Price;

    public Book() {
    }

    public Book(int numberOfPage, String athor) {
        super(numberOfPage, athor);
    }

    public Book(int id, String name, String publisher, float price) {
        Id = id;
        Name = name;
        Publisher = publisher;
        Price = price;
    }

    public Book(int numberOfPage, String athor, int id, String name, String publisher, float price) {
        super(numberOfPage, athor);
        Id = id;
        Name = name;
        Publisher = publisher;
        Price = price;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPublisher() {
        return Publisher;
    }

    public void setPublisher(String publisher) {
        Publisher = publisher;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float price) {
        Price = price;
    }
}
