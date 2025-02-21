public class AdaptadorJSON implements ArquivoLeitor{
    private LeitorCsv leitorCSV;

    public AdaptadorJSON(String caminhoArquivo) {
        this.leitorCSV = new LeitorCsv(caminhoArquivo);
    }

    @Override
    public String lerDados() {

        return "Dados JSON: " + leitorCSV.lerDados();
    }
}
