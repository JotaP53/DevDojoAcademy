package academy.devdojo.logicadeprogramacao._2estruturascondicionais._1ifelse;

import java.util.*;

public class Aula23CondicionaisAula10SistemaDeCadastroMilitar {
    public static void main(String[] args) {

        System.out.println("Digite seu sexo: M ou F");
        Scanner entrada = new Scanner(System.in);
        String sexo = entrada.next();

        System.out.println("Digite sua idade: ");
        entrada = new Scanner(System.in);
        byte idade = entrada.nextByte();

        if (sexo.equalsIgnoreCase("M") && idade >= 18) {
            System.out.println("Alistamento Obrigatório");
        } else if (sexo.equalsIgnoreCase("M") && idade < 18) {
            System.out.println("Alistamento Não Permitido");
        } else if (sexo.equalsIgnoreCase("F") && idade >= 18) {
            System.out.println("Alistamento Permitido. Deseja se alistar?");
        } else {
            System.out.println("Alistamento Não Permitido");
        }
    }
}
