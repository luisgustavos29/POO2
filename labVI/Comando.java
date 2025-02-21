public class Comando {
    private Investidor investidor;
    private String tipo;

    public Comando(Investidor investidor, String tipo) {
        this.investidor = investidor;
        this.tipo = tipo;
    }

    public void executar() {
        if (tipo.equals("Compra")) {
            // Lógica para comprar a ação
            // Aqui você pode usar o investidor.corretor para realizar a compra
        } else if (tipo.equals("Venda")) {
            // Lógica para vender a ação
            // Aqui você pode usar o investidor.corretor para realizar a venda
        }
    }
}
