package siga;

import java.util.List;

public class ServicoAluno {
    private final AlunoDAO dao;

    public ServicoAluno(AlunoDAO dao) {
        this.dao = dao;
    }

    public void cadastrar(Aluno aluno) {
        validar(aluno);
        dao.inserir(aluno);
    }

    public Aluno consultar(String matricula) {
        Aluno aluno = dao.buscarPorMatricula(matricula);
        if (aluno == null) {
            throw new IllegalStateException("Aluno não encontrado: " + matricula);
        }
        return aluno;
    }

    public List<Aluno> listar() {
        return dao.listarTodos();
    }

    public void alterar(Aluno aluno) {
        validar(aluno);
        dao.atualizar(aluno);
    }

    public void excluir(String matricula) {
        dao.remover(matricula);
    }

    private void validar(Aluno aluno) {
        if (aluno == null || aluno.getNome() == null || aluno.getNome().isBlank()) {
            throw new IllegalArgumentException("Nome é obrigatório.");
        }
        if (aluno.getMatricula() == null || aluno.getMatricula().isBlank()) {
            throw new IllegalArgumentException("Matrícula é obrigatória.");
        }
        if (!Double.isFinite(aluno.getMedia()) || aluno.getMedia() < 0 || aluno.getMedia() > 10) {
            throw new IllegalArgumentException("Média deve estar entre 0 e 10.");
        }
    }
}
