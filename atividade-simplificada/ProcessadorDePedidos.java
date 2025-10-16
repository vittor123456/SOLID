/**
 * ESTA É A CLASSE QUE VIOLA TODOS OS PRINCÍPIOS SOLID
 */
class ProcessadorDePedidos {
    // Violação do DIP: Depende diretamente da implementação concreta
    private MySQLRepositorio repositorio = new MySQLRepositorio();

    // Violação do SRP: Esta classe faz tudo
    public void processar(Pedido pedido) {
        // 1. Responsabilidade: Calcular o total
        double total = 0;
        for (Item item : pedido.getItens()) {
            total += item.getPreco();
        }
        System.out.println("Total do pedido: " + total);

        // 2. Responsabilidade: Processar o pagamento
        // Violação do OCP: Aberto para modificação quando um novo pagamento surgir
        if (pedido.getTipoPagamento().equals("cartao")) {
            System.out.println("Processando pagamento via Cartão de Crédito...");
            // Lógica específica para cartão
        } else if (pedido.getTipoPagamento().equals("boleto")) {
            System.out.println("Processando pagamento via Boleto Bancário...");
            // Lógica específica para boleto
        }

        // 3. Responsabilidade: Salvar no banco
        repositorio.salvar(pedido);

        // 4. Responsabilidade: Enviar e-mail
        System.out.println("Enviando e-mail de confirmação...");
        // Lógica de envio de e-mail
    }
}