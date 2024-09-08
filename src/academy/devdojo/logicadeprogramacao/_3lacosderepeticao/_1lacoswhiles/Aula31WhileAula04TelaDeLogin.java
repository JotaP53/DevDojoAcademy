package devdojo._3lacosderepeticao._1lacoswhiles;

import java.util.Scanner;

public class Aula31WhileAula04TelaDeLogin {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String login = "Joao";
        String password = "DevIniciante";
        boolean autenticacao = true;
        while (autenticacao) {
            System.out.println("Digite seu login:");
            login = entrada.next();
            System.out.println("Digite seu password:");
            password = entrada.next();
            if (login.equalsIgnoreCase("Joao")
                    && password.equalsIgnoreCase("DevIniciante")) {
                autenticacao = false;
                System.out.println("Login Confirmado. Seja bem-vindo!");
            } else {
                System.out.println("Login Incorreto");
            }
        System.out.println("Programa Encerrado.");
        }
    }
}
