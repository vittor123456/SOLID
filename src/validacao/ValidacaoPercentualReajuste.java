package validacao;

import java.math.BigDecimal;
import java.math.RoundingMode;

import model.Funcionario;

/**
 * Na inversao de dependencia, a implementacao depende da abstracao
 */
public class ValidacaoPercentualReajuste implements ValidacaoReajuste{
  
  public void validar(Funcionario funcionario,BigDecimal aumento) {
    BigDecimal percentualReajuste=aumento.divide(funcionario.getSalario(),RoundingMode.HALF_UP);
    if(percentualReajuste.compareTo(new BigDecimal("0.4"))>0){
      throw new ValidacaoException("Reajuste nao pode ser superior a 40%");
    }
  }
}
