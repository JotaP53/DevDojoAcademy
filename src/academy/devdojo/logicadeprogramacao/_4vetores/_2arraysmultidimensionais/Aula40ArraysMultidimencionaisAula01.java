package academy.devdojo.logicadeprogramacao._4vetores._2arraysmultidimensionais;
import java.util.*;
public class Aula40ArraysMultidimencionaisAula01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arrayMulti [][] = new int[5][5];
        arrayMulti[0][4] = entrada.nextInt();
        arrayMulti[1][3] = entrada.nextInt();
        arrayMulti[2][2] = entrada.nextInt();
        arrayMulti[3][1] = entrada.nextInt();
        arrayMulti[4][0] = entrada.nextInt();
        System.out.println(arrayMulti[0][4]);
        System.out.println(arrayMulti[1][3]);
        System.out.println(arrayMulti[2][2]);
        System.out.println(arrayMulti[3][1]);
        System.out.println(arrayMulti[4][0]);
        System.out.println(arrayMulti);
        System.out.println(arrayMulti[1][4]);
    }
}
