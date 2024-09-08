package devdojo._2estruturascondicionais._2switchcase;

import java.util.Scanner;

public class Aula27SwitchCaseAula02TipoDeConta {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número: ");
        byte numero = entrada.nextByte();

        switch (numero) {
            case 1:
                System.out.println("CONTA POUPANÇA");
                System.out.println("Juros: 0.05%");
                break;
            case 2:
                System.out.println("CONTA CORRENTE");
                System.out.println("Juros: 0.02%");
                break;
            case 3:
                System.out.println("CONTA INVESTIMENTO");
                System.out.println("Juros: 0.1%");
                break;
            default:
                System.out.println("Número Inválido");
                break;
        }
        System.out.println("Fim do programa");
    }
}
