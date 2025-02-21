public class Samsung implements FabricanteCelular {
    @Override
    public Celular constroiCelular(String modelo) {
        switch (modelo) {
            case "Galaxy8":
                return new Galaxy8();
            case "Galaxy20":
                return new Galaxy20();
            default:
                return null;
        }
    }
}