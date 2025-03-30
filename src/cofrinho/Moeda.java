package cofrinho;

public abstract class Moeda {
	protected double valor;
    protected String pais;

	public Moeda(int valor, String pais) {
		super();
		this.valor = valor;
		this.pais = pais;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + gbMemoria;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Computador other = (Computador) obj;
		if (gbMemoria != other.gbMemoria)
			return false;
		if (numProcessadores != other.numProcessadores)
			return false;
		return true;
	}

	abstract double calculaValor();
}
