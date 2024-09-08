package academy.devdojo.logicadeprogramacao._2estruturascondicionais._1ifelse;

import java.util.Scanner;

public class Aula20CondicionaisAula07TorneioDeNatacaoComEntradaDeDados {
    public static void main(String[] args) {

        Scanner entradaDeNome = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = entradaDeNome.next();

        Scanner entradaDeIdade = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        byte idade = entradaDeIdade.nextByte();

        if (idade < 10) {
            System.out.println(nome + " participará da categoria infantil");
        } else if (idade >= 11 && idade <= 15) {
            System.out.println(nome + " participará da categoria juvenil");
        } else if (idade >= 16 && idade <= 19) {
            System.out.println(nome + " participará da categoria pré-adulto");
        } else {
            System.out.println(nome + " participará da categoria adulto");
        }
    }
}
