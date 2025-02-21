public class Main {

    public static void main(String[] args) {

        FabricanteCelularSingleton singleton = new FabricanteCelularSingleton();
        FabricanteCelular fabricanteSamsung = singleton.getInstance("samsung");
        FabricanteCelular fabricanteApple = singleton.getInstance("apple");



        Celular galaxy8 = fabricanteSamsung.constroiCelular("Galaxy8");
        Celular galaxy20 = fabricanteSamsung.constroiCelular("Galaxy20");
        Celular iPhoneX = fabricanteApple.constroiCelular("IphoneX");
        Celular iPhoneS = fabricanteApple.constroiCelular("IphoneS");


        galaxy8.fazLigacao();
        galaxy8.tiraFoto();

        galaxy20.fazLigacao();
        galaxy20.tiraFoto();

        iPhoneX.fazLigacao();
        iPhoneX.tiraFoto();

        iPhoneS.fazLigacao();
        iPhoneS.tiraFoto();
    }
}