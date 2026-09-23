import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class labQuiz1 {
    public static void main(String[] args) {
        BufferedReader dataln = new BufferedReader(new InputStreamReader(System.in));
        try {

            System.out.print("Enter your Birth Year: ");
            String birthYearInput = dataln.readLine();

            int birthYear = Integer.parseInt(birthYearInput);
            System.out.println("You were born last: " + birthYear + ".");

            int age = (2026 - birthYear);
            System.out.println("You are now " + age + " years old");
        } catch (IOException e) {
            System.err.println("Error reading input stream.");
        } catch (NumberFormatException e) {
            System.err.println("Invalid number format! Please enter digits only.");



        }
    }}