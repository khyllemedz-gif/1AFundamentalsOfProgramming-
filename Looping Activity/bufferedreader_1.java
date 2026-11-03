import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bufferedreader_1 {
    public static void main(String[] args) throws IOException {

        BufferedReader k = new BufferedReader(new InputStreamReader(System.in));

        int y, high = 0, low = 0;
            for (int i = 1; i <= 10; i++){

                System.out.print("Input a number " + i + ": ");
                int khy = Integer.parseInt(k.readLine());

                if (khy == 1){
                    high = khy;
                    low = khy;
                }
                if (khy > high){
                    high = khy;
                }
                if (khy < low){
                    low = khy;
                }
        }
        System.out.println("Highest Number: " + high);
        System.out.println("Lowest Number: " + low);
    }
}
