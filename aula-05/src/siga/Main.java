package siga;

/**
 * Ponto de entrada do SIGA.
 * Demonstra o uso do padrão Factory Method.
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("=== SIGA - Factory Method ===\n");

        GerenciadorLogin login = new GerenciadorLogin();

        // Criador do painel do aluno
        login.entrar(new CriadorPainelAluno());

        System.out.println();

        // Criador do painel do professor
        login.entrar(new CriadorPainelProfessor());

        System.out.println();

        // Criador do painel do coordenador
        login.entrar(new CriadorPainelCoordenador());

        System.out.println();

        // Criador do painel da secretaria
        login.entrar(new CriadorPainelSecretaria());
    }
}