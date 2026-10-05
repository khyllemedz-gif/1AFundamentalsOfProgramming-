import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class bufferedReaderAssignment3{
    public static void main (String[] args) throws IOException{

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("What is your parents' salary? ");
        int salary = Integer.parseInt(input.readLine());
        System.out.print("What is your NSAT score? ");
        int nsat = Integer.parseInt(input.readLine());
        System.out.print("What is your score in entrance exam? ");
        int exam = Integer.parseInt(input.readLine());

        double average = (nsat + exam)/2.0;

        if (salary <= 3500 && average >= 91){
            System.out.println("Accepted.");
        }else if (salary > 10000 || nsat < 90 || exam < 85){
            System.out.println("Rejected.");
        }else
            System.out.println("For further Study.");
    }
}


