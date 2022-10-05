package validacao;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import model.Funcionario;

/**
 * Na inversao de dependencia, a implementacao depende da abstracao
 */
public class ValidacaoPeriodicidadeEntreAjustes implements ValidacaoReajuste{

  public void validar(Funcionario funcionario,BigDecimal aumento){
    LocalDate dataUltimoReajuste=funcionario.getDataUltimoReajuste();
    LocalDate dataAtual=LocalDate.now();
    long mesesDesdeUltimoReajuste=ChronoUnit.MONTHS.between(dataUltimoReajuste, dataAtual);
    if(mesesDesdeUltimoReajuste<6){
      throw new ValidacaoException("Intervalo de aumento deve ser maior que 6 meses.");
    }
  }
}