/*
 Gets user input, and prints out all even numbers until it reaches 0
 */

import java.util.*;
public class evenNums {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Ask user input
        System.out.println("Enter a number: ");
        int x = input.nextInt();

        //Loop that prints out even numbers from input until 0 is reached
        while (x >= 0) {
            if (x % 2 == 0) {
                System.out.println(x);
            }
            x = x - 1;
        }
    }
}