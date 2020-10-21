
package arv;


public class Snake extends Animal1 {
    
    int length;
    double weight;
    String category;

    public Snake(int length, double weight, String category, String type, String food, int age, double price) {
        
        super(type, food, age, price);
        this.length = length;
        this.weight = weight;
        this.category = category;
    }

    public void makeNoise() {
        System.out.println("A snake hisses");
    }
  
    @Override
    public String toString() {
        return super.toString()+ "length=" + length + ", weight=" + weight + ", category=" + category ;
    }

    

    


    
}
   
    
    

