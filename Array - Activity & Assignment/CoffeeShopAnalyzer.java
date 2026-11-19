public class CoffeeShopAnalyzer{ //Ang CoffeeShop CoffeeShopAnalyzer ang pangalan ng program. Sa linyang ito ang angdedeklara ng class.
    public static void main(String[] args) { // dito inilalagay ang mga argument, paggawa ng mga code, o pagsisimula ng program.

        int [] weeklySales = {120,145,130,155,180,210,195};
        // Gagamit tayo ng int dahil puro numero ang nasa loob ng array. weeklySales ang pangalan ng array.

        String [] daysOfWeek = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        // Gagamit tayo ng String dahil dahil ang laman ng array ay mga texts o salita. daysOfWeek ang pangalan ng array.

        System.out.println("--- Daily Sales ---");
        // 'Eto ang mapri-print sa itaas na bahagi.

        for (int i = 0; i < weeklySales.length; i++) {
           /* Ginamit ang for loops para kapag nakakuha ng tamang sagot ay mada-dagdagan ito, hanngang sa maubos ang elements sa
            loob ng arrays */

            System.out.println(daysOfWeek[i] + " sales: " + weeklySales[i]);
            // Dito ginagamit ang parehong variables upang makuha ang tamang araw at sales.
        }

        int totalSales = 0;
        for (int dailySale : weeklySales) {
            totalSales += dailySale;
            // Ang totalSales mapupunta ang kabuuang sales.

        }

        double averageSales = (double) totalSales / weeklySales.length;
        // Dito ay kukunin ang average ng bawat sales. Dahil ang totalSales ay "int", gagamit tayo ng double upang ma-convert ito sa decimal.

        System.out.println("\n--- Weekly Summary ---"); // 'Eto ang header ng kabuuang sales at average ng sales.
        System.out.println("Total Sales: " + totalSales + " cups"); // Dito mapri-print ang kabuuang sales.
        System.out.println("Average Daily Sales: " + averageSales + " cups"); // Dito mapri-print ang average ng sales.


        int maxSales = weeklySales[0];
        int minSales = weeklySales[0];
          /* Dahil kailangan natin ng panimulang value para doon ipunta ang iba pang sales. At dahil ang unang
        araw ay Monday, ito rin ang ginamit nating starting day para sa bestDay at worstDay. */

        String bestDay = daysOfWeek[0];
        String worstDay = daysOfWeek[0];
        // Dito ay paghahambingin na 'tin silang dalawa. maxSales kapag bestDay at minSales naman kapag worstDay.

        for (int i = 1; i < weeklySales.length; i++) {
            /* Dahil ginamit na na 'tin kanina ang 0, ngayon naman ay gagamit tayo ng 1 kaya ito naging "i = 1".
            Ibig sabihin nito ay magsisimula tayo sa Tuesday at matatapos sa Sunday. */

            if (weeklySales[i] > maxSales) {
                maxSales = weeklySales[i];
                bestDay = daysOfWeek[i];
               // Kung ang kasalukuyang sales ay mas mataas kaysa sa kasalukuyang maxSales, papalitan nito ang maxSales at bestDay.
            }

            if (weeklySales[i] < minSales) {
                minSales = weeklySales[i];
                worstDay = daysOfWeek[i];
                // Kung ang kasalukuyang sales ay mas mababa kaysa sa minSales, papalitan natin ang minSales at worstDay.
            }
        }

        System.out.println("\n--- Bests and Worsts ---"); // 'Eto ang ipapakita sa itaas o header.
        System.out.println("Best day was " + bestDay + " with " + maxSales + " cups."); // Dito ipapakita ang bestDay at maxSales.
        System.out.println("Slowest day was " + worstDay + " with " + minSales + " cups."); // Dito ipapakita ang worstDay at minSales.
    }
}


