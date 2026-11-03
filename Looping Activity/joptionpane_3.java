import javax.swing.*;

public class joptionpane_3{
    public static void main(String[] args) {

        double balance = 20000;
        double amount;

        while (true) {

            amount = Double.parseDouble(JOptionPane.showInputDialog("Please enter if deposit or withdrawal (Enter 0 to stop): "));

            if (amount == 0) {
                break;
            }
            if (amount > 0) {
                balance += amount;
            } else {
                if (Math.abs(amount) <= balance) {
                    balance += amount;
                } else {
                    JOptionPane.showMessageDialog(null, "INSUFFICIENT FUNDS!");
                }
            }
            JOptionPane.showMessageDialog(null, "Outstanding Balance: P" + balance);
        }
        JOptionPane.showMessageDialog(null, "Final Balance: P" + balance);
    }
}

