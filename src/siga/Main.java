package siga;

public class Main {

    public static void main(String[] args) {
        System.out.println("=== SIGA - Sistema de Gestão Acadêmica Simplificado ===");
        

        Aluno a1 = new Aluno();

        a1.setNome("Maria Silva");
        a1.setMatricula("2026001");
        a1.setMedia(8.5);
        a1.setAtivo(true);

        Aluno a2 = new Aluno();


        a2.setNome("João Souza");
        a2.setMatricula("2026001");
        a2.setMedia(6);  
        a2.setAtivo(true);

        imprimirAluno(a1);
        imprimirAluno(a2);

        Professor p1 = new Professor();

        p1.setNome("Ana Pereira");
        p1.setSiape("SP12345");
        p1.setAtivo(true);
        System.out.println("Professor: " + p1.getNome() + " (SIAPE " + p1.getSiape() + ")");

    }

    // Método utilitário para exibir os dados de um aluno.
    private static void imprimirAluno(Aluno aluno) {
        System.out.println("Aluno: " + aluno.getNome()
                + " | Matrícula: " + aluno.getMatricula()
                + " | Média: " + aluno.getMedia()
                + " | Ativo: " + (aluno.getAtivo() ? "sim" : "não"));
    }
}
