
import processopag
import Calculadora
class ProcessadorDePedidos {

    public void processar(Pedido pedido, Banco banco){

    Calculadora.calcular(pedido); 

    pedido.getTipoPagamento().processar();
        
    banco.salvar(pedido);

    EnvEmail.enviar();

    }
}