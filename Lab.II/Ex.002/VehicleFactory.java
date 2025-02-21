// Fábrica de veículos (Singleton)
public class VehicleFactory { // **Padrão Singleton**
    private static VehicleFactory instance; // Instância única da fábrica
    private Toyota toyota;
    private Honda honda;

    // Construtor privado para impedir instanciamento externo
    private VehicleFactory() { // **Padrão Singleton**
        toyota = new Toyota();
        honda = new Honda();
    }

    // Método para obter a instância única da fábrica
    public static VehicleFactory getInstance() { // **Padrão Singleton**
        if (instance == null) {
            instance = new VehicleFactory();
        }
        return instance;
    }

    // Método para criar veículos com base na marca e modelo
    public IVehicle createVehicle(String marca, String modelo) {
        if (marca.equalsIgnoreCase("toyota")) {
            return toyota.makeVehicle(modelo);
        } else if (marca.equalsIgnoreCase("honda")) {
            return honda.makeVehicle(modelo);
        } else {
            return null; // Ou lançar uma exceção
        }
    }
}
