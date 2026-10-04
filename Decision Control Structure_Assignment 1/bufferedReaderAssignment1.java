import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bufferedReaderAssignment1 {
    public static void main (String[] args) throws IOException{

        BufferedReader kylle = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a year: ");
            int year = Integer.parseInt(kylle.readLine());
            int leap = year/4;
            if (leap * 4 == year) {
                System.out.println("Year " + year + " is a leap year.");
            }else{
                    System.out.println("Year " + year + " is not a leap year.");}




    }
}

