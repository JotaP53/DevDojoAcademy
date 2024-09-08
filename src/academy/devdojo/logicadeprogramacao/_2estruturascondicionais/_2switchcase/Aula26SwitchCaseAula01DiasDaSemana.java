package academy.devdojo.logicadeprogramacao._2estruturascondicionais._2switchcase;

import java.util.Scanner;

public class Aula26SwitchCaseAula01DiasDaSemana {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número: ");
        byte numero = entrada.nextByte();

        switch (numero) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Dia Inválido");
                break;
        }
        System.out.println("Fim do programa");
    }
}
