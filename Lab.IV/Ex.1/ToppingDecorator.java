public abstract class ToppingDecorator implements Pizza{
    protected Pizza pizza;

    public ToppingDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescricao() {
        return pizza.getDescricao();
    }

    @Override
    public double getPreco() {
        return pizza.getPreco();
    }
}
