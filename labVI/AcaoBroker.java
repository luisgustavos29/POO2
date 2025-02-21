import java.util.ArrayList;
import java.util.List;

public class AcaoBroker {
    private List<Comando> comandos;

    public AcaoBroker() {
        comandos = new ArrayList<>();
    }

    public void adicionarComando(Comando comando) {
        comandos.add(comando);
    }

    public void executarComandos() {
        for (Comando comando : comandos) {
            comando.executar();
        }
        comandos.clear();
    }
}

