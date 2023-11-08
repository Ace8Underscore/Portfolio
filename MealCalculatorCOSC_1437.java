/*
 * Pseudocode
 * get users input for all 4 sales
 * do calculations to get price for sold items separately then together
 * print out a message with all the found data
 *
 */

package org.example;

import java.util.Scanner;

public class MealCalculatorCOSC_1437 {

    // 1/25/23
    // Programming Fundamentals IICOSC-1437

    public static void main(String[] args) {
        // start our scanner so we can retrieve our users future inputs
        Scanner scan = new Scanner(System.in);
        int adultMealsBought, kidsMealsBought, cookiesBought, browniesBought;
        double adultMealsSalePrice, kidsMealsSalePrice, cookiesSalePrice, browniesSalePrice;

        //setting sales price for adult meals
        System.out.println("What was the sale price of the adult meals?");
        adultMealsSalePrice = scan.nextInt();

        //setting sales price for kids meals
        System.out.println("What was the sale price of the kids meals?");
        kidsMealsSalePrice = scan.nextDouble();

        //setting sales price for cookies
        System.out.println("What was the sale price of the cookies?");
        cookiesSalePrice = scan.nextDouble();

        //setting sales price for brownies
        System.out.println("What was the sale price of the brownies?");
        browniesSalePrice = scan.nextDouble();

        //promts the user to input how many adult meals were bought. once the input is detected it will store it.
        System.out.println("How many adult meals were bought?");
        kidsMealsBought = scan.nextInt();

        //promts the user to input how many kids meals were bought. once the input is detected it will store it.
        System.out.println("How many kids meals were bought?");
        adultMealsBought = scan.nextInt();

        //promts the user to input how many cookies were bought. once the input is detected it will store it.
        System.out.println("How many cookies were bought?");
        cookiesBought = scan.nextInt();

        //promts the user to input how many brownies were bought. once the input is detected it will store it.
        System.out.println("How many brownies were bought?");
        browniesBought = scan.nextInt();

        // Doing the math for info not calculating profit
        double adultMealsNonProfit = adultMealsBought * adultMealsSalePrice;
        double kidsMealsNonProfit = kidsMealsBought * kidsMealsSalePrice;
        double cookieNonProfit = cookiesBought * cookiesSalePrice;
        double brownieNonProfit = browniesBought * browniesSalePrice;
        double totalNonProfit = adultMealsNonProfit + kidsMealsNonProfit + cookieNonProfit + brownieNonProfit;

        // doing math for profit obtained
        double adultMealsProfit = adultMealsNonProfit - (adultMealsBought * 4.75);
        double kidsMealsProfit = kidsMealsNonProfit - (kidsMealsBought * 3.75);
        double cookieProfit = cookieNonProfit - (cookiesBought * .50);
        double brownieProfit = brownieNonProfit - (browniesBought * .75);
        double totalProfit = adultMealsProfit + kidsMealsProfit + cookieProfit + brownieProfit;

        // sending a message containing all the information
        System.out.println("Adult Meals Profit >> " + adultMealsProfit + "\n"
                + "Adult Meals Total Money >> " + adultMealsNonProfit + "\n"
                + "Kids Meals Profit >> " + kidsMealsProfit + "\n"
                + "Kids Meals Total Money >> " + kidsMealsNonProfit + "\n"
                + "Cookies Profit >> " + cookieProfit + "\n"
                + "Cookies Total Money >> " + cookieNonProfit + "\n"
                + "Brownies Profit >> " + brownieProfit + "\n"
                + "Brownies Total Money >> " + brownieNonProfit + "\n"
                + "Total Profit >> " + totalProfit + "\n"
                + "Total Money Collected >> " +totalNonProfit

        );


    }
}