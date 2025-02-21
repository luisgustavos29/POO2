import java.util.ArrayList;
import java.util.List;

abstract class PedidoTemplate {
    protected List<ItemPedido> itens;
    protected FormaPagamento formaPagamento;
    protected boolean entrega;

    public PedidoTemplate(List<ItemPedido> itens, FormaPagamento formaPagamento) {
        this.itens = itens;
        this.formaPagamento = formaPagamento;
    }

    // Método template para processar o pedido
    public void processarPedido() {
        calcularTotal();
        formaPagamento.processarPagamento(); // Chamada do método de processamento
        decidirEntrega();
        enviarConfirmacao();
    }

    // Métodos abstratos a serem implementados pelas subclasses concretas
    protected abstract void calcularTotal();
    protected abstract void decidirEntrega();

    // Método para enviar confirmação (igual para todos os tipos de pedidos)
    private void enviarConfirmacao() {
        System.out.println("Pedido confirmado!");
    }
}
