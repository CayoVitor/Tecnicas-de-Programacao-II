package siga;

public class Pessoa {

    protected String nome;
    protected boolean ativo;


    public void setNome(String nome) {
    this.nome = nome;
}

public String getNome() {
    return nome;
}

public void setAtivo(boolean ativo) {
    this.ativo = ativo;
}

public boolean getAtivo() {
    return ativo;
}
}