
package arv;


public class Fish  extends Animal1{
    
    String colour;

    public Fish(String colour, String type, String food, int age, double price) {
        super(type, food, age, price);
        this.colour = colour;
    }
    
    public void makeNoise(){
////        System.out.println("A fish is silent");
System.out.println("a fish is silent" );
    }

    @Override
    public String toString() {
        return  super .toString()+ "colour=" + colour ;
    }
    
    
}
