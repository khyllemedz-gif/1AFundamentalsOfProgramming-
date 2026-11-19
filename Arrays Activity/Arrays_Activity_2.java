public class Arrays_Activity_2 {
    public static void main(String[] args) {

        double[] temperatures = new double[5]; // Gumamit ng double dahil ang mga value ay mga decimals.

        // Ilagay ang value bawat temperature.
        temperatures[0] = 32.5;
        temperatures[1] = 34.0;
        temperatures[2] = 31.8;
        temperatures[3] = 33.2;
        temperatures[4] = 35.1;

        // Para ma-print lahat ang temperatures, gagamit tayo ng temperatures.length;, para ma-print silang lahat, gagamit tayo ng loops.
        System.out.println("Temperatures for 5 Days:");
        for (int i = 0; i < temperatures.length; i++) {
            System.out.println("Day " + (i + 1) + ": " + temperatures[i]);
        }

        temperatures[2] = 32.0; // Ilagay yung bagong value ng pangatlong araw. Ang pangatlong araw ay ang temperatures[2].

        System.out.println("\nUpdated Temperature for Day 3: " + temperatures[2]); // I-print ang nabagong temperature.
    }
}


