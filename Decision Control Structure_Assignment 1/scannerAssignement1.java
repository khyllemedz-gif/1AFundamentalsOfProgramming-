import java.util.Scanner;
public class scannerAssignement1 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        int leap = year / 4;

        if(leap * 4 == year){
            System.out.println("The year " + year + " is a leap year");
        }else{
            System.out.println("The year " + year + " is not a leap year");
        }
    }
}
