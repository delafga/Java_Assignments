
public class Animal{
    
    //Variables
    protected String name;
    protected int age;
    protected float weight;
    
    //Constructor
    public Animal(String animalName, int animalAge, float animalWeight){
        this.name = animalName;
        this.age = animalAge;
        this.weight = animalWeight;
    }
    
    //Methods
    public String getName(){
        return this.name;
    }
    public void setName(String newName){
        this.name = newName;
    }
    
    public int getAge(){
        return this.age;
    }
    public void setAge(int newAge){
        this.age = newAge;
    }
    public float getWeight(){
        return this.weight;
    }
    public void setWeight(float newWeight){
        this.weight = newWeight;
    }
    public void eat(){
        System.out.println("Animal eating...");
    }
    public void run(){
        System.out.println("Animal running...");
    }
}
