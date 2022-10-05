package validacao;

import java.math.BigDecimal;

import model.Funcionario;

public interface ValidacaoReajuste {
  public void validar(Funcionario funcionario,BigDecimal aumento);
}
