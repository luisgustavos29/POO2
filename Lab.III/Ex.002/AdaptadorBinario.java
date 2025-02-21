public class AdaptadorBinario implements Calculadora{
    private CalculadoraBinaria calculadoraBinaria;

    public AdaptadorBinario(CalculadoraBinaria calculadoraBinaria) {
        this.calculadoraBinaria = calculadoraBinaria;
    }

    @Override
    public int somar(int a, int b) {
        String resultadoBinario = calculadoraBinaria.somar(Integer.toBinaryString(a), Integer.toBinaryString(b));
        return Integer.parseInt(resultadoBinario, 2);
    }

    @Override
    public int subtrair(int a, int b) {
        String resultadoBinario = calculadoraBinaria.subtrair(Integer.toBinaryString(a), Integer.toBinaryString(b));
        return Integer.parseInt(resultadoBinario, 2);
    }
}
