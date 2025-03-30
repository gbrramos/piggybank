package cofrinho;

public class Dolar extends Moeda {

    public Dolar(double valor, double cambio) {
        super(valor, cambio, "Estados Unidos");
    }

    @Override
    public double converterParaReal() {
        return valor * cambio;
    }

}