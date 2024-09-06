package devdojo._3lacosderepeticao._1lacoswhiles;

public class Aula28WhileAula01 {
    public static void main(String[] args) {

        // Diário de bordo: tentei fazer com byte e não deu certo, quando coloquei int funcionou.
        // Acho que o while só roda com int.

        int contador =  1;
        while (contador <= 10) {
            System.out.println("Contador: " + contador);
            contador = contador + 1;
        }
    }
}
