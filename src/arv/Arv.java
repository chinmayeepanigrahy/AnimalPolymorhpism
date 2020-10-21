
package arv;

import java.util.ArrayList;


public class Arv {
    
    static ArrayList<Animal1> zoo = new ArrayList<>();

    public static void main(String[] args) {
        Dog  dog2  = new Dog("Agaria","Dog","meat ,fish,chicken",3,5000);
//        this isnline wrote before arraylist
//        System.out.println("dog2");
         zoo.add(dog2);
        
        Fish fish2 = new Fish ("red","fish" ,"grains",4,3400);
//        System.out.println("fish2");
         zoo.add(fish2);
        
        
        Snake snake3 = new Snake (45,67, "land","snake", "chicken",5,56667);
//        System.out.println("snake3");
        zoo.add(snake3);
    
   
//        for (Animal animal : zoo) {
//            
//            if (animal instanceof Dog) 
//            {
//                ((Dog) animal).makeNoise();
//            } 
//            
//            else if (animal instanceof Fish) 
//            {
//                ((Fish) animal).makeNoise();
//            } 
//            else if (animal instanceof Snake) 
//            
//            {
//                ((Snake) animal).makeNoise();
//            }
//
//        }
  for (Animal1 animal : zoo)
  {
animal.makeNoise();    
    
    

}}
}
