import javax.swing.JOptionPane;
public class joptionpane_1 {
    public static void main (String [] args) {

        int k, h = 0, l = 0;

        for (int i = 1; i <= 10; i++) {

            k = Integer.parseInt(JOptionPane.showInputDialog("Input a number " + i + ":"));

            if (k == 1) {
                h = k;
                l = k;
            }
            if (k > h) {
                h = k;
            }
            if (k < l) {
                l = k;
            }
        }
        JOptionPane.showMessageDialog(null, "Highest number: " + h + "\nLowest number: " + l);
    }}