import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MortgageCalculator{

    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("===MORTGAGE CALCULATOR===");

        System.out.print("Enter your Monthly Salary: ");  //salary
        int salary = 0;

        if ( input.hasNextInt()){
             salary = input.nextInt();
        } else {
            System.out.println("Invalied Data Type");
              input.close();
              return;
        }
        int anualSalary = salary * 12 ;


        System.out.print("Do you have any Criminal Record (true/false): ");  //criminal record
        boolean isCriminal = false ;

        if ( input.hasNextBoolean()){
             isCriminal = input.nextBoolean();
        } else {
            System.out.println("invalied Data Type");
              input.close();
              return;  //stops the program to avoid unnecessary calculations
        }

        System.out.print("Enter Credit Score (0 - 500): ");  //credit score
        int creditScore = 0;
        if ( input.hasNextInt()){
          creditScore = input.nextInt();
        } else {
            System.out.println("invalied Data Type");
              input.close();
              return;
        }

        System.out.print("Enter the loan amount: ");  //loan
        int P = 0 ;
        if (input.hasNextInt()) {
            P = input.nextInt();
        }else {
            System.out.println("Invalied Data Type");
              input.close();
              return;
        }



        if (P < (anualSalary * 2)  && isCriminal != true && creditScore > 300 ) {

        System.out.print("Enter annual interest rate(in % ) : ");   //annual interest rate
        float R = input.nextFloat();
        System.out.print("Enter Loan Period in Year : ");   //loan period
        int N = input.nextInt();
      

        double r = (R / 100) / 12 ;       //monthly interest
        int n = N * 12 ;                  //time in month

        double M = P * (r* Math.pow(1+r , (n)))/((Math.pow(1+r,(n)) -1)); //total monthly mortgage amount
        double totalPayment = M * n ;           //total payment 
        double Interest = totalPayment - P ;    //total interest                 

        System.out.println();
        System.out.println();
        System.out.println("=== Mortgage Summery ===");

        Locale bdCurrency = Locale.of("en", "BD");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(bdCurrency);

        System.out.println("Loan Amount : " + currencyFormatter.format(P));
        System.out.println("Monthly Payment : " + currencyFormatter.format(M));
        System.out.println("Total Payment : " + currencyFormatter.format(totalPayment));
        System.out.println("Total Interest : " + currencyFormatter.format(Interest));
        

        } if (creditScore <= 300) {
        System.out.println("Sorry! Your Credit Score must be above 300.");
    
        }  if (P > anualSalary * 2 ) {
        System.out.println("Sorry! Loan amount has to be less than twice of yours anual salary.");
    
        } if (isCriminal) {
        System.out.println("Sorry! You are not eligible. You must not have any criminal records.");
        } 

        input.close();
    }
}
