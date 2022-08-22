public class Student {    
  	String studentName;
  	String studentGender;
  	int studentAge;
  	int studentID;
  	
  	public Student(String name, String gender, int age, int id){
    	this.studentName = name;
        this.studentGender = gender;
        this.studentAge = age;
        this.studentID = id;
    }
    
    public String getStudentName(){
    	return this.studentName;
    }
    
    public void setStudentName(String newName){
    	this.studentName = newName;
    }
    
    public String getStudentGender(){
    	return this.studentGender;
    }
    
    public void setStudentGender(String newGender){
    	this.studentGender = newGender;
    }
    
    public int getStudentAge(){
    	return this.studentAge;
    }
    
    public void setStudentAge(int newAge){
    	this.studentAge = newAge;
    }
    
    public int getStudentID(){	
    	return this.studentID;
    }
    
    public void setStudentID(int newID){
    	this.studentID = newID;
    }
    
    public void displayStudentDetails(){
        System.out.println(this.getStudentName() + "\n" + 
        this.getStudentID() + "\n" + 
        this.getStudentAge() + "\n" + 
        this.getStudentGender()
        );
    }
} 
