import javax.swing.JOptionPane;
public class jOptionAssignment4 {
    public static void main (String[] args){

        int height = Integer.parseInt(JOptionPane.showInputDialog("What is your height in cm?"));
        int age = Integer.parseInt(JOptionPane.showInputDialog("What is your age?"));
        String citizen = JOptionPane.showInputDialog("Are you a citizen of Planet Endor? Enter 'C' if yes and 'N' if not.");
        String recommendee = JOptionPane.showInputDialog("Are you a recommendee of Jedi Master Odi? Enter 'R' if yes and 'N' if not.");

        if(recommendee.equals("R")){
            JOptionPane.showMessageDialog(null,"Accepted");
        }else if (height >= 200 && age >= 21 && age <= 25 && citizen.equals("C")){
            JOptionPane.showMessageDialog(null,"Accepted");
        }else
            JOptionPane.showMessageDialog(null,"Rejected");

}}
