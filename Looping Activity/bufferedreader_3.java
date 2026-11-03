import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bufferedreader_3 {
    public static void main (String[] args) throws IOException{

        BufferedReader khy = new BufferedReader(new InputStreamReader(System.in));

        double balance = 20000;
        double amount;

        while (true){

            System.out.print("Please enter if deposit or withdrawal (Enter 0 to stop): ");
            amount = Double.parseDouble(khy.readLine());

            if (amount == 0){
                break;
            }
            if (amount > 0) {
                balance += amount;
            } else {
                if (Math.abs(amount) <= balance) {
                    balance += amount;
                } else {
                    System.out.println("INSUFFICIENT FUNDS!");
                }
            }

            System.out.println("Outstanding Balance: " + balance);
        }
        System.out.println("Final Balance: " + balance);
    }
}
