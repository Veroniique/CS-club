/*
Create a Palindrome program to say if a word is a palindrome or not
Def palindrome - word that reads the same backwards as forwards
*/

import java.util.Scanner;
public class Palindrome {
    
    public static void main(String[] args) {
        //Auto-generated method stub
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your words: ");

        String word = input.next();
        boolean isPalindrome = true;

        int first = 0;
        int last = word.length() - 1;

        while(first<last) {
            if (word.charAt(first) != word.charAt(last)) {
                isPalindrome = false;
                break;
            }
            first ++;
            last--;
        }
        if (isPalindrome)
            System.out.println("It is a palindrome");
        else
            System.out.println("It is not a palindrome");
    }
}