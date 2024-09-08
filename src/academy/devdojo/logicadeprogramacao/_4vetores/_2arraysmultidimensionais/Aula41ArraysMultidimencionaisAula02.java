package academy.devdojo.logicadeprogramacao._4vetores._2arraysmultidimensionais;

import java.util.*;

public class Aula41ArraysMultidimencionaisAula02 {
    public static void main(String[] args) {
        // Exercitando Arrays Multidimensionais Aninhados
        Scanner entrada = new Scanner(System.in);
        int arraysMulti1[][][] = new int[3][3][3];
        for (int i = 0; i < arraysMulti1.length; i++) {
            for (int j = 0; j < arraysMulti1[i].length; j++) {
                for (int k = 0; k < arraysMulti1[j].length; k++) {
                    System.out.println("Digite os valores de [" + i + "],[" + j + "] e [" + k + "]: ");
                    arraysMulti1[i][j][k] = entrada.nextInt();
                }
            }
        }
        for (int i = 0; i < arraysMulti1.length; i++) {
            for (int j = 0; j < arraysMulti1[i].length; j++) {
                for (int k = 0; k < arraysMulti1[j].length; k++) {
                    System.out.println("Os valores de [" + i + "],[" + j + "] e [" + k + "] são: " + arraysMulti1[i][j][k]);
                }
            }
        }
    }
}
