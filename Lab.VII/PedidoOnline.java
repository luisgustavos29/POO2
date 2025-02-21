import java.util.List;

public class PedidoOnline extends PedidoTemplate {
    public PedidoOnline(List<ItemPedido> itens, FormaPagamento formaPagamento) {
        super(itens, formaPagamento);
    }

    @Override
    protected void calcularTotal() {
        // Lógica para calcular o total do pedido online
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.getValor() * item.getQuantidade();
        }
        System.out.println("Total do pedido online: " + total);
    }

    @Override
    protected void decidirEntrega() {
        // Lógica para decidir se há entrega em pedidos online
        entrega = true;
        System.out.println("Entrega habilitada.");
    }
}
