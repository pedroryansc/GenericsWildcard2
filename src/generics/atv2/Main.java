package generics.atv2;

public class Main {
	public static void main(String[] args) {
		
		Livro<String> livro = new Livro<>();
		
		Capitulo<String> cap1 = new Capitulo<>(1, "Uma Festa Inesperada");
		Capitulo<String> cap2 = new Capitulo<>(2, "Uma Descida de Barril");
		Capitulo<String> cap3 = new Capitulo<>(1, "Uma Festa Muito Mais que Esperada");
		
		livro.escrever(cap1);
		livro.escrever(cap2);
		livro.escrever(cap3);
		System.out.println(livro.mostrarLista());
		
	}
}