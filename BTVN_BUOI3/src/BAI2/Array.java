package BAI2;
import java.util.Scanner;
//import thư vien array vao 
import java.util.Arrays;
public class Array {
    private int []arr;
    private int n;
 
    Array(){}
    Array(int []arr , int n){
        this.arr= arr;
        this.n = n;
    }   
    public int getN(){
        return n;
    }
    public void setN(int n){
        this.n = n;
    }
//    public int getN(){
//        return n;
//    }
//
//    @Override
//    public String toString() {
//        return "Array{" + "arr=" + arr + ", n=" + n + '}';
//    }
    
    public int []getArr(){
    return arr;
}
   public void setArr(int arr[]){
        this.arr = arr;
    }  
   
   public void InputData(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        n = sc.nextInt();
        arr = new int[n];
        System.out.print("Enter array ");
     for(int i = 0 ; i < n ; i++){
         arr[i] = sc.nextInt();
  }
        System.out.println();
 }
     public void Show(){
         System.out.print("Array number is : ");
         for(int i : arr){
             System.out.print(i + " ");
         }     
        System.out.println();
     }
public void Show_(){
    System.out.print(Arrays.toString(arr));
    System.out.println("");
    //su dung phuong thuc ARRAY.TOSTRING DE HIEN CAC PHAN TU TRONG MANG HOAC CO THE DUNG FOR EACH 
    //FOR(int a :arr) ten kieu du lieu cung kieu voi mang : ten mang 
}
     public int CountNumber(){
         int count = 0;
          for(int i = 0 ; i < n ; i++){
            count++;
         }
          return count;
     }
     public int Sum(){
         int sum = 0;
          for(int i = 0 ; i < n ; i++){
            sum+=arr[i];
         }
         return sum;
     }
      public void  Filter(boolean flag){
//          Scanner sc = new Scanner(System.in);
//          boolean flag;
//          flag = sc.nextBoolean();
          System.out.print(" Array number satisfy : ");
           if(flag == true){
           for(int i = 0 ; i < n ; i++){
                   if(arr[i] % 2 == 0)
                   System.out.print(arr[i]+ " ");  
                } 
             }else{
                for(int i = 0 ; i < n ; i++){
                   if(arr[i] % 2 != 0)
                   System.out.print(arr[i]+ " ");  
               }

           }
       }

    }
    
