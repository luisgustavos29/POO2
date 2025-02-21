public class Main {
    public static void main(String[] args) {
        // Criar ações e investidores
        Acao acaoApple = new Acao("AAPL", 150.0);
        Investidor investidor1 = new Investidor("João", new AcaoBroker(), 145.0, 155.0);
        Investidor investidor2 = new Investidor("Maria", new AcaoBroker(), 140.0, 160.0);

        // Adicionar investidores às ações
        acaoApple.adicionarObservador(investidor1);
        acaoApple.adicionarObservador(investidor2);

        // Simular variações de preço
        acaoApple.atualizarPreco(152.0);
        acaoApple.atualizarPreco(158.0);
        acaoApple.atualizarPreco(148.0);
    }
}
