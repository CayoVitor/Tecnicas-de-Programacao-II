package siga;

public class FabricaAlunoDAOMemoria extends FabricaAlunoDAO {
    @Override
    protected AlunoDAO criarDAO() {
        return new AlunoDAOMemoria();
    }
}
