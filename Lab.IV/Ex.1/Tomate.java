public class Tomate extends ToppingDecorator{
    public Tomate(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescricao() {
        return pizza.getDescricao() + " com Tomate";
    }

    @Override
    public double getPreco() {
        return pizza.getPreco() + 2.0;
    }
}
