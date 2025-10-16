/**
 * ESTA É A CLASSE QUE VIOLA TODOS OS PRINCÍPIOS SOLID
 */
import processopag
import Calculadora
class ProcessadorDePedidos {
    // Violação do DIP: Depende diretamente da implementação concreta
    private MySQLRepositorio repositorio = new MySQLRepositorio();

    // Violação do SRP: Esta classe faz tudo
    public void processar(Pedido pedido) {
        // 1. Responsabilidade: Calcular o total
       Calculadora.calcular(pedido)

        // 2. Responsabilidade: Processar o pagamento
        // Violação do OCP: Aberto para modificação quando um novo pagamento surgir
        

        // 3. Responsabilidade: Salvar no banco
        repositorio.salvar(pedido);

        // 4. Responsabilidade: Enviar e-mail
        System.out.println("Enviando e-mail de confirmação...");
        // Lógica de envio de e-mail
    }
}