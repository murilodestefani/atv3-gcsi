package imposto;

import java.math.BigDecimal;

import orcamento.calculo;

public class ISS implements Imposto {
    public BigDecimal calcular(calculo Calculo) {
        return Calculo.getValor().multiply(new BigDecimal("0.06"));
    }
}
