package service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import model.Funcionario;
import validacao.ValidacaoException;

public class ReajusteSalario {


  // A classe não está coesa pois este método adiciona regra de negocio a uma classe de modelo
   public void reajustarSalario( Funcionario funcionario,BigDecimal salario,BigDecimal aumento){
    BigDecimal percentualReajuste=aumento.divide(salario,RoundingMode.HALF_UP);
    if(percentualReajuste.compareTo(new BigDecimal("0.4"))>0){
      throw new ValidacaoException("Reajuste nao pode ser superior a 40%");
    }
    BigDecimal salarioReajustado=salario.add(aumento);
    funcionario.atualizarSalario(salarioReajustado);
  }
}
