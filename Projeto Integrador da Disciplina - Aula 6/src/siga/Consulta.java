package siga;

public class Consulta {

    private String tabela;
    private String where;
    private String ordenarPor;
    private int inicio;
    private int limite;
    private int ano;
    private boolean distintos;

    public Consulta(String tabela, String where, String ordenarPor,
                    int inicio, int limite, int ano, boolean distintos) {
        this.tabela = tabela;
        this.where = where;
        this.ordenarPor = ordenarPor;
        this.inicio = inicio;
        this.limite = limite;
        this.ano = ano;
        this.distintos = distintos;
    }

    public String getTabela() {
        return tabela;
    }

    public String getWhere() {
        return where;
    }

    public String getOrdenarPor() {
        return ordenarPor;
    }

    public int getInicio() {
        return inicio;
    }

    public int getLimite() {
        return limite;
    }

    public int getAno() {
        return ano;
    }

    public boolean isDistintos() {
        return distintos;
    }
}