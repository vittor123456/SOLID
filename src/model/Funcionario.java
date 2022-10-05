package model;

import java.math.BigDecimal;
import java.time.LocalDate;

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

  public LocalDate getDataUltimoReajuste() {
    return dataUltimoReajuste;
  }

  public void setDataUltimoReajuste(LocalDate dataUltimoReajuste) {
    this.dataUltimoReajuste = dataUltimoReajuste;
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

  public void atualizarSalario(BigDecimal salarioReajustado) {
    this.salario = salarioReajustado;
    this.dataUltimoReajuste = LocalDate.now();
  }
}
