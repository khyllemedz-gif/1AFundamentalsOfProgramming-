import javax.swing.JOptionPane;
public class jOptionAssignment2 {
    public static void main (String[] args){

    double rate = Double.parseDouble(JOptionPane.showInputDialog("Enter your pay rate"));
    double pay = Double.parseDouble(JOptionPane.showInputDialog("Enter how many hours you work"));

    double gross = rate * pay;

    double tax;
    if(gross <= 2000){
        tax = 0.10;
    } else if (gross <= 4000) {
        tax = 0.12;
    } else if (gross <= 10000) {
        tax = 0.15;
    } else tax = 0.20;

    double withholding = gross * tax;
    double net = gross - withholding;

    String total = ("The total gross pay is " + gross + "\nThe withholding tax is " + withholding + "\nThe net pay is " + net);
    JOptionPane.showMessageDialog(null, total);

    }}
