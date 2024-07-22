package oocpsDay1;

import java.util.Scanner;

public class ClockDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter seconds since midnight: ");
        int secondsSinceMidnight = scanner.nextInt();
        Clock firstClock = new Clock(secondsSinceMidnight);

       
        for (int i = 0; i < 10; i++) {
            firstClock.tick();
            System.out.println("FirstClock after tick " + (i + 1) + ": " + firstClock);
        }

        
        System.out.print("Enter hours, minutes, and seconds for secondClock: ");
        int hours = scanner.nextInt();
        int minutes = scanner.nextInt();
        int seconds = scanner.nextInt();
        Clock secondClock = new Clock(hours, minutes, seconds);

        
        for (int i = 0; i < 10; i++) {
            secondClock.tick();
            System.out.println("SecondClock after tick " + (i + 1) + ": " + secondClock);
        }


        firstClock.addClock(secondClock);

       
        System.out.println("FirstClock after adding secondClock: " + firstClock);
        System.out.println("SecondClock: " + secondClock);

        
        Clock thirdClock = firstClock.subtractClock(secondClock);
        System.out.println("ThirdClock (difference between firstClock and secondClock): " + thirdClock);

        scanner.close();
    }
}
