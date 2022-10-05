package service.promocao;

import model.Cargo;
import model.Funcionario;
import validacao.ValidacaoException;

public class PromocaoService {

  public void promover(Funcionario funcionario, boolean metaBatida) {
    Cargo cargoAtual = funcionario.getCargo();
    if (Cargo.GERENTE == cargoAtual) {
      throw new ValidacaoException("Gerentes não podem ser promovidos");
    }
    if(metaBatida){
      Cargo novoCargo=cargoAtual.getProximoCargo();
      funcionario.promover(novoCargo);
    }
  }
}
