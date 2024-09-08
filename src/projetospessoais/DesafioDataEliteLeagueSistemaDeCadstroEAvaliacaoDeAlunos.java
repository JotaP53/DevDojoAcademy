package projetospessoais;

import java.util.*;

public class DesafioDataEliteLeagueSistemaDeCadstroEAvaliacaoDeAlunos {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int saidaDoPrograma = 1;

        // Cadastro do professor
        System.out.println("Olá, professor! Vamos iniciar seu cadastro no sistema.");
        System.out.println("Digite seu nome:");
        String nomeProfessor = entrada.next();
        System.out.println("Professor cadastrado!");
        System.out.println("Seja bem-vindo, professor " + nomeProfessor);
        System.out.println("---------------------------------------------------------------");

        do {
            // Cadastro de aluno
            System.out.println("Vamos iniciar o cadastro do aluno.");
            System.out.println("Digite o nome do aluno:");
            String nomeAluno = entrada.next();
            System.out.println("Agora, digite o data de nascimento do aluno:");
            int[] dataNascimentoAluno = new int[3];
            String dataNascimentoAlunoDigitada = "";
            for (int i = 0; i < dataNascimentoAluno.length; i++) {
                dataNascimentoAluno[i] = entrada.nextInt();
                dataNascimentoAlunoDigitada = dataNascimentoAlunoDigitada + dataNascimentoAluno[i] + " ";
            }
            System.out.println(dataNascimentoAlunoDigitada);
            System.out.println("Aluno cadastrado!");
            System.out.println("---------------------------------------------------------------");

            // Falar idade do aluno
            int idadeDoAluno = 2024 - dataNascimentoAluno[2];
            System.out.println("A idade de " + nomeAluno + " é " + idadeDoAluno);
            System.out.println("---------------------------------------------------------------");

            // Entrada de notas
            System.out.println("Prof." + nomeProfessor + " agora digite as notas de " + nomeAluno);
            double[] notas = new double[3];
            for (int i = 0; i < notas.length; i++) {
                System.out.println("Digite a nota nº " + (i + 1));
                notas[i] = entrada.nextDouble();
                System.out.println("Nota " + (i + 1) + " cadastrada: " + notas[i]);
            }
            System.out.println("---------------------------------------------------------------");
            for (int j = 0; j < notas.length; j++) {
                System.out.println("As notas de " + nomeAluno + " são, respectivamente: ");
                System.out.println("Nota " + (j + 1) + ": " + notas[j]);
            }
            System.out.println("---------------------------------------------------------------");

            // Calcular média ponderada
            System.out.println("Agora vamos calcular a média de " + nomeAluno);
            double soma = notas[0] + notas[1] + notas[2];
            System.out.println("A soma das notas é: " + soma);
            double somaPonderada = (notas[0] * 1) + (notas[1] * 2) + (notas[2] * 3);
            System.out.println("A soma ponderada das notas é: " + somaPonderada);
            double mediaPonderada = somaPonderada / (1 + 2 + 3);
            System.out.println("A media ponderada das notas é: " + mediaPonderada);
            System.out.println("---------------------------------------------------------------");

            // Validação de aprovação
            if (mediaPonderada >= 7) {
                System.out.println(nomeAluno + " está aprovado!");
            } else if (mediaPonderada >= 5 || mediaPonderada <= 6.9) {
                System.out.println(nomeAluno + " deve ir para a recuperação!");
            } else {
                System.out.println(nomeAluno + " está reprovado!");
            }
            System.out.println("---------------------------------------------------------------");

            // Pergunta se quer cadastrar outro aluno
            System.out.println("Deseja cadastrar outro aluno, prof(a). " + nomeProfessor + "?");
            System.out.println("1. Sim");
            System.out.println("2. Não");
            if (saidaDoPrograma == 1) {
                System.out.println("Vamos continuar.");
            } else {
                System.out.println("Obrigado, prof(a). " + nomeProfessor);
                System.out.println("Programa encerrado.");
            }
            System.out.println("---------------------------------------------------------------");
        }
        while (saidaDoPrograma == 1);
    }
}
