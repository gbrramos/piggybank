package cofrinho;

public class Real extends Moeda {
    public Real(double valor, double cambio) {
        super(valor, cambio, "Brasil");
    }

    // @Override para sobrescrever método da superclasse
    @Override
    public double convert() {
        return valor;
    }
}
