package factory_method.pizza;

public class BJCheesePizza extends Pizza {
    public BJCheesePizza() {
    }

    public void prepare() {
        this.setName("北京的奶酪pizza");
        System.out.println(" 北京的奶酪pizza 准备原材料");
    }
}
