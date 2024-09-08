package devdojo.scanner;

import java.util.Scanner;

public class Aula19RecebendoDadosDoTeclado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = teclado.next();
        System.out.println("Digite sua idade: ");
        byte idade = teclado.nextByte();
        System.out.println("O nome da pessoa é: " + nome);
        System.out.println("A idade da pessoa é: " + idade);
    }
}
