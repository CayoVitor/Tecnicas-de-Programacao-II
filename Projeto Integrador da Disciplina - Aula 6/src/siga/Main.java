package siga;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== SIGA - Padrões Criacionais ===\n");

        // =========================
        // ABSTRACT FACTORY
        // =========================

        System.out.println("=== MySQL ===");

        FabricaBanco fabricaMySQL = new FabricaMySQL();

        AcessoDados acessoMySQL =
                AcessoDados.getInstancia(fabricaMySQL);

        acessoMySQL.conectar();

        System.out.println();

        // =========================
        // BUILDER
        // =========================

        System.out.println("=== Builder ===");

        Consulta consulta = new ConsultaBuilder()
                .tabela("aluno")
                .where("curso = 'DSM'")
                .ordenarPor("nome")
                .inicio(0)
                .limite(20)
                .ano(2026)
                .distintos(true)
                .build();

        System.out.println("Tabela: " + consulta.getTabela());
        System.out.println("WHERE: " + consulta.getWhere());
        System.out.println("Ordenar por: " + consulta.getOrdenarPor());
        System.out.println("Início: " + consulta.getInicio());
        System.out.println("Limite: " + consulta.getLimite());
        System.out.println("Ano: " + consulta.getAno());
        System.out.println("Distintos: " + consulta.isDistintos());

        System.out.println();

        // =========================
        // SINGLETON
        // =========================

        System.out.println("=== Singleton ===");

        AcessoDados acesso1 =
                AcessoDados.getInstancia(fabricaMySQL);

        AcessoDados acesso2 =
                AcessoDados.getInstancia(fabricaMySQL);

        System.out.println("Acesso 1 e Acesso 2 são a mesma instância? "
                + (acesso1 == acesso2));
    }
}