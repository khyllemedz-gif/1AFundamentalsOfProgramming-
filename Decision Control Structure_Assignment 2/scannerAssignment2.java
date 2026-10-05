import java.util.Scanner;
public class scannerAssignment2 {
    public static void main (String[] args) {

        Scanner kylle = new Scanner(System.in);
        System.out.print("Enter your hourly pay rate: ");
        double rate = kylle.nextDouble();
        System.out.print("Enter how many hours you work: ");
        double hours = kylle.nextDouble();

        double gross = rate * hours;

        double tax;
        if (gross <= 2000) {
            tax = 0.10;
        } else if (gross <= 4000) {
            tax = 0.12;
        } else if (gross <= 10000) {
            tax = 0.15;
        } else
            tax = 0.20;

        double withholding = gross * tax;
        double net = gross - withholding;

        System.out.println("The total gross pay is " + gross);
        System.out.println("The withholding is " + withholding);
        System.out.println("The net pay is " + net);
    }}