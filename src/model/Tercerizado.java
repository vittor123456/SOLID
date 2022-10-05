package model;

import java.math.BigDecimal;

/*Tercerizado está herdando promocao e atualizar salario o que está errado. Quem faz a promocao/ajusta o salario do tercerizado é a empresa contratada e não a empresa na qual o tercerizado trabalha.

Devido a isto a classe Tercerizado deixou de herdar de funcionario para apenas ter como composisao Dados Pessoais
public class Tercerizado extends Funcionario {*/

public class Tercerizado {
  private String empresa;
  private DadosPessoais dadosPessoais;

  public Tercerizado(String nome, String cpf,Cargo cargo, BigDecimal salario,String empresa) {
    this.dadosPessoais=new DadosPessoais(nome, cargo,salario);
    this.empresa=empresa;
}

  public String getEmpresa() {
    return empresa;
  }

  public void setEmpresa(String empresa) {
    this.empresa = empresa;
  }

}
