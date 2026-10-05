import java.util.Scanner;
public class scannerAssignment4 {
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your height in cm: ");
        int height = input.nextInt();
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        System.out.print("Are you a citizen of Planet Endor? Enter 'C' if yes and 'N' if not: ");
        String citizen = input.next();
        System.out.print("Are you a recommendee of Jedi Master Obi? Enter 'R' if yes and 'N' if not: ");
        String recommendee = input.next();

        if (recommendee.equals("R")) {
            System.out.println("Accepted");
        } else if (height >= 200 && age >= 21 && age <= 25 && citizen.equals("C")) {
            System.out.println("Accepted");
    }   else
            System.out.println("Rejected");



}}
