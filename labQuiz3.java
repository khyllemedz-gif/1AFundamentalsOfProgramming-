import javax.swing.JOptionPane;

public class labQuiz3 {
    public static void main(String[] args) {

        double oldSalary = Double.parseDouble(JOptionPane.showInputDialog("Enter old salary:"));

        double increase = oldSalary * 0.1775;
        double retroactivePay = increase * 2;
        double newSalary = oldSalary + increase;

        JOptionPane.showMessageDialog(null, "Retroactive Pay: ₱" + retroactivePay + "\nNew Salary: ₱" + newSalary);
    }
}
