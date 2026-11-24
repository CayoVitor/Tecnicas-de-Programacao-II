package siga;

/**
 * Sistema de Gestão Acadêmica Simplificado (SIGA)
 * Técnicas de Programação II - Fatec de Porto Ferreira
 *
 * ATENÇÃO: código INICIAL da disciplina.
 * Esta classe apresenta, propositalmente, problemas de orientação a objetos
 * que serão corrigidos na atividade prática da Aula 1.
 *
 * Problema principal: os atributos são PÚBLICOS, expondo o estado interno
 * do objeto e permitindo que qualquer código o coloque em um estado inválido
 * (por exemplo, uma média negativa ou maior que 10).
 */
public class Aluno extends Pessoa {

    // Atributos públicos: violação do encapsulamento
    public void setNome(String nome) {
    this.nome = nome;
}
    public String getNome() {
    return nome;
}

    private String matricula;
    public void setMatricula(String matricula) {
    this.matricula = matricula;
}
    public String getMatricula() {
    return matricula;
}
    

    private double media;
    public void setMedia(double media) {
        if (media < 0 || media > 10) {
        throw new IllegalArgumentException("A média deve estar entre 0 e 10.");
    }
    this.media = media;
}
    public double getMedia() {
    return media;
}

   
    public void setAtivo(boolean ativo) {
    this.ativo = ativo;
}
    public boolean getAtivo() {
    return ativo;
}

    // Sem construtor: o objeto pode ser criado em estado incompleto/inconsistente.
}
