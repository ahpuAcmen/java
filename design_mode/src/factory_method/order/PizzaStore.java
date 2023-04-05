package factory_method.order;

public class PizzaStore {
    public PizzaStore() {
    }

    public static void main(String[] args) {
        String loc = "bj";
        if (loc.equals("bj")) {
            new BJOrderPizza();
        } else {
            new LDOrderPizza();
        }

    }
}
