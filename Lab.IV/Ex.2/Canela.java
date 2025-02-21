public class Canela extends DecoradorBebida{
    public Canela(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + " com Canela";
    }

    @Override
    public double calculaCusto() {
        return bebida.calculaCusto() + 0.3;
    }
}
