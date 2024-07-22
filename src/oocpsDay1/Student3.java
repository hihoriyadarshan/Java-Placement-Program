package oocpsDay1;

public class Student3 {
    
    private String name;


    public Student3() {
        this.name = "Unknown";
    }

  
    public Student3(String name) {
        this.name = name;
    }

    
    public void printName() {
        System.out.println("Student Name: " + this.name);
    }

    public static void main(String[] args) {
  
        Student3 student1 = new Student3();
        student1.printName();  

        
        Student3 student2 = new Student3("Darshan");
        student2.printName();      }
}
