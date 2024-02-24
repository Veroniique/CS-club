/*
 Gets user to enter 2 numbers, then outputs it by swapping the 2 numbers around
 */

import java.util.*;
public class swapping {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Ask user input
        System.out.println("Specify a number for x: ");
        int x = input.nextInt();
        System.out.println("Specify a number for y: ");
        int y = input.nextInt();
        int z = x;

        //Asign input values to each other
        x = y;
        y = z;
        System.out.println(x);
        System.out.println(y);
    }
}