
package Bai2;
import java.util.Scanner;
import java.util.ArrayList;
public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book X = new Book();
        ArrayList<Book> books = new ArrayList<>();
        int choise;
        do {
            System.out.println(" =======> MENU <======= ");

            System.out.print("1. Add book\n" +
                            "2. Edit book by id\n" +
                            "3. Delete book by id\n" +
                            "4. Sort books by name (ascending)\n" +
                            "5. Sort books by price (descending)\n" +
                            "6. Show all books\n" +
                            "7. Exit.\n");
            System.out.print("Enter choise your self : ");
            choise = sc.nextInt();
            switch (choise) {
                case 1: {
                    AddBook( books);
                    break;
                }
                case 2: {
                    EditBookById(X,books);
                    break;
                }
                case 3: {
                    DeleteBookById(X, books);
                    break;
                }
                case 4: {
                    SortByName(X, books);
                    break;
                }
                case 5: {
                    SortByPrice(X, books);
                    break;
                }
                case 6: {
                    ShowListBook(X, books);
                    break;
                }
                case 7: {
                    ExitProgram();
                    break;
                }
                default:
                {
                    System.out.printf("%s", "YOUR CHOISE : ");
                    break;
                }
            }
        } while (choise != 0);
    }
   private static void AddBook( ArrayList<Book> books){
    Scanner sc = new Scanner(System.in);
    Book X = new Book();
       System.out.println("===> ENTER INFORMATION BOOKS <=== ");
           System.out.print("   Enter Id : ");
           X.setId(sc.nextInt());
           sc.nextLine();
           System.out.print("   Enter Name : ");
           X.setName(sc.nextLine());
           System.out.print("   Enter publisher : ");
           X.setPublisher(sc.nextLine());
           System.out.print("   Enter price : ");
           X.setPrice(sc.nextFloat());
           System.out.print("   Enter number of page : ");
           X.setNumberOfPage(sc.nextInt());
           sc.nextLine();
           System.out.print("   Enter Athour : ");
           X.setAthor(sc.nextLine());
           books.add(X);
   }
   private static void EditBookById(Book X , ArrayList<Book>books){
   Scanner sc = new Scanner(System.in);
       System.out.println("  Enter Id : ");
       int id = sc.nextInt();
       for(int i = 0 ; i < books.size() ; i++)
       {
           if(id == books.get(i).getId()){
               System.out.println(" PLEASE , ENTER WANT INFORMATION ");
               books.get(i).setId(id);
               sc.nextLine();
               System.out.println("   Enter Name : ");
               String name = sc.nextLine();
               books.get(i).setName(name);
               System.out.println("   Enter publisher : ");
               String Publisher = sc.nextLine();
               books.get(i).setPublisher(Publisher);
               System.out.println("   Enter Number of page : ");
               int NbOP = sc.nextInt();
               books.get(i).setNumberOfPage(NbOP);
               System.out.println("   Enter Price : ");
               Float Price = sc.nextFloat();
               books.get(i).setPrice(Price);
           }
       }
   }

   private static void DeleteBookById(Book X , ArrayList<Book>books){
       Scanner sc = new Scanner(System.in);
       System.out.println("  Enter Id want delete : ");
       int id = sc.nextInt();
       for(int i = 0 ; i < books.size() ; i++){
           if(id == books.get(i).getId()){
               books.remove(i);
           }else{
               System.out.println(" Id not invaline ");
           }
       }
   }
   private static void SortByName(Book X , ArrayList<Book>books) {
       int i, j;
       for (i = 0; i < books.size() - 1; i++) {
           for (j = books.size() - 1; j > i; j--) {
               if (books.get(j).getName().compareToIgnoreCase(books.get(j-1).getName()) < 0) {
                   Book temp = books.get(j);
                   books.set(j , books.get(j-1));
                   books.set(j-1, temp);
               }
           }
       }
   }

   private static void SortByPrice(Book X , ArrayList<Book>books){
       int i, j;
       for (i = 0; i < books.size() - 1; i++) {
           for (j = books.size() - 1; j > i; j--) {
               if (books.get(j).getPrice() > books.get(j-1).getPrice()) {
                   Book temp = books.get(j);
                   books.set(j , books.get(j-1));
                   books.set(j-1, temp);
               }
           }
       }

   }
   private static void ShowListBook(Book X , ArrayList<Book>books){
       System.out.println("                ===>INFORMATION LIST BOOK<=== ");
       System.out.printf("%-12s %-15s %-20s %-15s %-20s\n" , "ID" , "NAME" , "PUBLISHER" , "NUMBER" , "PRICE ");
       for(int i = 0 ; i < books.size() ; i++) {
           System.out.printf("%-13s %-15s %-20s %-10d %-7f",
                   books.get(i).getId(),
                   books.get(i).getName(),
                   books.get(i).getPublisher(),
                   books.get(i).getNumberOfPage(),
                   books.get(i).getPrice());
           System.out.println("\n");
       }
   }
   private static void ExitProgram(){
       System.out.println(" Thank you used to programer ");
       System.exit(0);
   }
}

