
public class TesteAnimais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal = new Animal();
		
		animal.setNome("Joaquin");
		animal.setPeso(10);
		
		System.out.println(animal.getNome());
		System.out.println(animal.getPeso());
		System.out.println(animal.emitirSom());
		
		Cachorro cachorro = new Cachorro();
		
		cachorro.setNome("Baleia");
		cachorro.setPeso(8);
		
		System.out.println(cachorro.getNome());
		System.out.println(cachorro.getPeso());
		System.out.println(cachorro.emitirSom());
	}

}
