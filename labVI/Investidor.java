public class Investidor implements Observador{
    private String nome;
    private AcaoBroker corretor;
    private double limiteMinimo;
    private double limiteMaximo;

    public Investidor(String nome, AcaoBroker corretor, double limiteMinimo, double limiteMaximo) {
        this.nome = nome;
        this.corretor = corretor;
        this.limiteMinimo = limiteMinimo;
        this.limiteMaximo = limiteMaximo;
    }

    @Override
    public void atualizarPreco(double novoPreco) {
        if (novoPreco >= limiteMaximo) {
            corretor.adicionarComando(new Comando(this, "Venda"));
        } else if (novoPreco <= limiteMinimo) {
            corretor.adicionarComando(new Comando(this, "Compra"));
        }
    }

    // Não implementamos esses métodos porque Investidor é um Observador, não um Observavel
    @Override
    public void adicionarObservador(Observador observador) {
        // Não implementado
    }

    @Override
    public void removerObservador(Observador observador) {
        // Não implementado
    }

    @Override
    public void notificarObservadores() {
        // Não implementado
    }

    public void comprar(Acao acao) {
        // Lógica para comprar a ação
    }

    public void vender(Acao acao) {
        // Lógica para vender a ação
    }

    // getters e setters
}

