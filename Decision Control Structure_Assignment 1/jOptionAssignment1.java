import javax.swing.JOptionPane;
public class jOptionAssignment1 {
    public static void main (String[] args){

        String kylle = JOptionPane.showInputDialog("Enter a year");
        int year = Integer.parseInt(kylle);

        int leap = year / 4;

        if(leap * 4 == year) {
            JOptionPane.showMessageDialog(null, "The year " + year + " is a leap year.");
        }else{
            JOptionPane.showMessageDialog(null, "The year " + year + " is not a leap year.");
        }
    }
}
