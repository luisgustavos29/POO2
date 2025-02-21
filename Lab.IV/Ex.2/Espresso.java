public class Espresso implements Bebida{
    @Override
    public String getDescricao() {
        return "Espresso";
    }

    @Override
    public double calculaCusto() {
        return 2.5;
    }
}
