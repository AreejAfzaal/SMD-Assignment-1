/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1;
import java.util.ArrayList; 
import java.util.List; 
/**
 *
 * @author Dell
 */

class Employee
{
    char name;
    int EmpoyeeID;
    List<String> benefits = new ArrayList<String>();
    void calculatePay()
    {
        
    }
}
class Intern extends Employee
{
    int pay;
    Intern()
    {
        benefits.add("Basic benefits");
    }
    @Override
    void calculatePay()
    {
        System.out.println("Calculation of Intern's pay");
    }
}
class SoftwareDevelopers extends Employee
{
    int pay;
    SoftwareDevelopers()
    {
        benefits.add("Basic benefits+Dev Benefits");
    }
    @Override     
    void calculatePay()
    {
        System.out.println("Calculation of Software Developer's pay");
    }
}
class ProjectManagers extends Employee
{
    int pay;
    ProjectManagers()
    {
         benefits.add("Basic benefits+Dev Benefits+Manager Benefits");
    }
    @Override
    void calculatePay()
    {
        System.out.println("Calculation of Project Manager's pay");
    }
}

public class Question1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         List<Employee> e_list = new ArrayList<Employee>();
        Employee e1=new Intern();
        Employee e2=new SoftwareDevelopers();
        Employee e3=new ProjectManagers();
        e_list.add(e1);
        e_list.add(e2);
        e_list.add(e3);
        int total_Employees;
        total_Employees = e_list.size();
        for (int i =0 ; i < total_Employees; i++)
        {
            e_list.get(i).calculatePay();
        }
    }
    
}
