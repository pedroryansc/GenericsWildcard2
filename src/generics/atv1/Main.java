package generics.atv1;

public class Main {
	public static void main(String[] args) {
		
		Apartamento ap = new Apartamento();
		// ou Apartamento<Item> ap = new Apartamento<>();
		
		Movel sofa = new Movel("Sofá", "Marrom");
		Eletrodomestico geladeira = new Eletrodomestico("Geladeira", "Branco", 48.8);
		
		ap.acomodar(sofa);
		ap.acomodar(geladeira);
		
		ap.mostraItens();
		
		ClasseSemExtends obj = new ClasseSemExtends();
		// ap.acomodar(obj); resulta em erro, pois ClasseSemExtends não é uma classe filha de Item
	}
}