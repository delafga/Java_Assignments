
public class Main{
    public static void main(String[] args) {
        Student riel = new Student("Riel Dela Fuente", "M", 0, 100);
        Student jepthe = new Student("Jepthe Tan", "M", 22, 200);
        Student des = new Student("Desiree Anne Castro", "F", 23, 300);
        
        System.out.println(">> Testing set methods: \nBefore...");
        riel.displayStudentDetails();
        riel.setStudentName("Gabriel Dela Fuente");
        riel.setStudentAge(23);
        riel.setStudentID(400);
        System.out.println(">> After set methods: \nAfter...");
        riel.displayStudentDetails();
        
        System.out.println("\n\n\n>> Display class instances: ");
        des.displayStudentDetails();
        jepthe.displayStudentDetails();
        riel.displayStudentDetails();
    }
}
