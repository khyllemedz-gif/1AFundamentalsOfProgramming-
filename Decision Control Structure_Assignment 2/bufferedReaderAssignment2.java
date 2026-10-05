import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class bufferedReaderAssignment2 {
    public static void main (String[] args) throws IOException {

        BufferedReader compute = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("What's your hourly pay rate? ");
        double rate = Double.parseDouble(compute.readLine());
        System.out.print("Enter how many hours you work: ");
        double hour = Double.parseDouble(compute.readLine());

        double gross = rate * hour;

        double tax;
        if (gross <= 2000) {
            tax = 0.10;
        } else if (gross <= 4000) {
            tax = 0.12;
        } else if (gross <= 10000) {
            tax = 0.15;
        }else {
            tax = 0.20;
        }
        double withholding = gross * tax;
        double net = gross - withholding;

        System.out.println("The total gross pay is " + gross);
        System.out.println("The withholding tax is " + withholding);
        System.out.println("The net pay is " + net);


    }

}
