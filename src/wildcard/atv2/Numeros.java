package wildcard.atv2;

import java.util.List;

public class Numeros {

	public static void adicionarNumeros(List<? super Number> listaNumeros, Number numero) {
		listaNumeros.add(numero);
	}
	
}