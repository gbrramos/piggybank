package cofrinho;

public class Euro extends Moeda {
    public Euro(double valor, double cambio) {
        super(valor, cambio, "Europa");
    }

    // @Override para sobrescrever método da superclasse
    @Override
    public double convert() {
        return valor * cambio;
    }
}