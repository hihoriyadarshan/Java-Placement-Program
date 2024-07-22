package oocpsDay1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;




public class Test_Address {
    public static void main(String[] args) {
        Constructor_Address address = new Constructor_Address();

      
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
        	 System.out.print("Enter Society Name: ");
             String socityName = br.readLine();
             address.setSocityName(socityName);

             System.out.print("Enter Area: ");
             String area = br.readLine();
             address.setArea(area);

             System.out.print("Enter Pincode: ");
             int pincode = Integer.parseInt(br.readLine());
             address.setPincode(pincode);

             System.out.println("Society Name: " + address.getSocityName());
             System.out.println("Area: " + address.getArea());
             System.out.println("Pincode: " + address.getPincode());
         } catch (IOException e) {
             e.printStackTrace();
         }
     }
 }