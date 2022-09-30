import java.math.BigDecimal;

import model.Cargo;
import model.Funcionario;

public class App {
  public static void main(String[] args) {
    Funcionario f = new Funcionario("Marcelo", Cargo.GERENTE, new BigDecimal("5000"));
    try {
      f.reajustarSalario(new BigDecimal("10000"));
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
