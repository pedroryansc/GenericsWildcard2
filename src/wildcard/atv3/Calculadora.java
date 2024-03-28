package wildcard.atv3;

import java.util.List;

public class Calculadora {

	public static double calcularMedia(List<? extends Number> lista) {
		double soma = 0;
		for(Number numero : lista) {
			soma += numero.doubleValue();
		}
		double media = soma / lista.size();
		return (media);
	}
	
}