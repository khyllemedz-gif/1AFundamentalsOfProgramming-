import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bufferedReaderAssignment4{
    public static void main (String[] args) throws IOException{

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter your height in cm: ");
            int height = Integer.parseInt(input.readLine());
            System.out.print("Enter your age: ");
            int age = Integer.parseInt(input.readLine());
            System.out.print("Are you a citizen of Planet Endor? Enter 'C' if yes and 'N' if not: ");
            String citizen = input.readLine();
            System.out.print("Are you an recommendee of Jebi Master Obi? Enter 'R' if yes and 'N' if not: ");
            String recommendee = input.readLine();

            if (recommendee.equals("R")) {
                System.out.println("Accepted");
            } else if (height >= 200 && age <= 25 && age >= 21 && citizen.equals("C")) {
                System.out.println("Accepted");
            } else System.out.println("Rejected");

        }}

