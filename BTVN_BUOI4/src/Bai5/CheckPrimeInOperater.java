
package Bai5;

public class CheckPrimeInOperater {
    public static void main(String[] args) {
    System.out.println("------int------");
        System.out.println(isPrime(5));
        System.out.println(isPrime(9));
        System.out.println("------long------");
        System.out.println(isPrime(3l));
        System.out.println(isPrime(17l));
        System.out.println("------float----");
        System.out.println(isPrime(1.55f));
        System.out.println(isPrime(3.3f));
        System.out.println("-----double------");
        System.out.println(isPrime(7.1));
        System.out.println(isPrime(8.55));
 
        
    }
public static boolean isPrime(int n){
  
if(n<2) return false;
for(int i = 2 ; i*i<n;i++){
  if(n%i==0)   return false;
     }
     return true;
    }
public static boolean isPrime(long n){
     if(n == (int)n){
if(n<2) return false;
for(int i = 2 ; i*i<n;i++){
  if(n%i==0)   return false;
     }
     return n>1;
    }else{
         return false;
     }
}

public static boolean isPrime(float n){
   if(n == (int)n){
if(n<2) return false;
for(int i = 2 ; i*i<n;i++){
  if(n%i==0)   return false;
     }
     return n>1;
    }else{
         return false;
     }
}


public static boolean isPrime(double n){
if(n == (int)n){
if(n<2) return false;
for(int i = 2 ; i*i<n;i++){
  if(n%i==0)   return false;
     }
     return n>1;
    }else{
         return false;
     }
}
  }
