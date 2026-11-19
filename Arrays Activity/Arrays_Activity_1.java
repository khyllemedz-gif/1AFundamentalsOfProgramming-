import java.util.Arrays; //Para gumana yung Arrays.deepToString, gagamit tayo ng import java.util.Arrays;.
public class Arrays_Activity_1 {
    public static void main(String[] args) {

        String[][] seats = { // Ilagay yung mga pangalan gamit ang curly brackets.
                {"Alice", "Bob", "Charlie"},
                {"David", "Emma", "Frank"}};

        System.out.println("Person in Row 2, Column 3: " + seats[1][2]);
  // Para malaman kung sino ang pangalawang row na pangatlong column, gagamit tayo ng seats[1][2].

        seats[0][1] = "Vacant"; // Palitan yung Bob ng Vacant

        System.out.println("Seating Arrangement: " + Arrays.deepToString(seats));
        //Gamitin yung Arrays.deepToString para ma-print yung output.
    }
}

