import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MortgageCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=== MORTGAGE CALCULATOR ===");

        //Monthly Salary 
        int salary = 0;
        while (true) {
            System.out.print("Enter your Monthly Salary: ");
            if (input.hasNextInt()) {
                salary = input.nextInt();

                if (salary > 0) {
                break;
                }else{ System.out.println("Salary must be positive.");
                }

            } else {
                System.out.println("Invalid Data Type");
                input.next();
            }
        }
        int annualSalary = salary * 12;


        //Criminal Record 
        boolean isCriminal = false;
        while (true) {
            System.out.print("Do you have any Criminal Record (true/false): ");
            if (input.hasNextBoolean()) {
                isCriminal = input.nextBoolean();
                break;
            } else {
                System.out.println("Invalid Data Type");
                input.next();
            }
        }


        //Credit Score 
        int creditScore = 0;
        while (true) {
            System.out.print("Enter Credit Score (0 - 500): ");
            if (input.hasNextInt()) {
                creditScore = input.nextInt();

                if (creditScore >= 0 && creditScore <= 500) {  //limiting the range of the credit score
                   break;
                }
                else { System.out.println("Credit score must be between 0 and 500.");}
            } else {
                System.out.println("Invalid Data Type");
                input.next();
            }
        }

  
        //Loan Amount 
        int P = 0;
        while (true) {
            System.out.print("Enter the loan amount: ");
            if (input.hasNextInt()) {
                P = input.nextInt();
                if (P > 0) {
                 break;
                }
                else {System.out.println("Loan amount must be positive.");}
            } else {
                System.out.println("Invalid Data Type");
                input.next();
            }
        }


        //Eligibility Check
        if (P < (annualSalary * 2) && !isCriminal && creditScore > 300) {

            // --- Interest Rate Input ---
            float R = 0;
            while (true) {
                System.out.print("Enter annual interest rate (in %): ");
                if (input.hasNextFloat()) {
                    R = input.nextFloat();

                    if (R > 0){
                     break;
                    } 
                    else {System.out.println("Interest rate must be positive.");}
                } else {
                    System.out.println("Invalid Data Type");
                    input.next();
                }
            }


            //Loan Period
            int N = 0;
            while (true) {
                System.out.print("Enter Loan Period in Years: ");
                if (input.hasNextInt()) {
                    N = input.nextInt();
                    if (N > 0) {
                      break;
                    }
                    else {System.out.println("Loan period must be positive.");}
                } else {
                    System.out.println("Invalid Data Type");
                    input.next();
                }
            }


            //Mortgage Calculation 
            double r = (R / 100) / 12; // monthly interest rate
            int n = N * 12; // total months
            double M = P * (r * Math.pow(1 + r, n)) / (Math.pow(1 + r, n) - 1); // monthly payment
            double totalPayment = M * n;
            double totalInterest = totalPayment - P;


            //Display Summary
            System.out.println("=== Mortgage Summary ===");
            Locale bdCurrency = Locale.of("en", "BD");
            NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(bdCurrency);

            System.out.println("Loan Amount    : " + currencyFormatter.format(P));
            System.out.println("Monthly Payment: " + currencyFormatter.format(M));
            System.out.println("Total Payment  : " + currencyFormatter.format(totalPayment));
            System.out.println("Total Interest : " + currencyFormatter.format(totalInterest));

        } else if (creditScore <= 300) {
            System.out.println("Sorry! Your Credit Score must be above 300.");
        } else if (P > annualSalary * 2) {
            System.out.println("Sorry! Loan amount must be less than twice your annual salary.");
        } else if (isCriminal) {
            System.out.println("Sorry! You are not eligible. You must not have any criminal records.");
        }

        input.close();
    }
}
