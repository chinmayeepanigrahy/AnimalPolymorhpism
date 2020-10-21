
package arv;


public class Dog  extends Animal1{
    String insuranceCompany;

    public Dog(String insuranceCompany, String type, String food, int age, double price) {
        super(type, food, age, price);
        this.insuranceCompany = insuranceCompany;
    }
    
     public void makeNoise(){
        System.out.println("A dog barks");}

    @Override
    public String toString() {
        return super.toString()+"insuranceCompany=" + insuranceCompany ;
    }
}