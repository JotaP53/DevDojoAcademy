package academy.devdojo.logicadeprogramacao._2estruturascondicionais._1ifelse;/*
Dado um salário...
- Se o salário for maior que 4500, imprima 30% do valor
- Senão, imprima 15% do valor
 */

public class Aula15CondicionaisAula03CalculadoraImpostoComCondicional {
/*
    public static void main(String[] args) {
        float salario = 4800.00F;

        if (salario > 4500) {
            float trintaPorCento = salario * 0.3F;
            System.out.println("30% = "+trintaPorCento);
        } else {
            float trintaPorCento = salario * 0.10F;
            System.out.println("15% = "+trintaPorCento);
        }
*/
/*
    public static void main(String[] args) {
        float salario = 4500.00F;
        float resultado = 0F;

        if (salario > 4500) {
            resultado = salario * 0.3F;
        } else {
            resultado = salario * 0.1F;
        }
        System.out.println(resultado);
    }
*/
    public static void main(String[] args) {
        float salario = 4500.00F;
        float resultado = 0F;
        String porcentagem = "";

        if (salario > 4500) {
            resultado = salario * 0.3F;
            porcentagem = "30%";
        } else {
            resultado = salario * 0.1F;
            porcentagem = "10%";
        }
        System.out.println("O resultado é: " + porcentagem + ": " + resultado);
    }
}
