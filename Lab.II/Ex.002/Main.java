public class Main {
    public static void main(String[] args) {
        VehicleFactory factory = VehicleFactory.getInstance(); // Obtendo a instância única da fábrica

        // Criando veículos da Toyota
        IVehicle corolla = factory.createVehicle("toyota", "Corolla");
        IVehicle hilux = factory.createVehicle("toyota", "Hilux");
        IVehicle etios = factory.createVehicle("toyota", "Etios");

        // Criando veículos da Honda
        IVehicle city = factory.createVehicle("honda", "City");
        IVehicle civic = factory.createVehicle("honda", "Civic");
        IVehicle fit = factory.createVehicle("honda", "Fit");

        // Testando os veículos criados
        corolla.start();
        corolla.drive();
        corolla.stop();

        hilux.start();
        hilux.drive();
        hilux.stop();

        etios.start();
        etios.drive();
        etios.stop();

        city.start();
        city.drive();
        city.stop();

        civic.start();
        civic.drive();
        civic.stop();

        fit.start();
        fit.drive();
        fit.stop();
    }
}