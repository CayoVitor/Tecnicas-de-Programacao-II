package siga;

public class AcessoDados {

    private static AcessoDados instancia;

    private FabricaBanco fabrica;

    private AcessoDados(FabricaBanco fabrica) {
        this.fabrica = fabrica;
    }

    public static AcessoDados getInstancia(FabricaBanco fabrica) {
        if (instancia == null) {
            instancia = new AcessoDados(fabrica);
        }

        return instancia;
    }

    public void conectar() {

        Conexao conexao = fabrica.criarConexao();
        Comando comando = fabrica.criarComando();

        conexao.abrir();
        comando.executar("SELECT * FROM aluno");
    }
}