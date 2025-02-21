public class Ovo extends ToppingDecorator{
    public Ovo(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescricao() {
        return pizza.getDescricao() + " com Ovo";
    }

    @Override
    public double getPreco() {
        return pizza.getPreco() + 1.5;
    }
}
