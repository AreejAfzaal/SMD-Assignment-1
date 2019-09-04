/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question4;

/**
 *
 * @author Dell
 */
abstract class Student
{
    String name;
    int rollno;
    int numberOfCourses;
    int perCourseFee;
    Student(String n, int rn, int course, int fee)
    {
        name = n;
        rollno = rn;
        numberOfCourses = course;
        perCourseFee = fee;
    }
    abstract void calculatefee();
}

//Students with scholarship
//number of courses * per course fee. 
class TypeA extends Student
{
    double fee;
    TypeA(String name, int rollno, int numberOfCourses, int perCourseFee)
    {
        super(name, rollno ,numberOfCourses, perCourseFee);
        fee = 0;
    }
    @Override
    void calculatefee()
    {
        fee = numberOfCourses * perCourseFee;
        fee = 0.5 * fee;
         System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollno);
        System.out.println("Fee: " + fee);
    }
}
//full fee students
class TypeB extends Student
{
    double fee;
    TypeB(String name, int rollno, int numberOfCourses, int perCourseFee)
    {
        super(name, rollno ,numberOfCourses, perCourseFee);
        fee = 0;
    }
    @Override
    void calculatefee()
    {
        fee = numberOfCourses * perCourseFee;
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollno);
        System.out.println("Fee: " + fee);
    }
}

public class Question4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student s1 = new TypeA("ABC", 1234, 3, 2000); //sholarship
        Student s2 = new TypeB("XYZ", 5678, 3, 2000); //full fee
        System.out.println("Calculating fee for Scholarship Student");
        s1.calculatefee();
        System.out.println("Calculating fee for Full Fee Student");
        s2.calculatefee();
    }
    
}
