// Classe que representa o Pedido
class Pedido {
    private java.util.List<Item> itens = new java.util.ArrayList<>();
    private Processopag tipoPagamento; // "cartao", "boleto"

    public void adicionarItem(Item item) {
        itens.add(item);
    }

    public java.util.List<Item> getItens() {
        return itens;
    }

    public Processopag getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(Processopag tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }
}