package cofrinho;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Cofrinho cofrinho = new Cofrinho();
        Scanner scanner = new Scanner(System.in);
        int opcao, tipoMoeda;
        double valor;
        Moeda moeda;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar moeda");
            System.out.println("2. Remover moeda");
            System.out.println("3. Listar moedas");
            System.out.println("4. Calcular total em Real");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            // Switch case para validar a seleção no menu
            switch (opcao) {
                case 1:
					System.out.println("Escolha o tipo de moeda:");
                    System.out.println("1- Dólar");
                    System.out.println("2- Euro");
                    System.out.println("3- Real");
                    System.out.print("Opção: ");
                    tipoMoeda = scanner.nextInt();

                    //Recupera valor da moeda
                    System.out.print("Digite o valor da moeda: ");
                    valor = scanner.nextDouble();

                    // Switch case para recuperar tipo da moeda
                    // Cambios aproximados
                    switch (tipoMoeda) {
                        case 1:
                            moeda = new Dolar(valor, 5.25);
                            break;
                        case 2:
                            moeda = new Euro(valor, 6.15);
                            break;
                        case 3:
                            moeda = new Real(valor, 1);
                            break;
                        default:
                            System.out.println("Opção inválida.");
                            continue;
                    }

                    // Adiciona moeda
                    cofrinho.adicionaMoedas(moeda);
                    System.out.println("Moeda adicionada!");
                    break;
                case 2:
                    System.out.println("Escolha o tipo de moeda:");
                    System.out.println("1- Dólar");
                    System.out.println("2- Euro");
                    System.out.println("3- Real");
                    System.out.print("Opção: ");
                    tipoMoeda = scanner.nextInt();

                    System.out.print("Digite o valor da moeda: ");
                    valor = scanner.nextDouble();

                    switch (tipoMoeda) {
                        case 1:
                            moeda = new Dolar(valor, 5.25);
                            break;
                        case 2:
                            moeda = new Euro(valor, 6.15);
                            break;
                        case 3:
                            moeda = new Real(valor, 1);
                            break;
                        default:
                            System.out.println("Opção inválida.");
                            continue;
                    }

                    // Remove moedas
                    // Parâmetros para identificar qual item remover do ArrayList
                    cofrinho.removerMoeda(moeda.getValor(), moeda.getPais());
                    break;
                case 3:
                    // Lista moedas
                    cofrinho.listarMoedas();
                    break;
                case 4:
                    System.out.println("Total em Real: " + cofrinho.calcularTotalEmReal());
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}