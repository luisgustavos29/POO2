public class Leite extends DecoradorBebida{
    public Leite(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + " com Leite";
    }

    @Override
    public double calculaCusto() {
        return bebida.calculaCusto() + 0.5;
    }
}
