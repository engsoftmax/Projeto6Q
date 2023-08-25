package Turma;

import java.util.ArrayList;
import java.util.List;

class Aluno {
    private int matricula;
    private String nome;
    private double notaProva1;
    private double notaProva2;
    private double notaTrabalho;

    public Aluno(int matricula, String nome, double notaProva1, double notaProva2, double notaTrabalho) {
        this.matricula = matricula;
        this.nome = nome;
        this.notaProva1 = notaProva1;
        this.notaProva2 = notaProva2;
        this.notaTrabalho = notaTrabalho;
    }

    public double calcularMedia() {
        double mediaProvas = (notaProva1 + notaProva2) * 2.5;
        double mediaTrabalho = notaTrabalho * 2.0;
        return (mediaProvas + mediaTrabalho) / 10.0;
    }

    public double calcularNotaFinal() {
        double media = calcularMedia();
        if (media < 6.0) {
            return 12.0 - media;
        }
        return 0.0;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }


class Turma {
    private String curso;
    private List<Aluno> alunos;

    public Turma(String curso) {
        this.curso = curso;
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void calcularMediasEFinais() {
        for (Aluno aluno : alunos) {
            System.out.println("Aluno: " + aluno.getNome());
            System.out.println("Média: " + aluno.calcularMedia());
            double notaFinal = aluno.calcularNotaFinal();
            if (notaFinal > 0) {
                System.out.println("Precisa de " + notaFinal + " na prova final.");
            } else {
                System.out.println("Aprovado!");
            }
            System.out.println();
        }
    }
}

    public static void main(String[] args) {
        Turma turma = new Turma("Engenharia");

        Aluno aluno1 = new Aluno(1, "João", 7.0, 6.5, 8.0);
        Aluno aluno2 = new Aluno(2, "Maria", 5.0, 6.0, 7.5);

        turma.adicionarAluno(aluno1);
        turma.adicionarAluno(aluno2);

        turma.calcularMediasEFinais();
    }
}
