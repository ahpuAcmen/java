package factory_method.pizza;

public class LDCheesePizza extends Pizza {
    public LDCheesePizza() {
    }

    public void prepare() {
        this.setName("伦敦的奶酪pizza");
        System.out.println(" 伦敦的奶酪pizza 准备原材料");
    }
}
