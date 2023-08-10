package imposto;

import java.math.BigDecimal;
import orcamento.calculo;

public class calculoimposto {
    public BigDecimal calcular(calculo Calculo, Imposto imposto) {
        return imposto.calcular(Calculo);
    }
}
