
public class PressoaTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pessoa pessoa1 = new Pessoa();
		
		System.out.println(pessoa1.getNome());
		
		pessoa1.setNome("João");
		
		System.out.println(pessoa1.getNome());
		
		Pessoa pessoa2 = new Pessoa();
		
		pessoa2.setNome("Erick");
		
		String nomePessoa2 = pessoa2.getNome();
		
		pessoa2.setNome("Novo");
		
		System.out.println(pessoa2.getNome());
		
		pessoa1.setSexo(true);
		
		System.out.println(pessoa1.getSexo());
		

	}

}
