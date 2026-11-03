import javax.swing.*;

public class joptionpane_2 {
    public static void main (String[]args){

        String k = "  ";

         for (int y = 2; y <= 100; y+=2) {
             k += y + "  ";

             if (y % 20 == 0) {
                 k += "\n";
             }
         }

         JOptionPane.showMessageDialog(null, k);

    }
}
