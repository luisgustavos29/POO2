public class Main {
    public static void main(String[] args) {
        Ave pato = new PatoAdapter(new Pato());
        Ave patoDomestico = new PatoAdapter(new PatoDomestico());
        Ave pavao = new PavaoAdapter(new Pavao());
        Ave pavaoAzul = new PavaoAdapter(new PavaoAzul());

        System.out.println("Pato:");
        pato.voar();
        pato.emitirSom();

        System.out.println("\nPato Doméstico:");
        patoDomestico.voar();
        patoDomestico.emitirSom();

        System.out.println("\nPavão:");
        pavao.voar();
        pavao.emitirSom();

        System.out.println("\nPavão Azul:");
        pavaoAzul.voar();
        pavaoAzul.emitirSom();
    }
}