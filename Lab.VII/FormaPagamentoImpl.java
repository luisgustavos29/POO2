public class FormaPagamentoImpl implements FormaPagamento {
    private String tipo;

    public FormaPagamentoImpl(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String getTipo() {
        return tipo;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Processando pagamento com cartão de crédito...");
    }
}
