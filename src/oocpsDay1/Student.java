// Question 2

package oocpsDay1;

public class Student {
	private int rollno;
    private String name;

    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    public void getdata(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    public void display() {
        System.out.println("Roll No: " + rollno);
        System.out.println("Name: " + name);
    }

    
    public static void main(String[] args) {
    	Student student = new Student(18, "Darshan");

        // Display the data
        student.display();

      
    }

    
}
