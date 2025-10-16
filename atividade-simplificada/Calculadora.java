class Calculadora{
    public static void calcular(Pedido Pedido){
         double total = 0;
        for (Item item : pedido.getItens()) {
            total += item.getPreco();
        }
        System.out.println("Total do pedido: " + total);
    }
}