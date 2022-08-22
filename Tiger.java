
public class Tiger extends Felidae{
    //Constructor
    public Tiger(String name, int age, float weight){
        super(name, age, weight);
    }
    
    //Main method 
    public static void main(String[] args){
        Tiger myTiger = new Tiger("Mr. Tiger", 10, 100);
        
        System.out.println(myTiger.getName());
        myTiger.run();
        myTiger.meow();
    }
}