package com.example;
import java.util.Scanner;

public class SistemaRegistroProduto {
       public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double totalVendas = 0.0;
        int quantidadePedidos = 0;
        double maiorCompra = Double.MIN_VALUE;
        double menorCompra = Double.MAX_VALUE;
        int quantidadeAcima50 = 0;
        String clienteMaiorCompra = "";
        double totalAcima30 = 0.0;
        int quantidadeAcima30 = 0;
        int opcaoMenu = 0;

        do {
            System.out.println("\n=== MENU INICIAL ===");
            System.out.println("1 - Cadastrar Pedido");
            System.out.println("2 - Exibir Relatório");
            System.out.println("3 - Encerrar Sistema");
            System.out.print("Escolha uma opção: ");

            if (entrada.hasNextInt()) {
                opcaoMenu = entrada.nextInt();
                entrada.nextLine(); 
            } else {
                System.out.println("Opção inválida! Digite um número.");
                entrada.nextLine(); 
                continue;
            }

            switch (opcaoMenu) {
                case 1:
                    String continuar;
                    do {
                        System.out.println("\n--- CADASTRO DE PEDIDO ---");
                        System.out.print("Nome do cliente: ");
                        String nomeCliente = entrada.nextLine().trim();
                        while (nomeCliente.isEmpty()) {
                            System.out.print("O nome não pode ser vazio. Nome do cliente: ");
                            nomeCliente = entrada.nextLine().trim();
                        }
                    
                        System.out.print("Valor da compra: R$ ");
                        while (!entrada.hasNextDouble()) {
                            System.out.print("Por favor, digite um valor numérico válido: R$ ");
                            entrada.next();
                        }
                        double valor = entrada.nextDouble();
                        while (valor <= 0) {
                            System.out.print("O valor deve ser maior que zero. Digite novamente: R$ ");
                            while (!entrada.hasNextDouble()) {
                                System.out.print("Digite um valor numérico válido: R$ ");
                                entrada.next();
                            }
                            valor = entrada.nextDouble();
                        }

                        totalVendas += valor;
                        quantidadePedidos++;
                      
                        if (valor > maiorCompra) {
                            maiorCompra = valor;
                            clienteMaiorCompra = nomeCliente; 
                        }
                        if (valor < menorCompra) {
                            menorCompra = valor;
                        }
                        
                        if (valor > 50.00) {
                            quantidadeAcima50++;
                        }
                       
                        if (valor > 30.00) {
                            totalAcima30 += valor;
                            quantidadeAcima30++;
                        }
                       
                        System.out.print("\nCadastrar novo pedido? (S/N): ");
                        continuar = entrada.next().trim().toUpperCase();
                        while (!continuar.equals("S") && !continuar.equals("N")) {
                            System.out.print("Digite apenas S para sim ou N para não: ");
                            continuar = entrada.next().trim().toUpperCase();
                        }
                        entrada.nextLine(); 

                    } while (continuar.equals("S"));
                    break;

                case 2:
                    System.out.println("\n===== RELATÓRIO FINAL =====");
                    if (quantidadePedidos == 0) {
                        System.out.println("Nenhum pedido foi cadastrado até o momento.");
                    } else {
                        double ticketMedio = totalVendas / quantidadePedidos;
                        
                        
                        System.out.printf("Quantidade de pedidos: %d%n", quantidadePedidos);
                        System.out.printf("Valor total vendido: R$ %.2f%n", totalVendas);
                        System.out.printf("Ticket médio: R$ %.2f%n", ticketMedio);
                        System.out.printf("Maior compra: R$ %.2f%n", maiorCompra);
                        System.out.printf("Menor compra: R$ %.2f%n", menorCompra);

                        System.out.println("\n--- EXTRAS IMPLEMENTADOS ---");                       
                        System.out.printf("Compras acima de R$ 50,00: %d%n", quantidadeAcima50);                                          
                        System.out.printf("Cliente da maior compra: %s (R$ %.2f)%n", clienteMaiorCompra, maiorCompra);
                    
                        if (quantidadeAcima30 > 0) {
                            double mediaAcima30 = totalAcima30 / quantidadeAcima30;
                            System.out.printf("Média das compras acima de R$ 30,00: R$ %.2f%n", mediaAcima30);
                        } else {
                            System.out.println("Média das compras acima de R$ 30,00: Nenhuma compra acima deste valor.");
                        }
                       
                        if (totalVendas > 500.00) {
                            System.out.println("\nMeta atingida!");
                        }
                    }
                    break;

                case 3:
                    System.out.println("\nAtendimento Concluído. Obrigado por utilizar o sistema!");
                    break;

                default:
                    System.out.println("Opção inválida! Escolha entre 1, 2 ou 3.");
                    break;
            }

        } while (opcaoMenu != 3);

        entrada.close();
    }
}