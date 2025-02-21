public class CriptomoedaPagamento implements FormaPagamento {
    private String tipo;

    public CriptomoedaPagamento(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String getTipo() {
        return tipo;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Processando pagamento com criptomoedas...");
    }
}
