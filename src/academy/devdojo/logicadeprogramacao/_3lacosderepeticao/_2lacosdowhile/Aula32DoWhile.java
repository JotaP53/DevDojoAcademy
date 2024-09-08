package academy.devdojo.logicadeprogramacao._3lacosderepeticao._2lacosdowhile;

import java.util.Scanner;

public class Aula32DoWhile {
    public static void main(String[] args) {

        int desejaContinuar = 1;
        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("PLAYER 1: Digite um número de 1 a 10: ");
            int num1 = entrada.nextInt();
            System.out.println("PLAYER 2: Digite um número de 1 a 10: ");
            int num2 = entrada.nextInt();
            if (num1 == num2) {
                System.out.println("Acertou!");
            } else {
                System.out.println("Erroooooouuu!!!");
            }
            System.out.println("---------------------------------------");
            System.out.println("Deseja cotinuar?");
            System.out.println("1 - Sim");
            System.out.println("2 - Não");
        } while (desejaContinuar == 1);
    }
}
