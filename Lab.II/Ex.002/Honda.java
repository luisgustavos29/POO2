// Classe Honda implementando IVehicleMaker (Fábrica)
public class Honda implements IVehicleMaker{ // **Padrão Factory**
    @Override
    public IVehicle makeVehicle(String modelo) {
        switch (modelo) {
            case "City":
                return new City();
            case "Civic":
                return new Civic();
            case "Fit":
                return new Fit();
            default:
                return null;
        }
    }
}

