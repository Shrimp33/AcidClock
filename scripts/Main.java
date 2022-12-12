import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
    final double m = 0.142;

        // Tesing Range of Operation

        // // From data, rate of change for water is 0.142
        // final double m = 0.142;
        // // Test inputs
        // for (int i = 10; i < 300; i++)
        // {
        //     boolean passed = true;
        //     Timer cTimer = new Timer(m, i);
        //     double[] calc = cTimer.stage();
        //     for (double n: calc)
        //         if (n < 0)  // Bro how do you add negative acid
        //             passed = false;
        //     System.out.println("Test for time " + i + "secs: " + passed);
        // }
        // // Runs times 10secs - 163secs

        Scanner input = new Scanner(System.in);
        System.out.print("Set Timer For x seconds: ");
        double t = input.nextDouble();
        input.close();

        Timer cTimer = new Timer(m, t);
        cTimer.calc();
    }
}
