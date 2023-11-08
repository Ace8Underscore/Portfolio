package org.example;

import java.util.Scanner;

public class AddingRecursivelyCOSC_2436 {

    // 9/16/23
    //Programming Fundatmentals IIICOSC-2436

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstVal = 0;
        int secondVal = 0;

        //if the user 2nd value is smaller or equal to the first value the loop will start over asking for correct inputs
        while (firstVal >= secondVal) {
            System.out.println("Please Enter Your First Number(lower)");
            firstVal = scanner.nextInt();

            System.out.println("Please Enter Your Second Number(higher)");
            secondVal = scanner.nextInt();

            //checks to see if second value is higher than first if so we call the recursion method
            if (firstVal < secondVal) {
                System.out.println(sum(firstVal, secondVal));
            } else {

                System.out.println("Incorrect Input! Please make your first number smaller than the second!!");
            }
        }
    }

    public static int sum(int low, int high) {
        // if low and high are equal to each other we add them together and dont call the method again
        if (low == high) return low;
        // since we passed the above check we add low and high then we call the method with the
        // high variable being 1 smaller so we dont overflow

        //SHOULD RETURN 45!! with inputs of 5, 10
        return high + sum(low, high - 1);
    }


}