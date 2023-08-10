package imposto;

import java.math.BigDecimal;

import orcamento.calculo;

public interface Imposto {
    BigDecimal calcular(calculo Calculo);
}
