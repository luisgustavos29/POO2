public class LeitorCsv implements ArquivoLeitor{
    private String caminhoArquivo;

    public LeitorCsv(String caminhoArquivo) {
        this.caminhoArquivo = caminhoArquivo;
    }

    @Override
    public String lerDados() {
        // Lógica para ler dados do arquivo CSV
        return "Dados CSV: " + caminhoArquivo; // Simulação
    }
}
