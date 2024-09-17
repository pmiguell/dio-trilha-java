public class Main {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Ana", 999888, 9.9);
        Aluno a2 = new Aluno("Carlos", 123321, 7.5);
        Aluno a3 = new Aluno("Bernardo", 142332, 8.90);
        Aluno a4 = new Aluno("Lucas", 142332, 3.90);

        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno(a1);
        gerenciadorAlunos.adicionarAluno(a2);
        gerenciadorAlunos.adicionarAluno(a3);
        gerenciadorAlunos.adicionarAluno(a4);

        gerenciadorAlunos.removerAlunoPorMatricula(999888);

        gerenciadorAlunos.exibirAlunos();
        System.out.println(gerenciadorAlunos.exibirAlunosPorNome());
        System.out.println(gerenciadorAlunos.exibirAlunosPorNota());
    }
}