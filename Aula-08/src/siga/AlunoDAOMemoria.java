package siga;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class AlunoDAOMemoria implements AlunoDAO {
    private final Map<String, Aluno> armazem = new LinkedHashMap<>();

    @Override
    public void inserir(Aluno aluno) {
        if (armazem.putIfAbsent(aluno.getMatricula(), aluno) != null) {
            throw new IllegalStateException("Matrícula já cadastrada: " + aluno.getMatricula());
        }
    }

    @Override
    public Aluno buscarPorMatricula(String matricula) {
        return armazem.get(matricula);
    }

    @Override
    public List<Aluno> listarTodos() {
        return new ArrayList<>(armazem.values());
    }

    @Override
    public void atualizar(Aluno aluno) {
        if (armazem.replace(aluno.getMatricula(), aluno) == null) {
            throw new IllegalStateException("Aluno não encontrado: " + aluno.getMatricula());
        }
    }

    @Override
    public void remover(String matricula) {
        if (armazem.remove(matricula) == null) {
            throw new IllegalStateException("Aluno não encontrado: " + matricula);
        }
    }
}
