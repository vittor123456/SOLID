package model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Funcionario {

  private LocalDate dataUltimoReajuste;
  private DadosPessoais dadosPessoais;

  public Funcionario(String nome, Cargo cargo, BigDecimal salario) {
    dadosPessoais = new DadosPessoais(nome, cargo, salario);
  }

  public LocalDate getDataUltimoReajuste() {
    return dataUltimoReajuste;
  }

  public void setDataUltimoReajuste(LocalDate dataUltimoReajuste) {
    this.dataUltimoReajuste = dataUltimoReajuste;
  }

  public String getNome() {
    return dadosPessoais.getNome();
  }

  public void setNome(String nome) {
    dadosPessoais.setNome(nome);
  }

  public Cargo getCargo() {
    return dadosPessoais.getCargo();
  }

  public void setCargo(Cargo cargo) {
    dadosPessoais.setCargo(cargo);
  }

  public BigDecimal getSalario() {
    return dadosPessoais.getSalario();
  }

  public void setSalario(BigDecimal salario) {
    dadosPessoais.setSalario(salario);
  }

  public void atualizarSalario(BigDecimal salarioReajustado) {
    dadosPessoais.setSalario(salarioReajustado);
    this.dataUltimoReajuste = LocalDate.now();
  }

  public void promover(Cargo novoCargo) {
    dadosPessoais.setCargo(novoCargo);
  }
}
