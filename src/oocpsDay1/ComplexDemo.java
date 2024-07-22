package oocpsDay1;


public class ComplexDemo {
 public static void main(String[] args) {
     
	 
     Complex num1 = new Complex(3, 4);
     Complex num2 = new Complex(1, 2);

 
     Complex sum = num1.add(num2);
     System.out.println("Sum: " + sum);

      Complex difference = num1.subtract(num2);
     System.out.println("Difference: " + difference);

 
     Complex product = num1.multiply(num2);
     System.out.println("Product: " + product);

 
     Complex quotient = num1.divide(num2);
     System.out.println("Quotient: " + quotient);

   
     num1.setRealPart(5);
     num1.setImaginaryPart(6);
     System.out.println("Updated num1: " + num1);

     System.out.println("Real part of num1: " + num1.getRealPart());
     System.out.println("Imaginary part of num1: " + num1.getImaginaryPart());
 }
}
