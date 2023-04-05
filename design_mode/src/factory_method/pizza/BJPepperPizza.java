package factory_method.pizza;

public class BJPepperPizza extends Pizza {
    public BJPepperPizza() {
    }

    public void prepare() {
        this.setName("北京的胡椒pizza");
        System.out.println(" 北京的胡椒pizza 准备原材料");
    }
}
