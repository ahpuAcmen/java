package factory_method.order;

import factory_method.pizza.BJCheesePizza;
import factory_method.pizza.BJPepperPizza;
import factory_method.pizza.Pizza;

public class BJOrderPizza extends OrderPizza {
    public BJOrderPizza() {
    }

    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new BJPepperPizza();
        }

        return (Pizza)pizza;
    }
}

