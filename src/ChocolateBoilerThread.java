/**
 * Created by a.kuspakov on 06.10.2016.
 */
public class ChocolateBoilerThread extends Thread {
    public void run(){
        System.out.println("New Thread started work");
        ChocolateBoiler chocolateBoiler = ChocolateBoiler.getInstance();
        chocolateBoiler.fill();
        chocolateBoiler.boil();
        chocolateBoiler.drain();
    }
}
