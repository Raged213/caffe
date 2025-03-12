import java.util.*;

public class Barista {

    private ArrayList<Cup> orderHistory;


    public Barista() {
        orderHistory = new ArrayList<>();

    }

    public Cup serve(String name) {
        System.out.println("Here is your order:");

        return new Cup("dfdf");
    }

    public Cup serve(String name, Size size) {
        System.out.println("Here is your order:");
        return new Cup("dfdf");
    }

    public Cup serve(String name, Size size, boolean skum) {
        System.out.println("Here is your order:");
        return new Choco(name, size, skum);

    }




}
