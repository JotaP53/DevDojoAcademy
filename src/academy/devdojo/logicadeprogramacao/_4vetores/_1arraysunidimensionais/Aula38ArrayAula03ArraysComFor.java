package academy.devdojo.logicadeprogramacao._4vetores._1arrays;

import java.util.*;

public class Aula38ArrayAula03ArraysComFor {
    public static void main(String[] args) {
        double[] notas = new double[4];
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota " + (i + 1));
            notas[i] = entrada.nextDouble();
        }
        double media = 0;
        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            media = media + 1;
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
        }
        soma = media * 4;
        media = soma / notas.length;
        System.out.println("Soma das notas: " + soma);
        System.out.println("Media: " + media);
    }
}
