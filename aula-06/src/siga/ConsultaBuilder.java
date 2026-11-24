package siga;

public class ConsultaBuilder {

    private String tabela;
    private String where;
    private String ordenarPor;
    private int inicio;
    private int limite;
    private int ano;
    private boolean distintos;

    public ConsultaBuilder tabela(String tabela) {
        this.tabela = tabela;
        return this;
    }

    public ConsultaBuilder where(String where) {
        this.where = where;
        return this;
    }

    public ConsultaBuilder ordenarPor(String ordenarPor) {
        this.ordenarPor = ordenarPor;
        return this;
    }

    public ConsultaBuilder inicio(int inicio) {
        this.inicio = inicio;
        return this;
    }

    public ConsultaBuilder limite(int limite) {
        this.limite = limite;
        return this;
    }

    public ConsultaBuilder ano(int ano) {
        this.ano = ano;
        return this;
    }

    public ConsultaBuilder distintos(boolean distintos) {
        this.distintos = distintos;
        return this;
    }

    public Consulta build() {
        return new Consulta(
            tabela,
            where,
            ordenarPor,
            inicio,
            limite,
            ano,
            distintos
        );
    }
}