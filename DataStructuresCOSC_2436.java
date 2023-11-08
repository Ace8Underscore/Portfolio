package org.example;

import java.util.*;

public class DataStructuresCOSC_2436 {

    public static Queue<String> firstQueue = new PriorityQueue<>();

    public static Queue<String> secondQueue = new PriorityQueue<>();

    public static void main(String[] args) {

        firstQueue.add("George");
        firstQueue.add("Jim");
        firstQueue.add("John");
        firstQueue.add("Blake");
        firstQueue.add("Kevin");
        firstQueue.add("Michael");
        firstQueue.add("Walter");
        firstQueue.add("Angel");

        secondQueue.add("George");
        secondQueue.add("Katie");
        secondQueue.add("Kevin");
        secondQueue.add("Michelle");
        secondQueue.add("Ryan");
        secondQueue.add("Angel");


        System.out.println("Difference between first and second queues \n" + getDifference());

        System.out.println("Intersection between first and second queues \n\t" + getIntersection());

        System.out.println("Union between first and second queues \n\t" + getUnion());





    }

    public static String getDifference() {
        String s = "\tFirst queue contains ( ";

        //go through each string in the first queue and checks if its in the second queue if not it adds it to the above String
        for (String first : firstQueue) {
            if (!secondQueue.contains(first)) s += first + " ";
        }
        s += ") Which the second queue does not contain  \n\tSecond queue contains ( ";

        //go through each string in the second queue and checks if its in the first queue if not it adds it to the above String
        for (String second : secondQueue) {
            if (!firstQueue.contains(second)) s += second + " ";
        }

        s += ") Which the first queue does not contain \n";

        return s;
    }

    public static String getUnion() {
        String returnString = "";
        Queue<String> queue = new PriorityQueue<>();
        Set<String> union = new HashSet<>();

        //add first queue to a hashset so we filter out duplicates
        while (!firstQueue.isEmpty()) {
            union.add(firstQueue.poll());
        }

        //add second queue to a hashset so we filter out duplicates
        while (!secondQueue.isEmpty()) {
            union.add(secondQueue.poll());
        }

        //once done with that we add all elements from the hashset to a priority queue for sorting to highest priority
        for (String s : union) {
            queue.add(s);
        }

        //finally we convert the queue to a string
        while (!queue.isEmpty()) {
            returnString += queue.poll() + " ";
        }

        return returnString;
    }

    public static String getIntersection() {
        String intersection = "";

        //checks if second queue contains each String from firstQueue
        for (String s : firstQueue) if (secondQueue.contains(s) && !intersection.contains(s)) intersection += s + " ";

        //checks if first queue contains each String from secondQueue
        for (String s : secondQueue) if (firstQueue.contains(s) && !intersection.contains(s)) intersection += s + " ";


        return intersection + "\n";
    }


}