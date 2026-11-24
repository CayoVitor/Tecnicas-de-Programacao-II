package siga;

public class Main {
    public static void main(String[] args) {
        ServicoAluno servico = new FabricaAlunoDAOMemoria().criarServico();
        Aluno maria = new Aluno("Maria Silva", "2026001", 8.5);
        Aluno joao = new Aluno("João Souza", "2026002", 6.0);

        executar("Cadastrar Maria", () -> servico.cadastrar(maria));
        executar("Cadastrar João", () -> servico.cadastrar(joao));
        executar("Cadastrar matrícula duplicada", () -> servico.cadastrar(maria));
        System.out.println("Consulta: " + servico.consultar(maria.getMatricula()));
        executar("Alterar Maria", () -> servico.alterar(new Aluno("Maria Silva", "2026001", 9.0)));
        var copia = servico.listar();
        copia.clear();
        System.out.println("Após esvaziar a cópia: " + servico.listar());
        executar("Excluir João", () -> servico.excluir(joao.getMatricula()));
        executar("Excluir João novamente", () -> servico.excluir(joao.getMatricula()));
        executar("Cadastrar média inválida", () -> servico.cadastrar(new Aluno("Ana", "2026003", 50)));
        System.out.println("Lista final: " + servico.listar());
    }

    private static void executar(String operacao, Runnable acao) {
        try {
            acao.run();
            System.out.println(operacao + ": sucesso.");
        } catch (IllegalArgumentException | IllegalStateException erro) {
            System.out.println(operacao + ": " + erro.getMessage());
        }
    }
}
