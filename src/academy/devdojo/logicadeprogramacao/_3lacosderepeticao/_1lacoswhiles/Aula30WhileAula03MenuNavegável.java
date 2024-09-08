package academy.devdojo.logicadeprogramacao._3lacosderepeticao._1lacoswhiles;
import java.util.*;

public class Aula30WhileAula03MenuNavegável {
    public static void main(String[] args) {

       Scanner entrada = new Scanner(System.in);
       int opcao = 0;

       while (opcao != 3) {
           System.out.println("1. Informar Salário");
           System.out.println("2. Calcular Imposto");
           System.out.println("3. Sair");
           System.out.println("Digite a sua opção: ");
           opcao = entrada.nextInt();
       }
        System.out.println("Programa Encerrado");
   }
}
