import java.util.ArrayList;
import java.util.List;
public class Acao implements Observador{
    private String simbolo;
    private double preco;
    private List<Observador> observadores;

    public Acao(String simbolo, double preco) {
        this.simbolo = simbolo;
        this.preco = preco;
        this.observadores = new ArrayList<>();
    }

    @Override
    public void atualizarPreco(double novoPreco) {
        this.preco = novoPreco;
        notificarObservadores();
    }

    @Override
    public void adicionarObservador(Observador observador) {
        observadores.add(observador);
    }

    @Override
    public void removerObservador(Observador observador) {
        observadores.remove(observador);
    }

    @Override
    public void notificarObservadores() {
        for (Observador observador : observadores) {
            observador.atualizarPreco(preco);
        }
    }

    // getters e setters

}
