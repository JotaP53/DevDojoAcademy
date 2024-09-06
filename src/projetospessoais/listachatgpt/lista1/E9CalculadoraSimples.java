package projetospessoais.listachatgpt.lista1;

import java.util.*;

public class E9CalculadoraSimples {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int opcao = 0;
        int num1, num2, num3, num4;
        float soma, subtracao, multiplicacao, divisao;

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
                    System.out.println("Digite os números que quer somar. Escolha ATÉ QUATRO NÚMEROS.");
                    num1 = entrada.nextInt();
                    num2 = entrada.nextInt();
                    num3 = entrada.nextInt();
                    num4 = entrada.nextInt();
                    soma = num1 + num2 + num3 + num4;
                    System.out.println("Seu resultado é: " + soma);
                    break;
                case 2:
                    System.out.println("SUBTRAÇÃO");
                    System.out.println("Digite os números que quer subtrair. Escolha ATÉ QUATRO NÚMEROS.");
                    num1 = entrada.nextInt();
                    num2 = entrada.nextInt();
                    num3 = entrada.nextInt();
                    num4 = entrada.nextInt();
                    subtracao = num1 - num2 - num3 - num4;
                    System.out.println("Seu resultado é: " + subtracao);
                    break;
                case 3:
                    System.out.println("MULTIPLICAÇÃO");
                    System.out.println("Digite os números que quer multiplicar. Escolha ATÉ QUATRO NÚMEROS.");
                    num1 = entrada.nextInt();
                    num2 = entrada.nextInt();
                    num3 = entrada.nextInt();
                    num4 = entrada.nextInt();
                    multiplicacao = num1 * num2 * num3 * num4;
                    System.out.println("Seu resultado é: " + multiplicacao);
                    break;
                case 4:
                    System.out.println("DIVISÃO");
                    System.out.println("Digite os números que quer dividir. Escolha ATÉ QUATRO NÚMEROS.");
                    num1 = entrada.nextInt();
                    num2 = entrada.nextInt();
                    num3 = entrada.nextInt();
                    num4 = entrada.nextInt();
                    divisao = (float) num1 / num2 / num3 / num4;
                    System.out.println("Seu resultado é: " + divisao);
                    break;
                case 5:
                    System.out.println("SAIR");
                    break;
                default:
                    System.out.println("OPÇÃO INVÁLIDA");
                    break;
            }
        }
    }
}
