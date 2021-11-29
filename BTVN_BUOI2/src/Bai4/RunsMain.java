package Bai4;
import java.util.Scanner;
import java.util.Arrays;
public class RunsMain {


    public String chuanHoa(String str) {
        str = str.trim();
        str = str.replaceAll("\\s+", " ");
        return str;
    }
 //chuanhoa
  public String chuanHoaChuHoaDau(String str) {
        str = chuanHoa(str);
        String temp[] = str.split(" ");
        str = ""; 
        for (int i = 0; i < temp.length; i++) {
            str += String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1);
            if (i < temp.length - 1)
                str += " ";
        }
        return str;
    }
  
  public static String conver(String str){
      StringBuffer sb = new StringBuffer(str);
      for(int i = 0 ; i < sb.length() ; i++)
      {
          if(sb.charAt(i) >='0' && sb.charAt(i) <='9'){
              sb.deleteCharAt(i);
              i--;
          }
      }
      return sb.toString();
  }
    public static void main(String[] sgr) {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi : ");
        str = sc.nextLine();
        str = conver(str);
        RunsMain chx = new  RunsMain();
        str = str.toLowerCase();
        str = chx.chuanHoaChuHoaDau(str);
        System.out.println(str);
    } 
} 
/*
C2:
public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập chuỗi: ");
        String str = sc.nextLine();

        System.out.println(exc(str));
    }

    public static String exc(String str) {
        //xóa số
        for(int i=0; i<str.length(); i++) {
            while(Character.isDigit(str.charAt(i))) {
                str = str.replace(String.valueOf(str.charAt(i)), "");
            }
        }

        //xóa khoảng trắng thừa : 2 cách dùng cách nào cx đc hết
        str = str.trim();
        while (str.contains("  ")){
            str = str.replaceAll("  ", " ");
        }
//        str = str.replaceAll("//s+", " ");

        str = str.toLowerCase();

        String[] a = str.split(" ");
        str = "";

        for (int i = 0; i < a.length; i++){
            str += String.valueOf(a[i].charAt(0)).toUpperCase() + a[i].substring(1);
            if (i < a.length - 1){
                str += " ";
            }
        }

        return str;
    }
    */