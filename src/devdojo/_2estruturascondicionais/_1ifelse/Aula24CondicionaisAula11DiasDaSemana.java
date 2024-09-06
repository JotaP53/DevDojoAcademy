package devdojo._2estruturascondicionais._1ifelse;

import java.util.Scanner;

public class Aula24CondicionaisAula11DiasDaSemana {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número: ");
        byte numero = entrada.nextByte();

        if (numero == 1) {
            System.out.println("Domingo");
        } else if (numero == 2) {
            System.out.println("Segunda-feira");
        } else if (numero == 3) {
            System.out.println("Terça-feira");
        } else if (numero == 4) {
            System.out.println("Quarta-feira");
        } else if (numero == 5) {
            System.out.println("Quinta-feira");
        } else if (numero == 6) {
            System.out.println("Sexta-feira");
        } else if (numero == 7) {
            System.out.println("Sábado");
        } else {
            System.out.println("Número não correspondente.");
        }
    }
}
