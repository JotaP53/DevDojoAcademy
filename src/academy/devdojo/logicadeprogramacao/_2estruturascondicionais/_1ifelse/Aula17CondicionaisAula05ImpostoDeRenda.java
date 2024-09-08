package academy.devdojo.logicadeprogramacao._2estruturascondicionais._1ifelse;

public class Aula17CondicionaisAula05ImpostoDeRenda {
    public static void main(String[] args) {

        float salario = 8000F;
        float resultado = 0F;

        if (salario <= 1903.98) {
            System.out.println("Isento de Pagar Imposto");
        } else if (salario >= 1903.99 && salario <= 2826.65) {
            resultado = salario * 0.075F;
            System.out.println("Seu iposto é: " + resultado);
        } else if (salario >= 2826.66 && salario <= 3751.05) {
            resultado = salario * 0.15F;
            System.out.println("Seu iposto é: " + resultado);
        } else if (salario >= 3751.06 && salario <= 4664.68) {
            resultado = salario * 0.225F;
            System.out.println("Seu iposto é: " + resultado);
        } else if (salario >= 4664.68) {
            resultado = salario * 0.275F;
            System.out.println("Seu iposto é: " + resultado);
        } else {
            System.out.println("Valor não corresponde");
        }
    }
}
