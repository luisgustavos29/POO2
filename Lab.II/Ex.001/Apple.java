public class Apple implements FabricanteCelular {
    @Override
    public Celular constroiCelular(String modelo) {
        switch (modelo) {
            case "IphoneX":
                return new IphoneX();
            case "IphoneS":
                return new IphoneS();
            default:
                return null;
        }
    }
}
