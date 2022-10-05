package service;

import java.math.BigDecimal;
import java.util.List;

import model.Funcionario;
import validacao.ValidacaoReajuste;

public class ReajusteSalarioService {

  /**
   * Inversao de Depencia, A classe ReajusteSalarioService (implementacao) depende da abstracao ValidacaoReajuste (interface) e não das implementações desta interface.
   */
  private List<ValidacaoReajuste> validacoes;

  public ReajusteSalarioService(List<ValidacaoReajuste> validacoes) {
    this.validacoes = validacoes;
  }

  public void reajustarSalario(Funcionario funcionario, BigDecimal salario, BigDecimal aumento) {
    for (ValidacaoReajuste validacaoReajuste : validacoes) {
      validacaoReajuste.validar(funcionario, aumento);
    }
    BigDecimal salarioReajustado = salario.add(aumento);
    funcionario.atualizarSalario(salarioReajustado);
  }

}
