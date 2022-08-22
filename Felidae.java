
public class Felidae extends Animal{
    
    //Producing the meowing sound
    public void meow(){
        System.out.println("Meow meow meow!");
    }
    
    
    //Constructor
    public Felidae(String name, int age, float weight){
        super(name, age, weight);
    }
}