
package Bai2;
import java.util.Scanner;
public class RunsMain {

      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n; 
        System.out.printf("Nhap n : ");
        n = sc.nextInt();
        int arr[] = new int[n+1];
        int choise;
        do{
            System.out.println("\n=========>MENU<==========");
            System.out.println("1.Tạo và nhập mảng với n số nguyên");
            System.out.println("2.Hiển thị mảng vừa tạo ");
            System.out.println("3.Thêm 1 phần tử vào vị trí k bất kỳ");
            System.out.println("4.Xóa 1 phần tử tại vị trí k bất kỳ");
            System.out.println("5.Đảo ngược mảng");
            System.out.println("6.Hiển thị phần tử a[1] và các số chia hết cho a[1]");
            System.out.println("7.Xuất ra màn hình tổng các số nguyên tố có trong mảng");
            System.out.println("8.Thoát ");
            System.out.print("Nhap vao lua chon cua ban : ");
            choise= sc.nextInt();
           switch(choise){
               case 1:
               {
                input(arr,n);
               break;    
               }  
               case 2:
               {
                   System.out.print("Các phần tử của mảng là :");
                   ouput(arr,n);
               break;    
               }
               case 3:
               {
                   int pos , k;
                   do{
                       System.out.print("Nhập vào vị trí muốn chèn :");
                       pos = sc.nextInt();
                   }while(pos < 1 ||pos > n);
                   System.out.print("Nhập giá trị muốn chèn : ");
                   k = sc.nextInt();
                   
                   for(int i = n ; i > pos-1;i--){
                      arr[i] = arr[i-1];
                        }
                      arr[pos-1] = k; n++;
                     System.out.printf("Mảng sau khi thêm là :");
                     ouput(arr,n);
               break;    
               }  
               case 4:
               {
                   int m ;
                   do{
                   System.out.print("Nhập vào vị trí muốn xóa : ");
                   m = sc.nextInt();   
                   }while(m<0||m>n);
                   
                   for(int i = m-1;i<n-1;i++){
                     arr[i] = arr[i+1];
                     }
                    n--;
                    System.out.print("Mảng sau khi xóa : ");
                    ouput(arr,n);
                       break;    
                      }  
               case 5:
               {
                   System.out.printf("Mảng đảo là : ");
                   Dao_Mang(arr,n);
               break;    
               } 
               case 6:
               {
                   System.out.println("Giá trị của phần tử arr[1] và các số ptu chia hết arr[1]");
                   ShowValue(arr,n);
               break;    
               }
               case 7:
               {
               System.out.printf("Tổng các số nguyên tố là : "+ SumPrime(arr,n));
               break;    
               }  
               case 8:
               {
                   System.out.println("CẢM ƠN BẠN ĐÃ SỬ DỤNG CHƯƠNG TRÌNH! ");
                   ExitProgram();
               break;    
               } 
               default:
               {
                   System.out.println("Nhap cac lua chon tu 1 -> 8!");
                   break;
               }
              
               
           } 
            
    }while(choise != 0);
    }
    //1 hàm nhập mảng 
    public static void input(int arr[] , int n)
    {
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i < n ; i++){
            System.out.printf("Nhap a["+i+"] = ");
            arr[i] = sc.nextInt();
        }
    }
    //ham xuat mang 
    public static void ouput(int arr[] , int n){
        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i]+ " ");
        }
    }
    
 
 // : Dao nguoc mang 
     public static void Dao_Mang(int arr[] , int n){
        for(int i = n-1 ; i >=0 ; i--){
            System.out.print( arr[i]+ " ");
        }
    }
  //: hien thi a[1] va cac so chia het cho a[1]
     public static void ShowValue(int arr[] , int n){
         System.out.println("Arr[1] = " +arr[1]);
         System.out.print("Các giá trị là :");
         for(int i = 0 ; i < n ; i++){
             if(arr[i]%arr[1]==0)
                 System.out.print( arr[i]+" ");
         }
     }
     //xuat ra man hinh tong cac so nguyen to trong mang 
     //check Snt
     public static boolean Check_Prime(int n){
         if(n<2)return false;
         for(int i = 2 ; i*i<=n;i++){
             if(n%i==0) return false;
         }
//         return n>1;
         return true;
     }
     public static int SumPrime(int arr[] , int n){
                  int sum = 0;
         for(int i = 0 ; i < n ; i++){
            if(Check_Prime(arr[i])){
                sum+=arr[i];
            }
         }
         return sum;
     }
    //ham thoat khoi chuong trinh 
     public static void ExitProgram(){
          System.exit(0);
     }

}
