package oocpsDay1;
import java.util.Scanner;

public class ArrayofEmployee {

	public  void CreateofEmp() {
		int[] no = new  int[12];
		Employee[] emp = new Employee[10];
		
		for (int i= 0; i<2; i++) {
			emp[i] = new employee();
			
		}
		
		for (int i = 0; i<2; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Name :");
			emp[i].setName(sc.next());
			System.out.println("Enter Email :");
			emp[i].setEmail(sc.next());
			
		}
			
			
		for (int i =0; i<5; i++) {
			System.out.println(emp[i]);
		}
		
	}
	
}
