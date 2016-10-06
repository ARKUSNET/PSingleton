/**
 * Created by a.kuspakov on 06.10.2016.
 */
public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    private volatile static ChocolateBoiler uniqueInstance;

    private ChocolateBoiler(){
        empty = true;
        boiled = false;
    }

    public static ChocolateBoiler getInstance(){
        if (uniqueInstance == null) {
            synchronized (ChocolateBoiler.class) {
                uniqueInstance = new ChocolateBoiler();
                System.out.println("Unique Instance created");
            }
        }
        return uniqueInstance;
    }

    public void fill(){
        if (isEmpty()) {
            empty = false;
            boiled = false;
            System.out.println("Fill boiler milk chocolate juice");
        }
    }

    public void drain(){
        if(!isEmpty() && isBoiled()){
            System.out.println("Pour off hot milk and chocolate");
            empty = true;
        }
    }

    public void boil(){
        if (!isEmpty() && !isBoiled()){
            System.out.println("Bring the contents to the boil");
            boiled = true;
        }
    }


    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
