public class CalculadoraBinaria {
    public String somar(String a, String b) {

        int resultadoBinario = Integer.parseInt(a, 2) + Integer.parseInt(b, 2);
        return Integer.toBinaryString(resultadoBinario);
    }

    public String subtrair(String a, String b) {

        int resultadoBinario = Integer.parseInt(a, 2) - Integer.parseInt(b, 2);
        return Integer.toBinaryString(resultadoBinario);
    }
}
