package siga;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("=== SIGA - Atividade de Refatoração SOLID ===\n");

        List<Aluno> alunos = Arrays.asList(
            new Aluno("Maria Silva", "2026001", "maria@exemplo.edu", 8.5, true),
            new Aluno("João Souza", "2026002", "joao@exemplo.edu", 6.0, false),
            new Aluno("Ana Pereira", "2026003", "ana@exemplo.edu", 9.2, false)
        );

        // SRP: cada classe possui uma responsabilidade.
        RelatorioFormatador formatador = new RelatorioFormatador();
        String conteudo = formatador.formatar(alunos);

        RelatorioRepositorio relatorioRepositorio = new RelatorioRepositorio();
        relatorioRepositorio.salvarEmArquivo(
            conteudo,
            "relatorios/alunos.txt"
        );

        ServicoEmail email = new ServicoEmail();
        email.enviarPorEmail(
            conteudo,
            "coordenacao@exemplo.edu"
        );

        System.out.println();

        // OCP + DIP: desconto e persistência são abstrações.
        MatriculaRepositorio repositorio = new GravadorMySQL();

        Matricula m1 = new Matricula(
            alunos.get(0),
            1000.0,
            new DescontoBolsista(),
            repositorio
        );

        Matricula m2 = new Matricula(
            alunos.get(1),
            1000.0,
            new SemDesconto(),
            repositorio
        );

        System.out.println(
            "Mensalidade (bolsista): " + m1.calcularMensalidade()
        );

        System.out.println(
            "Mensalidade (sem desconto): " + m2.calcularMensalidade()
        );

        m1.salvar();
        m2.salvar();
    }
}