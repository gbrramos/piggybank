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

    public void removerMoeda(double valor, String pais) {
        Moeda moedaRemover = null;
        
        for (Moeda moeda : this.moedas) {
            if (moeda.getValor() == valor && moeda.getPais() == pais) {
                moedaRemover = moeda;
                break;
            }
        }

        if (moedaRemover != null) {
            this.moedas.remove(moedaRemover);
        }
    
    }

    public void listarMoedas() {
        if (moedas.isEmpty()) {
            System.out.println("O cofrinho está vazio.");
        } else {
            System.out.println("Moedas no cofrinho:");
            for (Moeda moeda : moedas) {
                String texto; 
                if (moeda.getClass() == Dolar.class) {
                    texto = "Dolares";
                } else if (moeda.getClass() == Euro.class) {
                    texto = "Euros";
                } else {
                    texto = "Reais";
                }

                System.out.println(moeda.getValor() + " " + texto);
            }
        }
    }

    // Método para calcular valor das moedas cadastradas para real
    public double calcularTotalEmReal() {
        double total = 0;
        for (Moeda moeda : moedas) {
            total += moeda.converterParaReal();
        }
        return total;
    }
}