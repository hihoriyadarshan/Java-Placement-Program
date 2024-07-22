package oocpsDay1;

public class MyClassDemo {
 public static void main(String[] args) {
     MyClass myObject1 = new MyClass(5);
     MyClass myObject2 = new MyClass(7);

     myObject1.printX();  
     myObject2.printX();  

     MyClass.printCount();  

     myObject1.incrementCount();  
     MyClass.printCount();  

     myObject2.incrementCount();
     MyClass.printCount();  
 }
}

 
