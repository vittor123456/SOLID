package service.promocao;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Anuenio implements Reajuste,ReajusteTributavel {


  private BigDecimal valor;
  private LocalDate data;

  public Anuenio(BigDecimal valor,LocalDate data) {
    this.valor=valor;
    this.data=LocalDate.now();
  }

  @Override
  public BigDecimal valor() {
    return this.valor;
  }

  @Override
  public LocalDate data() {
    return this.data;
  }

  @Override
  public BigDecimal valorImpostoDeRenda() {
    return valor.multiply(new BigDecimal("0.1", 0"));
  }
  
}
