/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question2;

/**
 *
 * @author Dell
 */
 class Student { 
        void openRegistrationPage() 
        { 
           System.out.println("Registration period active");
           try{
                long coursesOfferred[] = new long[1000000000];     
            }catch(OutOfMemoryError error)
            {
                System.out.println("Error");
                throw error;
            }
        }
    }   

public class Question2 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Student currentStudent= new Student();   
         try
         {
            currentStudent.openRegistrationPage();  
         }catch(OutOfMemoryError error)
         {
            System.out.println("Caught in main");
         }
    }
    
}
