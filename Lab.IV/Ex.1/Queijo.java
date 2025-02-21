public class Queijo extends ToppingDecorator{
    public Queijo(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescricao() {
        return pizza.getDescricao() + " com Queijo";
    }

    @Override
    public double getPreco() {
        return pizza.getPreco() + 3.0;
    }
}
