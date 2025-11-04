import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator{

    public static void main (String[] args){

        System.out.println("===MORTGAGE CALCULATOR===");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the load amount: ");
        int P = input.nextInt();
        System.out.print("Enter annual interest rate : ");
        float r = input.nextFloat();
        System.out.print("Enter Loan Period : ");
        float n = input.nextFloat();



     
        double M = P * ((r* Math.pow(1+r , n))/((Math.pow(1+r,n)) -1)); //total monthly mortgage amount
        double totally = M * (n*12) ;                                 // monthly payment
        double Interest = totally - M ;                                                         //total interest




        System.out.println();
        System.out.println();

        System.out.println("===Mortgage Summery===");



        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
        String formattedValue = currencyFormatter.format(P);
        System.out.println("Loan Ammout : " + formattedValue);

        String formattedMonthly = currencyFormatter.format(M);  //done
        System.out.println("Monthly Payment : " + formattedMonthly);

        String formattedYearly = currencyFormatter.format(totally);  //done
        System.out.println("Total Payment : " + formattedYearly);

        String formattedInterest = currencyFormatter.format(Interest);
        System.out.println("Total Interest : " + formattedInterest);
        

        
        

    }


}








    

