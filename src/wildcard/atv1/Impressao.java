package wildcard.atv1;

import java.util.List;

public class Impressao {

	public static void imprimirLista(List<?> lista) {
		for(int i = 0; i < lista.size(); i++) {
			System.out.println("Item " + (i + 1) + " - " + lista.get(i));
		}
	}
	
}