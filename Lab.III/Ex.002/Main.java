public class Main {
    public static void main(String[] args) {

        CalculadoraDecimal calculadoraDecimal = new CalculadoraDecimal();

        int somaDecimal = calculadoraDecimal.somar(10, 5);
        int subtracaoDecimal = calculadoraDecimal.subtrair(15, 7);
        int multiplicacaoDecimal = calculadoraDecimal.multiplicar(3, 4);

        System.out.println("Soma decimal: " + somaDecimal);
        System.out.println("Subtração decimal: " + subtracaoDecimal);
        System.out.println("Multiplicação decimal: " + multiplicacaoDecimal);

        CalculadoraBinaria calculadoraBinaria = new CalculadoraBinaria();

        Calculadora calculadoraAdaptada = new AdaptadorBinario(calculadoraBinaria);

        int somaBinaria = calculadoraAdaptada.somar(2, 3);
        int subtracaoBinaria = calculadoraAdaptada.subtrair(5, 2);

        // Convertendo para binário antes de imprimir
        System.out.println("Soma binária: " + Integer.toBinaryString(somaBinaria));
        System.out.println("Subtração binária: " + Integer.toBinaryString(subtracaoBinaria));
    }
}
