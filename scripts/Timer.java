public class Timer {
    // model equation of time by water clock as y = mx + b
    private double m;
    // period of time to calculate
    private double t; 
    // Contructor
    public Timer(double m, double t)
    {
        this.m = m;
        this.t = t;
    }
    /* 
     Assume Using "Cube Clock from packaged stl"
     Area1: 13.027cm^2
     Area2: 6.558cm^2
     Area3: 3.285cm^2
     Area4: 1.643cm^2
     Area5:1.586cm^2
     Heights increase from 3cm, 3.1cm, 3.2cm, to 3.3cm. 
     */

    private final double A1 = 13.027;
    private final double A2 = 6.558;
    private final double A3 = 3.285;
    private final double A4 = 1.643;
    private final double A5 = 1.586;

    public double[] stage()
    {
        double v = t/m; // Volume needed to express time
        double h1 = (3 * (A1 + A2)) - (v / (A1 + A2));
        double h2 = (3.1 * (A1 + A2 + A3)) - (v / (A1 + A2 + A3)) - h1;
        double h3 = (3.2 * (A1 + A2 + A3 + A4)) - (v / (A1 + A2 + A3 + A4)) - h1 - h2;
        double h4 = (3.3 * (A1 + A2 + A3 + A5)) - (v / (A1 + A2 + A3 + A5)) - h1 - h2 - h3;
        return new double[] {h1, h2, h3, h4};
    }

    public void calc()
    {
        double[] stages = stage();
        System.out.println(this.toString());
        System.out.println(" Compartment 1 & 2: " + stages[0] + "mL");
        System.out.println(" Compartment 2 & 3: " + stages[1] + "mL");
        System.out.println(" Compartment 3 & 4: " + stages[2] + "mL");
        System.out.println(" Compartment 4 & 5: " + stages[3] + "mL");
    }

    public String toString()
    {
        return "Timer volume calculations based on Cube Clock for " + t + " seconds";
    }
}
