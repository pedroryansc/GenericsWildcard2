package generics.atv2;

import java.util.ArrayList;
import java.util.List;

public class Livro<T> {

	private List<Capitulo<T>> capitulos = new ArrayList<>();
	
	public boolean escrever(Capitulo<T> capitulo) {
		for(int i = 0; i < capitulos.size(); i++) {
			if(capitulo.getNumero() == capitulos.get(i).getNumero())
				return false;
		}
		capitulos.add(capitulo);
		return true;
	}
	
	public List<Capitulo<T>> mostrarLista(){
		return capitulos;
	}
	
}