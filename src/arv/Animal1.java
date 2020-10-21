
package arv;


public class Animal1 {
    
    String type;
    String food;
    int age;
    double price;

    public Animal1(String type, String food, int age, double price) {
        super();
        this.type = type;
        this.food = food;
        this.age = age;
        this.price = price;
    }
    
     public  void makeNoise(){}


    @Override
    public String toString() {
        return  "type=" + type + ", food=" + food + ", age=" + age + ", price=" + price ;
    }
    
    
}
