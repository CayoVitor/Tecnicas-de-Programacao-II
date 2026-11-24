package siga;

import java.util.ArrayList;
import java.util.List;

public class AdaptadorSecretariaLegado implements FonteDeAlunos {
    private final SecretariaLegadoWS secretaria;

    public AdaptadorSecretariaLegado(SecretariaLegadoWS secretaria) {
        this.secretaria = secretaria;
    }

    @Override
    public List<Aluno> listar() {
        List<Aluno> alunos = new ArrayList<>();
        for (String[] linha : secretaria.consultarTabelaAlunos()) {
            Aluno aluno = new Aluno(linha[0], linha[1]);
            aluno.setAtivo("A".equalsIgnoreCase(linha[2]));
            alunos.add(aluno);
        }
        return alunos;
    }
}
