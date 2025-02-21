public class Main {
    public static void main(String[] args) {
        carroFacade carro = new carroFacade();

        // Iniciar a condução do carro
        System.out.println("Iniciando a condução do carro:");
        carro.dirigir("101.1 FM");

        // Finalizar a condução do carro
        System.out.println("\nFinalizando a condução do carro:");
        carro.finalizarCorrida();
    }
}
