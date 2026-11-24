package siga;

public abstract class FabricaAlunoDAO {
    public final ServicoAluno criarServico() {
        return new ServicoAluno(criarDAO());
    }

    protected abstract AlunoDAO criarDAO();
}
