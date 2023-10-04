/*
Neste código, a classe Cliente possui múltiplas responsabilidades. 
Ela não apenas gerencia os dados do cliente, mas também lida com a tarefa de salvar o cliente no banco de dados, 
enviar emails de confirmação e gerar faturas. Isso viola o SRP, 
pois uma classe deve ter apenas um motivo para mudar.

Crie uma versão seguindo o princípio de responsabilidade única na pasta solução
*/ 
public class Cliente {
    private String nome;
    private String email;
    private String endereco;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void salvarClienteNoBancoDeDados() {
        // Código para salvar os detalhes do cliente no banco de dados
    }

    public void enviarEmailConfirmacao() {
        // Código para enviar um email de confirmação para o cliente
    }

    public void gerarFatura() {
        // Código para gerar uma fatura para o cliente
    }
}