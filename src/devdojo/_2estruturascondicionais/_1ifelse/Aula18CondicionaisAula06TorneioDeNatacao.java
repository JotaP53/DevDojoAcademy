package devdojo._2estruturascondicionais._1ifelse;

public class Aula18CondicionaisAula06TorneioDeNatacao {
    public static void main(String[] args) {

        String nome = "João Pedro";
        byte idade = 27;

        if (idade < 10) {
            System.out.println(nome + " participará da categoria infantil");
        } else if (idade >= 11 && idade <= 15) {
            System.out.println(nome + " participará da categoria juvenil");
        } else if (idade >= 16 && idade <= 19) {
            System.out.println(nome + " participará da categoria pré-adulto");
        } else {
            System.out.println(nome + " participará da categoria adulto");
        }
    }
}
