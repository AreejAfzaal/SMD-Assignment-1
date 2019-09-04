/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question5;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Dell
 */
interface MainAppInterface
{
    void ExitGame();
    void ContinuePlaying();
    void ErrorMessage();
}

class MainApp implements MainAppInterface
{
    MainApp()
    {
        System.out.println("In main app constructor");
    }
    void setProcessAListener(ProcessA pA)
    {
        pA.setListener(this);
    }
            
    @Override
    public void ExitGame()
    {
         //System.out.println("Exit the Game");
    }
    @Override
    public void ContinuePlaying()
    {
         //System.out.println("Continue Playing Game");
    }
    @Override
    public void ErrorMessage()
    {
        System.out.println("Stop Wasting Time");
    }
}

class ProcessA
{
    private MainAppInterface mainI;
    ProcessA()
    {
        System.out.println("In process A constructor");
    }
    void setListener(MainAppInterface mainI)
    {
        this.mainI = mainI;
    }
    void exitgame()
    {
        System.out.println("Exit Game");
        mainI.ExitGame();
    }
     void continuegame()
    {
        System.out.println("Continue Game");
        mainI.ContinuePlaying();
    }
    boolean user_input()
     {
         mainI.ErrorMessage();
         boolean flag = true;
         System.out.println("Press 1 to exit or Press 2 to Continue Playing");
         Scanner in = new Scanner(System.in);
         int number = in.nextInt();
         if (number == 1)
         {
             exitgame();
             flag = false;
         }
         else if (number == 2)
         {
             continuegame();
             flag = true;
         }
         else
         {
             System.out.println("Incorrect choice");
             flag = true;
         }
         return flag;
     }
}

public class Question5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
         MainApp mapp = new MainApp();
        
        ProcessA pA = new ProcessA();
        mapp.setProcessAListener(pA);
        
        Boolean bool=true;
        
        while(bool) //assuming process is running
        {
             bool=pA.user_input();
             if(bool){
                TimeUnit.SECONDS.sleep(60);
             }
        }
        
    }
    
}
