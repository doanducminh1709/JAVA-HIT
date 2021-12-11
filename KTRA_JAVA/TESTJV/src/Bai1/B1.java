
package Bai1;
import java.util.Scanner;
public class B1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str;
        System.out.print("Nhap vao 1 chuoi bat ki : ");
        str = sc.nextLine();
        str=str+" ";
        int sumNb = 0, temp1 , temp2 , Digit = 1 , i = 0 , j = 0 , sum = 0 , count = 0 , count2 = 0;
        int n = str.length();
        while(i < n ){
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                temp1 = Integer.parseInt(String.valueOf(str.charAt(i)));
                sumNb += temp1;
                count++;
            }else{
                sum += sumNb;
                sumNb = 0;
            }
            i++;
        }
        for(;j<n;j++){
            if(str.charAt(j) >= '0' && str.charAt(j) <= '9'){
                temp2 = Integer.parseInt(String.valueOf(str.charAt(j)));
                if(sum % temp2 == 0 ){
                    count2++;
                    Digit *= temp2;
                }
            }
        }
       if(count == 0){
           System.out.println("Không tồn tại kí tự số ở trong chuỗi");
       }else{
           System.out.println("Có " + count +" ký tự số ");
           if(count2 == 0){
               System.out.println("Không có số nào ước của tổng ");
           }else{
               System.out.println(" Tích " + Digit);
           }
       }
    }
}
