/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question6;

/**
 *
 * @author Dell
 */
interface Tricks
{
    void playDead();
    void chaseBall();
}

abstract class Animal
{
    void sleep()
    {
        System.out.println("Animal is sleeping");
    }
       void walk()
    {
        System.out.println("Animal is walking");
    }
    abstract void eatFood();
    abstract public void playWithIt();
}

class PetAnimals extends Animal implements Tricks
{
     @Override
      void eatFood()
      {
          System.out.println("Pet is eating food");
      }
      public void playWithIt()
      {
          System.out.println("Playing with pet ");
      }

     //@Override
    public void chaseBall() 
    {
        System.out.println("Pet is chasing ball");
    }

    // @Override
    public void playDead()
    {
        System.out.println("Pet is playing dead");
    }
}

class WildAnimals extends Animal
{
    @Override
      void eatFood()
      {
          System.out.println("Wild animal is eating food");
      }

    @Override
    public void playWithIt() {
    }
}

public class Question6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Animal pet = new PetAnimals();
        PetAnimals p =  new PetAnimals();
        System.out.println("Methods of Pet Class called:");
        p.walk();
        p.sleep();
        pet.eatFood();
        p.chaseBall();
        p.playDead();
        System.out.println("Methods of Wild Animal Class called:");
        Animal wild = new WildAnimals();
        wild.walk();
        wild.sleep();
        wild.eatFood();
    }
    
}
