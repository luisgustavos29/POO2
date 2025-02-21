//O padrão Adapter permite que você reutilize a biblioteca CSV existente e a adapte para lidar
// com outros formatos, garantindo que o cliente possa usar um mecanismo de leitura uniforme
// para todos os formatos.

public class Main {
    public static void main(String[] args) {
        ArquivoLeitor leitorCSV = new LeitorCsv("arquivo.csv");
        ArquivoLeitor leitorJSON = new AdaptadorJSON("arquivo.json");
        ArquivoLeitor leitorXML = new AdaptadorXML("arquivo.xml");

        System.out.println(leitorCSV.lerDados());
        System.out.println(leitorJSON.lerDados());
        System.out.println(leitorXML.lerDados());
    }
}
