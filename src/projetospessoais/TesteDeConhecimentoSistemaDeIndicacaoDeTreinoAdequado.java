package projetospessoais;

import java.text.DecimalFormat;
import java.util.*;

public class TesteDeConhecimentoSistemaDeIndicacaoDeTreinoAdequado {
    public static void main(String[] args) {

        // ENTRADA DE DADOS PRIMÁRIOS: NOME, IDADE, PESO E ALTURA

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Seja bem-vindo(a). Vamos te ajudar a saber como está o seu IMC e, se você quiser, vamos te sugerir um programa de treino personalizado. Está preparado(a)? Vamos nessa!");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        Scanner entrada;

        System.out.println("Digite seu nome: ");
        entrada = new Scanner(System.in);
        String nome = entrada.next();

        System.out.println("Digite sua idade: ");
        entrada = new Scanner(System.in);
        byte idade = entrada.nextByte();

        System.out.println("Digite seu peso: ");
        entrada = new Scanner(System.in);
        float peso = entrada.nextFloat();

        System.out.println("Digite sua altura: ");
        entrada = new Scanner(System.in);
        float altura = entrada.nextFloat();

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Parabéns, " + nome + ", você deu o primeiro passo em direção ao sucesso para melhorar a sua saúde. De acordo com os dados fornecidos você tem " + idade + " anos, pesa " + peso + "Kg e tem " + altura + "cm de altura. Com base nesses dados, irei agora te mostrar o seu IMC. Vamos lá!");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        // CÁLCULO DO IMC

        float imc, alturaConvertida;
        alturaConvertida = altura / 100;
        imc = peso / (alturaConvertida * alturaConvertida);
        System.out.println("IMC calculado");
        System.out.println("IMC = " + new DecimalFormat("#.##").format(imc));

        // INDICAÇÃO DE GRAU

        if (imc <18.5) {
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println(nome + ", com base nos dados fornecidos, o seu IMC é de " + new DecimalFormat("#.##").format(imc) + ". O que significa que você está num grau de MAGREZA.");
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        } else if (imc >= 18.6 && imc <= 24.9) {
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println(nome + ", com base nos dados fornecidos, o seu IMC é de " + new DecimalFormat("#.##").format(imc) + ". O que significa que você está num grau de NORMALIDADE.");
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        } else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println(nome + ", com base nos dados fornecidos, o seu IMC é de " + new DecimalFormat("#.##").format(imc) + ". O que significa que você está num grau de SOBREPESO.");
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        } else {
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println(nome + ", com base nos dados fornecidos, o seu IMC é de " + new DecimalFormat("#.##").format(imc) + ". O que significa que você está num grau de OBESIDADE.");
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        }

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Nota: o cálculo de IMC não leva em consideração a composição corporal. Por esse motivo, pessoas com muita massa muscular, como é o caso de alguns atletas, podem apresentar um IMC acima do normal. O ideal é consultar um nutricionista para fazer uma avaliação mais detalhada.");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

    }
}
