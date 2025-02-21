import java.util.List;

public class PedidoNaLoja extends PedidoTemplate {
    public PedidoNaLoja(List<ItemPedido> itens, FormaPagamento formaPagamento) {
        super(itens, formaPagamento);
    }

    @Override
    protected void calcularTotal() {
        // Lógica para calcular o total do pedido na loja
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.getValor() * item.getQuantidade();
        }
        System.out.println("Total do pedido na loja: " + total);
    }

    @Override
    protected void decidirEntrega() {
        // Lógica para decidir se há entrega em pedidos na loja
        entrega = false;
        System.out.println("Entrega desabilitada.");
    }
}
