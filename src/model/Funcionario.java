package model;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

import validacao.ValidacaoException;

public class Funcionario {
  private String nome;
  private Cargo cargo;
  private BigDecimal salario;
  private LocalDate dataUltimoReajuste;

  
  public Funcionario(String nome, Cargo cargo, BigDecimal salario) {
    this.nome = nome;
    this.cargo = cargo;
    this.salario = salario;
  }

  // A classe não está coesa pois este método adiciona regra de negocio a uma classe de modelo
  public void reajustarSalario(BigDecimal aumento){
    BigDecimal percentualReajuste=aumento.divide(salario,RoundingMode.HALF_UP);
    if(percentualReajuste.compareTo(new BigDecimal("0.4"))>0){
      throw new ValidacaoException("Reajuste nao pode ser superior a 40%");
    }
    this.salario=this.salario.add(aumento);
    this.dataUltimoReajuste=LocalDate.now();
  }
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public Cargo getCargo() {
    return cargo;
  }
  public void setCargo(Cargo cargo) {
    this.cargo = cargo;
  }

  
}
