package generics.atv1;

import java.util.ArrayList;
import java.util.List;

public class Apartamento <T extends Item> {

	private List<T> itens = new ArrayList<>();
	
	public void acomodar(T item) {
		itens.add(item);
	}
	
	public void mostraItens() {
		for(T item : itens)
			System.out.println(item);
	}
	
}