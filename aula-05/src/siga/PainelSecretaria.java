package siga;

public class PainelSecretaria implements Painel {

    @Override
    public void montar() {
        System.out.println("=== Painel da Secretaria ===");
        System.out.println("- Atendimento aos alunos");
        System.out.println("- Matrículas");
        System.out.println("- Documentação");
    }
}