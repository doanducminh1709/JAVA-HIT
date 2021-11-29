
package Bai3;
import java.util.Scanner;
import java.util.ArrayList;

public class Class {
    
    Scanner sc = new Scanner(System.in);
    private int ClassId;
    private String ClassName;
    private int StartDateOpen;
    
    private Student[]x;
    private Person GiaoVien;
    private int n;

    public Class(int ClassId, String ClassName, int StartDateOpen, Student[] x, Person GiaoVien, int n) {
        this.ClassId = ClassId;
        this.ClassName = ClassName;
        this.StartDateOpen = StartDateOpen;
        this.x = x;
        this.GiaoVien = GiaoVien;
        this.n = n;
    }
    public Class(){}
    public int getClassId() {
        return ClassId;
    }

    public void setClassId(int ClassId) {
        this.ClassId = ClassId;
    }

    public String getClassName() {
        return ClassName;
    }

    public void setClassName(String ClassName) {
        this.ClassName = ClassName;
    }

    public int getStartDateOpen() {
        return StartDateOpen;
    }

    public void setStartDateOpen(int StartDateOpen) {
        this.StartDateOpen = StartDateOpen;
    }

    public Student[] getX() {
        return x;
    }

    public void setX(Student[] x) {
        this.x = x;
    }

    public Person getGiaoVien() {
        return GiaoVien;
    }

    public void setGiaoVien(Person GiaoVien) {
        this.GiaoVien = GiaoVien;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    ArrayList<Student>sts;//sts students
    
   public void InputClass(){
      
       System.out.println("ENTER INFORMATION OF CLASS ");
       
       System.out.print("   Enter Class Id : "); ClassId = sc.nextInt();
       sc.nextLine();
       System.out.print("   Enter ClassName : ");ClassName = sc.nextLine();
       System.out.print("   Enter StartDate Open: "); StartDateOpen = sc.nextInt();
     
      
       GiaoVien = new Person();
        System.out.println("ENTER INFORMAITON OF TEACHER ");
       GiaoVien.InputPerson();
       sts = new ArrayList<>();
       
       System.out.println("ENTER INFORMATION OF STUDENT ");
       System.out.print(" Enter number student : ");
       n = sc.nextInt();
       sc.nextLine();
       
       for(int i = 0 ; i < n ; i++){
           System.out.println("\n Enter Info student td "+(i+1));
           Student std = new Student();
           std.Input();
           sts.add(std);
       }
       
   } 
   public void OuputClass(){
       System.out.println("===> INFORMATION OF CLASS ");
       System.out.println(" Class ID : " + ClassId);
       System.out.println(" Class Name :" + ClassName);
       System.out.println(" Start Date Open "+ StartDateOpen);
       
       System.out.println("INFORMAITON OF TEACHER ");
       GiaoVien.OuputPerson();
       for(int i = 0 ; i < n ; i++)
       {
          System.out.println("\nInfo student td "+(i+1));
          sts.get(i).Ouput(); 
       }     
   }

}
