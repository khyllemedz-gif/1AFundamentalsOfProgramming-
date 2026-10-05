import javax.swing.JOptionPane;

public class jOptionAssignment3 {
    public static void main (String[] args){

        int salary = Integer.parseInt(JOptionPane.showInputDialog("What is your parents' salary?"));
        int nsat = Integer.parseInt(JOptionPane.showInputDialog("What is your NSAT score?"));
        int exam = Integer.parseInt(JOptionPane.showInputDialog("What is your score in the entrance exam?"));

        double average = (nsat + exam)/2.0;

        if(salary <= 3500 && average >= 91){
            JOptionPane.showMessageDialog(null,"Accepted.");
        }else if (salary > 10000 || nsat < 90 || exam < 85 ){
            JOptionPane.showMessageDialog(null,"Rejected.");
        }else JOptionPane.showMessageDialog(null,"For further study.");

    }
}
