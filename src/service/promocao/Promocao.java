package service.promocao;

import java.math.BigDecimal;
import java.time.LocalDate;

import model.Cargo;
import model.Funcionario;
import validacao.ValidacaoException;

public class Promocao implements Reajuste {

  private BigDecimal valor;
  private LocalDate data;

  public Promocao(BigDecimal valor) {
    this.valor=valor;
    this.data=LocalDate.now();
  }

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

  @Override
  public BigDecimal valor() {
    return this.valor;
  }

  @Override
  public LocalDate data() {
   return this.data;
  }

  /* Como esta classe implementa a interface Reajuste, ela é obrigada a implementar este método. O problema é que a promoção de acordo com as regras de negócio não afeta o imposto de renda. Portanto, uma classe não deveria ser obrigada a implementar métodos que não necessita.
  O Princípio de Segregação de Interface afirma que uma classe não precisa implementar métodos não necessários.
   * @see service.promocao.Reajuste#valorImpostoDeRenda()
   */
  // @Override
  // public BigDecimal valorImpostoDeRenda() {
  //   // TODO Auto-generated method stub
  //   return null;
  // }
}
