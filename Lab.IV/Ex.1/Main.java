public class Main {
    public static void main(String[] args) {
        Pizza marguerita = new Tomate(new Queijo(new MassaFinaPizza()));
        System.out.println("Pizza Marguerita: " + marguerita.getDescricao() + " - R$" + marguerita.getPreco());

        Pizza portuguesa = new Tomate(new Ovo(new Queijo(new MassaEspessaPizza())));
        System.out.println("Pizza Portuguesa: " + portuguesa.getDescricao() + " - R$" + portuguesa.getPreco());
    }
}
