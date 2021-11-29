
package Bai3;

import java.util.Scanner;
public class Student extends Person{
    Scanner sc = new Scanner (System.in);
    
    private String studentId;
    private String Majors;//chuyen nganh 
    private int Course;//khoa hoc 

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getMajors() {
        return Majors;
    }

    public void setMajors(String Majors) {
        this.Majors = Majors;
    }

    public int getCourse() {
        return Course;
    }

    public void setCourse(int Course) {
        this.Course = Course;
    }

    public Student() { }
    public Student(String FullName, String Birthday, String Country , String studentId , String Majors , int Course) {
        super(FullName, Birthday, Country);
        this.Majors = Majors;
        this.studentId = studentId;
        this.Course = Course; 
    }
    
    public void Input(){
       
        System.out.print("      Enter Student Id : " ); 
        studentId = sc.nextLine();
        System.out.print("      Enter Majors : " );
        Majors =  sc.nextLine();
        System.out.print("      Enter course : ");
        Course = sc.nextInt();
        //input person 
        super.InputPerson();
    }
    public void Ouput(){
        
        
        System.out.print("      Student Id : " + studentId); 
       
        System.out.print("      Majors : " + Majors);
       
        System.out.print("      Course : "+ Course);
        
        super.OuputPerson();       
    }
    
   }
