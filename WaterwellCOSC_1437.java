/**
 * get the users input for their well radius and well depth
 * do the math to determain how full their well is
 * formula pie * r^2*h
 * 3.14 * (wellRadius^2) * well height
 * then multiply that by the amount of water in a cubic foot
 * return to the console the amount of water stored in the well
 *
 */



package org.example;

import java.util.Scanner;

public class WaterwellCOSC_1437 {


    // 1/20/23
    // Programming Fundamentals IICOSC-1437

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int wellRadius;
        int wellDepth;

        System.out.println("What is the wells radius in feet?");
        wellRadius = input.nextInt();

        System.out.println("What is the wells depth in feet?");
        wellDepth = input.nextInt();

        double cubicFoot = 7.48;
        double amountOfWater = Math.pow(wellRadius, 2) * 3.14 * wellDepth * cubicFoot;
        System.out.println("There should be " + amountOfWater + " gallons in your well.");

    }
}