package Ex2;

public class Currency {
    public Currency() {
    }
    public double Dollar_Euro(int a){
        return a* 0.88;
    }
    public double Euro_Dollar(int a){
        return a* 1.14;
    }
    public double GBP_Jena(int a){
        return a* 156;
    }
    public double Jena_GBP(int a){
        double b = a * 0.0064;
        return roundAvoid(b, 4);
    }
    public static double roundAvoid(double value, int places) {
        double scale = Math.pow(10, places);
        return Math.round(value * scale) / scale;
    }
}
