public class FabricanteCelularSingleton {

    private Apple apple;
    private Samsung samsung;

    public FabricanteCelular getInstance(String fabricante) {
        if (fabricante.equals("apple")) {
            if (apple == null) {
                apple = new Apple();
            }
            return apple;
        } else if (fabricante.equals("samsung")) {
            if (samsung == null) {
                samsung = new Samsung();
            }
            return samsung;
        }
        return null;
    }
}