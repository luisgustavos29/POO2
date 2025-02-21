import java.util.ArrayList;
import java.util.List;

public class Main {
    // Diferença entre Template e Decorator:
    //
    // - Template: Define um algoritmo esqueleto e permite que subclasses
    //              implementem partes específicas do algoritmo.
    // - Decorator: Adiciona funcionalidades a um objeto existente, sem
    //              alterar sua classe original.
    //
    // Em resumo, Template define uma estrutura de algoritmo, enquanto
    // Decorator adiciona comportamento a um objeto.

    public static void main(String[] args) {
        // Criar itens do pedido
        List<ItemPedido> itens = new ArrayList<>();
        itens.add(new ItemPedido("Camiseta", 20.0, 2));
        itens.add(new ItemPedido("Calça", 50.0, 1));

        // Criar formas de pagamento
        FormaPagamento pagamentoCartao = new FormaPagamentoImpl("Cartão de crédito");
        FormaPagamento pagamentoCripto = new CriptomoedaPagamento("Criptomoedas");

        // Criar e processar pedidos
        PedidoOnline pedidoOnline = new PedidoOnline(itens, pagamentoCartao);
        pedidoOnline.processarPedido();

        System.out.println("\n------------------------\n");

        PedidoNaLoja pedidoNaLoja = new PedidoNaLoja(itens, pagamentoCripto);
        pedidoNaLoja.processarPedido();
    }
}
