package cofrinho;

import java.util.ArrayList;

public class Cofrinho {
    private ArrayList<Moeda> moedas;

    public Cofrinho() {
        this.moedas = new ArrayList<>();
    }

    public void adicionarMoeda(Moeda moeda) {
        this.moedas.add(moeda);
    }

    public void removerMoeda(Moeda moeda) {
        this.moedas.remove(moeda);
    }

    public void listarMoedas() {
        if (moedas.isEmpty()) {
            System.out.println("O cofrinho está vazio.");
        } else {
            System.out.println("Moedas no cofrinho:");
            for (Moeda moeda : moedas) {
                System.out.println(moeda.getValor() + " " + moeda.getClass().getName());
            }
        }
    }

    public double calcularTotalEmReal() {
        double total = 0;
        for (Moeda moeda : moedas) {
            total += moeda.converterParaReal();
        }
        return total;
    }
}