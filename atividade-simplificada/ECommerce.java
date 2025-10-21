public class ECommerce {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        MySQLRepositorio banco = new MySQLRepositorio();
        pedido.adicionarItem(new Item("Teclado", 250.0));
        pedido.adicionarItem(new Item("Mouse", 150.0));
        pedido.setTipoPagamento(new Cartao ());

        ProcessadorDePedidos processador = new ProcessadorDePedidos();
        processador.processar(pedido, banco);
    }
}