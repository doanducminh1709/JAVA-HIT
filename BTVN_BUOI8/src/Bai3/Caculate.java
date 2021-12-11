package Bai3;

import java.util.Scanner;

public class Caculate{
    static private int RateList[] = new int[3];
    static Scanner sc = new Scanner(System.in);

    public void InputRateList(){
    for(int i = 0 ; i < 3 ; i++){
        System.out.print(" Rate " + (i+1) +" is :");
        RateList[i] = sc.nextInt();
    }
    }

    public float ResultRatelist(){
        int average = 0;
       for(int i = 0 ; i < 3 ; i++){
           average += RateList[i];
       }
       return (float)average/3;
    }
}
