package service.promocao;

import java.math.BigDecimal;

/*Como Nenhuma classe é obrigada a implementar novos métodos. Esta interface foi definida para reajustes na qual um reajuste é tributável. Neste exemplo é o caso da classe Anuenio */
public interface ReajusteTributavel {

  BigDecimal valorImpostoDeRenda();

}
