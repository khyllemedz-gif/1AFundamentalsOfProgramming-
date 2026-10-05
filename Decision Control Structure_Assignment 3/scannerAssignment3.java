import java.util.Scanner;
public class scannerAssignment3 {
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("What is your parents' salary? ");
        int salary = input.nextInt();
        System.out.print("What is your NSAT score? ");
        int nsat = input.nextInt();
        System.out.print("What is your score in entrance exam? ");
        int exam = input.nextInt();

        double average = (nsat + exam)/2.0;

        if(salary <= 3500 && average >= 91 ) {
            System.out.println("Accepted.");
        }else if (salary > 10000 || nsat < 90 || exam < 85) {
            System.out.println("Rejected.");
        }else
            System.out.println("For further study.");
    }

}
