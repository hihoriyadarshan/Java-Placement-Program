package oocpsDay1;



public class Complex {
 private double realPart;
 private double imaginaryPart;

 // Default constructor
 public Complex() {
     this.realPart = 0;
     this.imaginaryPart = 0;
 }

 // Constructor with parameters
 public Complex(double realPart, double imaginaryPart) {
     this.realPart = realPart;
     this.imaginaryPart = imaginaryPart;
 }

 // Method to add two complex numbers
 public Complex add(Complex otherNumber) {
     double newReal = this.realPart + otherNumber.realPart;
     double newImaginary = this.imaginaryPart + otherNumber.imaginaryPart;
     return new Complex(newReal, newImaginary);
 }

 // Method to subtract two complex numbers
 public Complex subtract(Complex otherNumber) {
     double newReal = this.realPart - otherNumber.realPart;
     double newImaginary = this.imaginaryPart - otherNumber.imaginaryPart;
     return new Complex(newReal, newImaginary);
 }

 // Method to multiply two complex numbers
 public Complex multiply(Complex otherNumber) {
     double newReal = this.realPart * otherNumber.realPart - this.imaginaryPart * otherNumber.imaginaryPart;
     double newImaginary = this.realPart * otherNumber.imaginaryPart + this.imaginaryPart * otherNumber.realPart;
     return new Complex(newReal, newImaginary);
 }

 // Method to divide two complex numbers
 public Complex divide(Complex otherNumber) {
     double denominator = otherNumber.realPart * otherNumber.realPart + otherNumber.imaginaryPart * otherNumber.imaginaryPart;
     double newReal = (this.realPart * otherNumber.realPart + this.imaginaryPart * otherNumber.imaginaryPart) / denominator;
     double newImaginary = (this.imaginaryPart * otherNumber.realPart - this.realPart * otherNumber.imaginaryPart) / denominator;
     return new Complex(newReal, newImaginary);
 }

 // Setters and getters
 public void setRealPart(double realPart) {
     this.realPart = realPart;
 }

 public void setImaginaryPart(double imaginaryPart) {
     this.imaginaryPart = imaginaryPart;
 }

 public double getRealPart() {
     return realPart;
 }

 public double getImaginaryPart() {
     return imaginaryPart;
 }

 // toString method
 @Override
 public String toString() {
     if (imaginaryPart >= 0) {
         return realPart + " + " + imaginaryPart + "i";
     } else {
         return realPart + " - " + (-imaginaryPart) + "i";
     }
 }
}
