package factory_method.pizza;

public class LDPepperPizza extends Pizza {
    public LDPepperPizza() {
    }

    public void prepare() {
        this.setName("伦敦的胡椒pizza");
        System.out.println(" 伦敦的胡椒pizza 准备原材料");
    }
}
