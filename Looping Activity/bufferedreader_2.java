import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bufferedreader_2 {
    public static void main (String [] args) throws IOException{
       String khy = "";

        for (int k = 2; k <= 100; k +=2 ){
            khy += k + "  ";

            if (k % 20 == 0){
                khy += "\n";

            }
        }
        System.out.print(khy);
    }
}
