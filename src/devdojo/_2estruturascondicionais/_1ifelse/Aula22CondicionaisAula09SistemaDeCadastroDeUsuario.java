package devdojo._2estruturascondicionais._1ifelse;

import java.util.*;

public class Aula22CondicionaisAula09SistemaDeCadastroDeUsuario {
    public static void main(String[] args) {

        System.out.println("Bem vindo ao novo sistema da empresa. Vamos cadastrar seu nome de usuário (login) agora.");

        System.out.println("Digite seu login: ");
        Scanner entrada = new Scanner(System.in);
        String login = entrada.next();

        // No Java, quando se compara Strings, não se usa ==, mas se usa .equal. E equalsIgnoreCase serve para se o usuário digitar tanto com letras minúsculas, quanto maiúsculas.
        if (login.equals("") || login.equalsIgnoreCase("admin") || login.equalsIgnoreCase("administrador")) {
            System.out.println("Usuário inválido!");
        } else {
            System.out.println(login + " cadastrado com sucesso.");
        }
    }
}
