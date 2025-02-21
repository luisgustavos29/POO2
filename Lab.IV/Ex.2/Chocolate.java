public class Chocolate extends DecoradorBebida{
    public Chocolate(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + " com Chocolate";
    }

    @Override
    public double calculaCusto() {
        return bebida.calculaCusto() + 0.7;
    }
}
