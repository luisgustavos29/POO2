public interface FormaPagamento {
    String getTipo();
    // Adiciona um método para processar o pagamento (específico para cada tipo)
    void processarPagamento();
}
