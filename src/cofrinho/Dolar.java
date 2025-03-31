package cofrinho;

public class Dolar extends Moeda {

    public Dolar(double valor, double cambio) {
        super(valor, cambio, "Estados Unidos");
    }

    // @Override para sobrescrever método da superclasse
    @Override
    public double convert() {
        return valor * cambio;
    }

}