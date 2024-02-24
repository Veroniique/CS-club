/*
Get input from user for the radius of a circle and calculate area
*/

import java.util.*;
public class AreaOfCircle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //prompt user to enter radius
        System.out.print("What is the radius? ");
        //Take input and assign it to the variable radius
        double radius = input.nextDouble();

        //Close Scanner object to prevent resource leak
        input.close();

        //Area of circle = PI * (r) ^ 2
        double area = Math.PI * Math.pow(radius, 2);

        //Prints area
        System.out.print("The area is: " + area);
    }
}