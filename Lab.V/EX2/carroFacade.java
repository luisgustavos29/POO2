public class carroFacade {
    private Motor motor;
    private CintoDeSeguranca cinto;
    private Porta porta;
    private Farol farol;
    private Radio radio;

    public carroFacade() {
        motor = new Motor();
        cinto = new CintoDeSeguranca();
        porta = new Porta();
        farol = new Farol();
        radio = new Radio();
    }

    public void dirigir(String estacaoRadio) {
        motor.ligar();
        porta.trancar();
        cinto.travar();
        farol.acender();
        radio.ligar();
        radio.sintonizar(estacaoRadio);
    }

    public void finalizarCorrida() {
        motor.desligar();
        porta.destrancar();
        cinto.destravar();
        farol.apagar();
        radio.desligar();
    }
}
