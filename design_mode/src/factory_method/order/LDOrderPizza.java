package factory_method.order;

import factory_method.pizza.LDCheesePizza;
import factory_method.pizza.LDPepperPizza;
import factory_method.pizza.Pizza;

public class LDOrderPizza extends OrderPizza {
    public LDOrderPizza() {
    }

    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
        }

        return (Pizza)pizza;
    }
}
