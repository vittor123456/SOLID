package model;

import java.math.BigDecimal;

public class DadosPessoais {

  private String nome;
  private Cargo cargo;
  private BigDecimal salario;

  public DadosPessoais(String nome, Cargo cargo, BigDecimal salario) {
    this.nome = nome;
    this.cargo = cargo;
    this.salario = salario;
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

  public BigDecimal getSalario() {
    return salario;
  }

  public void setSalario(BigDecimal salario) {
    this.salario = salario;
  }
}
