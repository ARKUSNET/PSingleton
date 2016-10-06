/**
 * Created by a.kuspakov on 06.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        ChocolateBoiler chocolateBoiler = ChocolateBoiler.getInstance();
        (new ChocolateBoilerThread()).start(); //Create new Thread
        chocolateBoiler.fill();
        chocolateBoiler.boil();
        chocolateBoiler.drain();
    }
}
