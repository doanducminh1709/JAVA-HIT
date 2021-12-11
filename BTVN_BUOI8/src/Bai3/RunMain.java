package Bai3;
import java.util.ArrayList;
import java.util.Scanner;
public class RunMain {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<News> news = new ArrayList<>();
    public static void main(String[] args) {
        int choise;
        do {
            System.out.println("======>MENU<======");
            System.out.println("1.Ensert news"+"\n2.View list news"
                    +"\n3.Average rate" + "\n4.Exit");
            System.out.print("Enter your choise : ");
            choise = sc.nextInt();

         switch (choise){
             case 1:
             {
                 Input();
                 break;
             }
             case 2:
             {
                 Ouput();
                 break;
             }
             case 3:
             {
                 AverageRate();
                 break;
             }
             case 4:
             {
                 ExitProgram();
                 break;
             }
             default:
             {
                 System.out.println();
                 break;
             }

         }
        }while (choise != 0);
    }
    private static void Input(){
        News hot = new News();
        sc.nextLine();
        System.out.print("Enter title : ");
        hot.setTitle(sc.nextLine());
        System.out.print("Enter publish Date : ");
        hot.setPublishDate(sc.nextLine());
        System.out.print("Enter author : ");
        hot.setAuthor(sc.nextLine());
        System.out.print("Enter content : ");
        hot.setContent(sc.nextLine());
        news.add(hot);
        Caculate X = new Caculate();
        System.out.println(" Enter 3 average rate ");
        X.InputRateList();
    }
    private static void Ouput(){
        for (int i = 0 ; i < news.size() ; i++) {
            System.out.println("\t===>Infor news " + (i+1));
            news.get(i).Display();
        }
    }
    private static void AverageRate(){
        for(int i = 0 ; i < news.size() ; i++){
            news.get(i).ResultRatelist();
            System.out.println("==============");
            news.get(i).Display();

        }
    }
    private static void ExitProgram(){
        System.out.println("\nThank you used service for us !");
        System.exit(0);
    }
}
