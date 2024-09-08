package academy.devdojo.logicadeprogramacao._4vetores._1arrays;
import java.util.*;
public class Aula39ArrayAula04 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

//        MINHA RESOLUÇÃO
//        int[] v1 = new int[9];
//        for (int i = 0; i < v1.length; i++) {
//            System.out.println("Digite o número " + (i + 1) + " do PRIMEIRO CONJUNTO de números");
//            v1[i] = entrada.nextInt();
//        }

//        System.out.println("--------------------------------------------------------------------------");

//        int[] v2 = new int[9];
//        for (int i = 0; i < v1.length; i++) {
//            System.out.println("Digite o número " + (i + 1) + " do SEGUNDO CONJUNTO de números");
//            v2[i] = entrada.nextInt();
//        }

//        System.out.println("--------------------------------------------------------------------------");

//        int[] vr = new int[9];
//        for (int i = 0; i < vr.length; i++) {
//            vr[i] = v1[i] * v2[i];
//            System.out.println("VR[" + i + "] = " + vr[i]);
//        }

//        RESOLUÇÃO DEV DOJO
//        int[] v1 = {1,2,3,4,5,6,7,8,9};
//        int[] v2 = {2,3,4,5,6,7,8,9,0};
//        int[] vr = new int[9];
//        for (int i = 0; i < vr.length; i++) {
//            vr[i] = v1[i] * v2[i];
//            System.out.println("VR[" + i + "] = " + vr[i]);
//        }

//        SEGUNDA RESOLUÇÃO DEV DOJO
        int[] v1 = new int[3];
        int[] v2 = new int[3];
        int[] vr = new int[3];
        String resultadoMultiplicao = "";
        for (int i = 0; i < vr.length; i++) {
            System.out.println("Digite o vetor 1, posição " + i);
            v1[i] = entrada.nextInt();
            System.out.println("Digite o vetor 2, posição " + i);
            v2[i] = entrada.nextInt();
            vr[i] = v1[i] * v2[i];
            resultadoMultiplicao = resultadoMultiplicao + vr[i] + " ";
        }
        System.out.println(resultadoMultiplicao);
    }
}
