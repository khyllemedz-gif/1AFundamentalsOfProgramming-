import javax.swing.JOptionPane;
public class labQuiz2 {
}
    public static void main(String[] args) {

        String name = "";
        name = JOptionPane.showInputDialog(" Welcome to Adobo Cooking Show! Enter your name ");

       Double kilo = JOptionPane.showInputDialog("How many kilo of pork will you cook? ");

        Double soy = 1;
        soy = JOptionPane.showInputDialog("The ratio of soy sauce for " + kilo + "kg" + " is ");

        String vinegar = "";
        vinegar = JOptionPane.showInputDialog("The ratio of vinegar for " + kilo + "kg" +  " is ");

        String msg = "Welcome to Adobo Cooking Show, " + name + "! " + "The standard ratio is " + soy + "cup of soy and " + vinegar + " cup of vinegar for every " + kilo + "kg" + " of pork.";
                JOptionPane.showMessageDialog(null, msg);
    }