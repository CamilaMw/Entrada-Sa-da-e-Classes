/*– Codifique, compile e execute um programa em C que crie uma estrutura representando os alunos do 
curso de Programação. A estrutura deve conter a matrícula do aluno, nome, nota da primeira prova, nota da 
segunda prova e nota da terceira prova. O programa deve executar as seguintes ações: 
a- permitir ao usuário entrar com os dados de 5 alunos 
b- encontrar o aluno com maior nota da primeira prova 
c- encontrar o aluno com maior média geral 
d- encontrar o aluno com menor média geral e- para cada aluno armazenado na estrutura diga se ele foi 
aprovado ou reprovado, considerando o valor 7 para aprovação. */

package struct5;
import java.util.Scanner;
import model.Aluno;

public class CadastroAlunos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Aluno[] alunos = new Aluno[5];
        int alunoMaiorNotaProva1 = 0;
        int alunoMaiorMediaGeral = 0;
        int alunoMenorMediaGeral = 0;

        // Entrada de dados dos alunos
        for (int i = 0; i < 5; i++) {
            alunos[i] = new Aluno();

            System.out.println("Entre com os dados do aluno " + (i + 1) + ":");
            System.out.print("Matricula: ");
            alunos[i].matricula = scanner.nextInt();

            scanner.nextLine(); // Consumir a nova linha

            System.out.print("Nome: ");
            alunos[i].nome = scanner.nextLine();

            System.out.print("Nota da primeira prova: ");
            alunos[i].notaProva1 = scanner.nextFloat();

            System.out.print("Nota da segunda prova: ");
            alunos[i].notaProva2 = scanner.nextFloat();

            System.out.print("Nota da terceira prova: ");
            alunos[i].notaProva3 = scanner.nextFloat();

            alunos[i].mediaGeral = (alunos[i].notaProva1 + alunos[i].notaProva2 + alunos[i].notaProva3) / 3;

            System.out.println();
        }

        for (int i = 1; i < 5; i++) {
            if (alunos[i].notaProva1 > alunos[alunoMaiorNotaProva1].notaProva1) {
                alunoMaiorNotaProva1 = i;
            }
        }

        for (int i = 1; i < 5; i++) {
            if (alunos[i].mediaGeral > alunos[alunoMaiorMediaGeral].mediaGeral) {
                alunoMaiorMediaGeral = i;
            }
        }

        for (int i = 1; i < 5; i++) {
            if (alunos[i].mediaGeral < alunos[alunoMenorMediaGeral].mediaGeral) {
                alunoMenorMediaGeral = i;
            }
        }

        System.out.println("\nSituacao dos alunos:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Aluno: " + alunos[i].nome);
            System.out.println("Matricula: " + alunos[i].matricula);
            System.out.println("Media Geral: " + alunos[i].mediaGeral);

            if (alunos[i].mediaGeral >= 7) {
                System.out.println("Situacao: Aprovado");
            } else {
                System.out.println("Situacao: Reprovado");
            }

            System.out.println();
        }

        System.out.println("Aluno com maior nota na primeira prova:");
        System.out.println("Nome: " + alunos[alunoMaiorNotaProva1].nome);
        System.out.println("Matricula: " + alunos[alunoMaiorNotaProva1].matricula);


    }
}