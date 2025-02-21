// Classe Toyota implementando IVehicleMaker (Fábrica)
public class Toyota implements IVehicleMaker{ // **Padrão Factory**
    @Override
    public IVehicle makeVehicle(String modelo) {
        switch (modelo) {
            case "Corolla":
                return new Corolla();
            case "Hilux":
                return new Hillux();
            case "Etios":
                return new Etios();
            default:
                return null;
        }
    }
}

