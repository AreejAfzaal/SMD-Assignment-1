/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3;

/**
 *
 * @author Dell
 */
class A
{
    protected void dothis()
    {
        System.out.println("Inside do this");
    }
    private void dothat()
    {
        System.out.println("Inside do that");
    }
    
}
class B extends A
{
    
}

public class Question3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         A object = new B();
        System.out.println("Object type B (child class)");
        object.dothis();
        //object.dothat(); Thows runtime exception because privatte method cant be accessed by child class
    }
    
}
