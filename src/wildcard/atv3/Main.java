package wildcard.atv3;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		List<Integer> inteiros = new ArrayList<>();
		inteiros.add(5);
		inteiros.add(14);
		inteiros.add(18);
		
		System.out.println("A média dos números inteiros é " + Calculadora.calcularMedia(inteiros));
		
		List<Double> notas = new ArrayList<>();
		notas.add(7.5);
		notas.add(4.9);
		notas.add(8.9);
		notas.add(10.0);
		
		System.out.println("A média das notas é " + Calculadora.calcularMedia(notas));
		
	}
}
