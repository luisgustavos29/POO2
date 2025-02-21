public interface Observador {
    void atualizarPreco(double novoPreco);

    void adicionarObservador(Observador observador);
    void removerObservador(Observador observador);
    void notificarObservadores();
}
