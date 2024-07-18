// Question 3


package oocpsDay1;

public class Student1 {

	//Data member
	private int rollno;
	private String name;
	
//	Setter method
	
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
// Getter method for rollno
		
	public int getRollno() {
	     return this.rollno;
		    }          


	public void setName(String name) {
		this.name = name;
		
	}
// Get method for name
	public String getName() { 
		return this.name;
	}
	
	
	public static void main(String[] args) {
		Student1 student = new Student1();
		
		student.setRollno(18);
		student.setName("Darshan");
		
		System.out.println("Roll No :" + student.getRollno());
		System.out.println("Name :" + student.getName());
	}
	
	}
