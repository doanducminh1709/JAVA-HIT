package Bai1;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RunMain {
    static Scanner sc = new Scanner(System.in);
    static String username = "^[\\w]{6,}$";
    static String password = "^((?=.*[A-Z]).(?=.*[a-z])(?=.*[0-9])(?=.*[&^%$#@])).{8,}$";
    static String email = "[\\w]+[._a-zA-Z0-9!#$%&'*+-/=?^_`{|}~]*[a-zA-Z]*@[\\w]{2,8}.[a-zA-Z.]{2,6}";
    static String phone = "^[\\d]{10}$";
    static String createAt ="^(\\d{1,2})/(\\d{1,2})/(\\d{4})[ ](\\d{1,2}):(\\d{1,2}):(\\d{2})$";
    static List<ManagerUsers>users = new ArrayList<ManagerUsers>();
    static ManagerUsers user;

    public static void main(String[] args) throws  IOException{

        int choise;
        do{
            System.out.println("========>MENU<============");
            System.out.println("1.Tạo tài khoản mới .");
            System.out.println("2.Thay đổi tài khoản .");
            System.out.println("3.Sắp xếp danh  sách tăng dần theo user name.");
            System.out.println("4.Thoát chương trình.");
            System.out.print("Nhập vào lựa chọn của bạn : ");
            choise = sc.nextInt();
            switch (choise){
                case 1:
                {
                    CreateNewAccount();
                    break;
                }
                case 2:
                {
                    ChoseTwo();
                    break;
                }
                case 3:
                {
                    SortByUserName();
                    break;
                }
                case 4:
                {
                    Exit();
                    break;
                }
                default:
                {
                    System.out.println(" Lựa chọn không phù hợp vui lòng chọn lại !");
                    break;

                }
            }

        }while(choise != 0);
    }
    private static void CreateNewAccount() throws IOException {
        user = new ManagerUsers();
        long ID;
        System.out.println("Nhập Id : ");
        ID = sc.nextLong();
        for (int i = 0 ; i < users.size() ; i++) {
            if ( !CheckId(ID)){
                System.out.println(" Id đã trùng  !");
                return;
            }
        }
        user.setId(ID);
        sc.nextLine();
        System.out.println("Nhập Full name :");
        user.setFullName(sc.nextLine());
        System.out.println("Nhập User name :");
        user.setUsername(sc.nextLine());
//USER NAME
        Pattern pattern1 = Pattern.compile(username);
        Matcher matcher1 = pattern1.matcher(user.getUsername());
        if(!matcher1.find()) {
            System.out.println("Định dạng sai tên , Nhập lại : ");
            user.setUsername(sc.nextLine());
        }
//PASSWORLD
        System.out.println("Nhập password :");
        user.setPassword(sc.nextLine());
        Pattern pattern2 = Pattern.compile(password);
        Matcher matcher2 = pattern2.matcher(user.getPassword());

        if(!matcher2.find()){
            System.out.println("Định dạng sai mật khẩu , Nhập lại : ");
            user.setPassword(sc.nextLine());
        }
        String passWord;
        System.out.println("Xác nhận mật khẩu : ");
        passWord = sc.nextLine();
        if(passWord.compareToIgnoreCase(user.getPassword()) == 0){
            System.out.println(" Xác nhận thành công! ");
        }else{
            System.out.println(" Mật khẩu xác thực không đúng . Nhập lại!");
            passWord = sc.nextLine();
        }
//EMAIL
        System.out.println("Nhập email : ");
        user.setEmail(sc.nextLine());
        Pattern pattern3 = Pattern.compile(email);
        Matcher matcher3 = pattern3.matcher(user.getEmail());

        if(!matcher3.find()){
            System.out.println("Định dạng sai email , Nhập lại : ");
            user.setEmail(sc.nextLine());
        }
//PHONE
        System.out.println("Nhập số điện thoại :");
        user.setPhone(sc.nextLine());
        Pattern pattern4 = Pattern.compile(phone);
        Matcher matcher4 = pattern4.matcher(user.getPhone());

        if(!matcher4.find()){
            System.out.println("Định dạng sai sdt , Nhập lại : ");
            user.setPhone(sc.nextLine());
        }
//CREATE AT
        System.out.println("Nhập ngày giờ :");
        user.setCreateAt(sc.nextLine());
        Pattern pattern5 = Pattern.compile(createAt);
        Matcher matcher5 = pattern5.matcher(user.getCreateAt());

        if(!matcher5.find()) {
            System.out.println("Định dạng sai ngày, giờ . Nhập lại : ");
            user.setCreateAt(sc.nextLine());
        }
//ADD TO LIST
        users.add(user);
        FileWriter fileWriter = new FileWriter("ACC.DAT", false);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        PrintWriter printWriter = new PrintWriter(bufferedWriter);

        for (ManagerUsers u : users){
            printWriter.println(u.getId() +"|" + u.getFullName() + "|" + u.getUsername() + "|"
                    + u.getPassword() +"|" + u.getEmail() + "|"+ u.getPhone() +"|"+ u.getCreateAt());
        }
        printWriter.close();
        bufferedWriter.close();
        printWriter.close();

    }
    private static void showInfor(){

        for (int i = 0 ; i < users.size() ; i++){
            System.out.println("Id: "+ users.get(i).getId() +"\n"
                    + "Full Name :" + users.get(i).getFullName() + "\n"
                    + "User name :" + users.get(i).getUsername() + "\n"
                    + "Email : " + users.get(i).getEmail() + "\n"
                    + "Phone : " + users.get(i).getPhone() + "\n"
                    + "Create At : " +users.get(i).getCreateAt() );
        }
    }
    //Change password
    private static void changePassWord() throws IOException{
        sc.nextLine();
        System.out.println("Nhập vào mật khẩu mới :");
        user.setPassword(sc.nextLine());
        Pattern pattern2 = Pattern.compile(password);
        Matcher matcher2 = pattern2.matcher(user.getPassword());

        if(!matcher2.find()){
            System.out.println("Định dạng sai tên , Nhập lại : ");
            user.setPassword(sc.nextLine());
        }
        String passWord;
        System.out.println("Xác nhận mật khẩu : ");
        passWord = sc.nextLine();
        if(passWord.compareToIgnoreCase(user.getPassword()) == 0){
            System.out.println("Thay đổi mật khẩu thành công! ");

            FileWriter fileWriter = new FileWriter("Account.DAT");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);

            printWriter.println(passWord);

            printWriter.close();
            bufferedWriter.close();
            fileWriter.close();
        }else{
            System.out.println(" Mật khẩu xác thực không đúng . Nhập lại!");
            passWord = sc.nextLine();
        }

    }
    // Change pass
    private static void ChoseTwo() throws  IOException{
        String userName;
        sc.nextLine();
        System.out.println("Nhập username : ");
        userName = sc.nextLine();
        String password;
        System.out.println("Nhập password : ");
        password = sc.nextLine();
        if(userName.compareToIgnoreCase(user.getUsername())==0
                && password.compareToIgnoreCase(user.getPassword()) == 0){
            int chose;
            System.out.println("ĐĂNG NHẬP THÀNH CÔNG , CHỌN CÁC CHỨC NĂNG BẠN MUỐN. ");
            do{
                System.out.println("1.Hiển thị thông tin tài khoản \n" +
                        "2.Thay đổi mật khẩu"+"\n"+
                        "3.Thoát!");
                System.out.print("Nhập vào lựa chọn của bạn : ");
                chose = sc.nextInt();
                switch (chose){
                    case 1:
                    {
                        showInfor();
                        break;
                    }
                    case 2:
                    {
                        changePassWord();
                        break;
                    }
                    case 3:
                    {
                        break;
                    }
                    default:
                    {
                        System.out.println(" Lựa chọn không đúng , vui lòng chọn lại !");
                        break;
                    }
                }
            }while(chose!=3);
        }else{
            System.out.println(" Tên đăng nhập hoặc mật khẩu không đúng !");
        }
    }
    //SORT
    private static void SortByUserName(){

        Collections.sort(users, (o1, o2) -> o1.getUsername().compareTo(o2.getUsername()));

        for (int i = 0 ; i < users.size() ; i++){
            System.out.println("===>Danh sach "+(i+1));
            System.out.println("Id: "+ users.get(i).getId() +"\n"
                    + "Full Name :" + users.get(i).getFullName() + "\n"
                    + "User name :" + users.get(i).getUsername() + "\n"
                    + "Pass Word : "+ users.get(i).getPassword() + "\n"
                    + "Email : " + users.get(i).getEmail() + "\n"
                    + "Phone : " + users.get(i).getPhone() + "\n"
                    + "Create At : " +users.get(i).getCreateAt() );
        }
    }
    //EXIT
    private static void Exit(){
        System.exit(0);
    }

    private static boolean CheckId(long id){
        for (ManagerUsers i : users) {
            if (id == i.getId()) return false;
        }
        return true;
    }
}
