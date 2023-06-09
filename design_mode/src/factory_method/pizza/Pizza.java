package factory_method.pizza;

public abstract class Pizza {
    protected String name;

    public Pizza() {
    }

    public abstract void prepare();

    public void bake() {
        System.out.println(this.name + " baking;");
    }

    public void cut() {
        System.out.println(this.name + " cutting;");
    }

    public void box() {
        System.out.println(this.name + " boxing;");
    }

    public void setName(String name) {
        this.name = name;
    }
}
