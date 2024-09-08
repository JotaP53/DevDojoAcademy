package academy.devdojo.logicadeprogramacao._3lacosderepeticao._3for;

import java.util.Scanner;

public class Aula34ForAula02Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = entrada.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + num * i);
        }
    }
}
