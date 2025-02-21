public class Main {
    public static void main(String[] args) {
        Bebida espresso = new Espresso();
        System.out.println(espresso.getDescricao() + " - R$" + espresso.calculaCusto());

        Bebida decaf = new Decaf();
        System.out.println(decaf.getDescricao() + " - R$" + decaf.calculaCusto());

        Bebida espressoComLeiteECanela = new Canela(new Leite(new Espresso()));
        System.out.println(espressoComLeiteECanela.getDescricao() + " - R$" + espressoComLeiteECanela.calculaCusto());

        Bebida decafComChocolate = new Chocolate(new Decaf());
        System.out.println(decafComChocolate.getDescricao() + " - R$" + decafComChocolate.calculaCusto());
    }
}
