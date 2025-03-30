package cofrinho;

public abstract class Moeda {
    protected double valor, cambio;
    protected String pais;

    public Moeda(double valor, double cambio, String pais) {
        this.valor = valor;
        this.cambio = cambio;
        this.pais = pais;
    }

    public double getValor() {
        return valor;
    }

	public double getCambio() {
		return cambio;
	}

    public String getPais() {
        return pais;
    }

    public abstract double converterParaReal();
}
