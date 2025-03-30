package cofrinho;

public class Euro extends Moeda {
    public Euro(double valor, double cambio) {
        super(valor, cambio, "Europa");
    }

    @Override
    public double converterParaReal() {
        return valor * cambio;
    }
}