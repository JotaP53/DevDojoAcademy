package projetospessoais.listachatgpt.lista1;

import java.util.*;

public class E9CalculadoraSimples {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int opcao = 0;
        int num1, num2;
        float resultado;
        String saidaOperacao;

        while (opcao != 5) {

            System.out.println("Digite a sua opção: ");
            System.out.println("1. SOMA");
            System.out.println("2. SUBTRAÇÃO");
            System.out.println("3. MULTIPLICAÇÃO");
            System.out.println("4. DIVISÃO");
            System.out.println("5. SAIR");

            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("SOMA");
                    System.out.println("Digite os números que quer somar.");
                    num1 = entrada.nextInt();
                    num2 = entrada.nextInt();
                    resultado = num1 + num2;
                    System.out.println("Resultado é: " + resultado);
                    System.out.println("Deseja continuar com a operação SOMA? [S/N]");
                    saidaOperacao = entrada.next();
                    while (saidaOperacao.equalsIgnoreCase("S")) {
                        System.out.println("SOMA");
                        System.out.println("Digite os números que quer somar.");
                        num1 = entrada.nextInt();
                        num2 = entrada.nextInt();
                        resultado = num1 + num2;
                        System.out.println("Resultado é: " + resultado);
                        System.out.println("Deseja continuar com a operação SOMA? [S/N]");
                        saidaOperacao = entrada.next();
                    }
                    break;
                case 2:
                    System.out.println("SUBTRAÇÃO");
                    System.out.println("Digite os números que quer subtrair.");
                    num1 = entrada.nextInt();
                    num2 = entrada.nextInt();
                    resultado = num1 - num2;
                    System.out.println("Resultado é: " + resultado);
                    System.out.println("Deseja continuar com a operação SUBTRAÇÃO? [S/N]");
                    saidaOperacao = entrada.next();
                    while (saidaOperacao.equalsIgnoreCase("S")) {
                        System.out.println("SUBTRAÇÃO");
                        System.out.println("Digite os números que quer subtrair.");
                        num1 = entrada.nextInt();
                        num2 = entrada.nextInt();
                        resultado = num1 - num2;
                        System.out.println("Resultado é: " + resultado);
                        System.out.println("Deseja continuar com a operação SUBTRAÇÃO? [S/N]");
                        saidaOperacao = entrada.next();
                    }
                    break;
                case 3:
                    System.out.println("MULTIPLICAÇÃO");
                    System.out.println("Digite os números que quer multiplicar.");
                    num1 = entrada.nextInt();
                    num2 = entrada.nextInt();
                    resultado = num1 * num2;
                    System.out.println("Resultado é: " + resultado);
                    System.out.println("Deseja continuar com a operação MULTIPLICAÇÃO? [S/N]");
                    saidaOperacao = entrada.next();
                    while (saidaOperacao.equalsIgnoreCase("S")) {
                        System.out.println("MULTIPLICAÇÃO");
                        System.out.println("Digite os números que quer multiplicar.");
                        num1 = entrada.nextInt();
                        num2 = entrada.nextInt();
                        resultado = num1 * num2;
                        System.out.println("Resultado é: " + resultado);
                        System.out.println("Deseja continuar com a operação MULTIPLICAÇÃO? [S/N]");
                        saidaOperacao = entrada.next();
                    }
                    break;
                case 4:
                    System.out.println("DIVISÃO");
                    System.out.println("Digite os números que quer dividir.");
                    num1 = entrada.nextInt();
                    num2 = entrada.nextInt();
                    // Verificação para evitar divisão por zero.
                    // Sugestão do ChatGPT
                    if (num1 == 0 || num2 == 0) {
                        System.out.println("Erro: divisão por zero não é permitida");
                    } else {
                        resultado = (float) num1 / num2;
                        System.out.println("Resultado é: " + resultado);
                    }
                    System.out.println("Deseja continuar com a operação DIVISÃO? [S/N]");
                    saidaOperacao = entrada.next();
                    while (saidaOperacao.equalsIgnoreCase("S")) {
                        System.out.println("DIVISÃO");
                        System.out.println("Digite os números que quer dividir..");
                        num1 = entrada.nextInt();
                        num2 = entrada.nextInt();
                        // Verificação para evitar divisão por zero.
                        // Sugestão do ChatGPT
                        if (num1 == 0 || num2 == 0) {
                            System.out.println("Erro: divisão por zero não é permitida");
                        } else {
                            resultado = (float) num1 / num2;
                            System.out.println("Resultado é: " + resultado);
                        }
                    }
                    break;
                case 5:
                    System.out.println("SAIR");
                    break;
                default:
                    System.out.println("OPÇÃO INVÁLIDA");
                    break;
            }
            entrada.close();
        }
    }
}
