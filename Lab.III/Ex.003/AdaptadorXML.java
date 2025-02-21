public class AdaptadorXML implements ArquivoLeitor{
    private LeitorCsv leitorCSV;

    public AdaptadorXML(String caminhoArquivo) {
        this.leitorCSV = new LeitorCsv(caminhoArquivo);
    }

    @Override
    public String lerDados() {

        return "Dados XML: " + leitorCSV.lerDados();
    }
}
