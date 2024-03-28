package wildcard.atv2;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		List<Number> numeros = new ArrayList<>();
		numeros.add(5);
		numeros.add(13);
		
		Numeros.adicionarNumeros(numeros, 5.1);
		
		System.out.println(numeros);
		
	}
}