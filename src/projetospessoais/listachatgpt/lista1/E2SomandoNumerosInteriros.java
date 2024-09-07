package projetospessoais.listachatgpt.lista1;

import java.util.*;

public class E2SomandoNumerosInteriros {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numInteiros;
        int resultado = 0; // Variável para acumular a soma
        String continuar = "S"; // Controla se o loop continua

        while (continuar.equalsIgnoreCase("S")) {
            System.out.println("Digite um número: ");
            numInteiros = entrada.nextInt();
            resultado += numInteiros;
            System.out.println("Resultado parcial: " + resultado);
            System.out.println("Deseja adicionar outro número? [S/N]");
            continuar = entrada.next();
        }
        System.out.println("Resultado final: " + resultado);
    }
}
