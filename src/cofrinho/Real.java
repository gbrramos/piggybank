package cofrinho;

public class Real extends Moeda {
    public Real(double valor, double cambio) {
        super(valor, cambio, "Brasil");
    }

    @Override
    public double converterParaReal() {
        return valor;
    }
}
