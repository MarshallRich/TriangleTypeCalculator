package com.theironyard;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static String sideChecker(int sideOne, int sideTwo, int sideThree) {
        if (sideOne == sideTwo && sideOne == sideThree){
            return "equilateral";
        }
        else if (sideOne == sideTwo || sideTwo == sideThree || sideOne == sideThree) {
            return "isoceles";
        }
        else {
            return "scalene";
        }
    }

    public static void main(String[] args) {
        System.out.println("Please enter the length of each side of the triangle one at a time.");

        //getting the first side
        System.out.println("Please enter the first side's length.");
        String line = scanner.nextLine();
        int sideOne = Integer.valueOf(line);

        //getting the second side
        System.out.println("Please enter the second side's length.");
        line = scanner.nextLine();
        int sideTwo = Integer.valueOf(line);

        //getting the third side
        System.out.println("Please enter the second side's length.");
        line = scanner.nextLine();
        int sideThree = Integer.valueOf(line);

        String triangleType = sideChecker(sideOne, sideTwo, sideThree);

        System.out.printf("The triangle is %s.\n", triangleType);
    }
}
