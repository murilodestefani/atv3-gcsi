package calculo;

import java.math.BigDecimal;

import imposto.ICMS;
import imposto.ISS;
import imposto.calculoimposto;
import orcamento.calculo;

public class testando {
    public static void main(String[] args) {
        
        calculo Calculo = new calculo(new BigDecimal("100"));
        calculoimposto calculadora = new calculoimposto();
        System.out.println(calculadora.calcular(Calculo, new ICMS()));
        System.out.println(calculadora.calcular(Calculo, new ISS()));

    }
}
