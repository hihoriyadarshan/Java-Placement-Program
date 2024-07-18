// Create a class that captures students. Each student has a first name, last name, class year, and major. Create two examples of students.


package oocpsDay1;

public class Student2 {

    private String firstName;
    private String lastName;
    private String classYear;
    private String major;
  
    public Student2(String firstName, String lastName, String classYear, String major) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.classYear = classYear;
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student(" + firstName + " " + lastName + ", " + classYear + ", " + major + ")";
    }

    public static void main(String[] args) {
        Student2 student1 = new Student2("John", "Doe", "Sophomore", "Computer Science");
        Student2 student2 = new Student2("Jane", "Smith", "Senior", "Biology");

        System.out.println(student1);
        System.out.println(student2);
    }
}
