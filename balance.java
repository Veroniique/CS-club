package week1;
/*
Calculates how much money you owe a bank after 72 months,
with a compounded monthly interest rate of 12%, and a loan
of $568.21. Compound interest multiplies the new loan amount.
 */
public class balance {

    public static void main(String[] args) {
        int totalMonths = 72;
        double loan = 568.21;
        double interestRate = 1.12;
        for (int month = 1; month <= totalMonths; month ++) {
            loan = loan * interestRate;
        }
        System.out.println("loan = " + loan);
    }
    
}
