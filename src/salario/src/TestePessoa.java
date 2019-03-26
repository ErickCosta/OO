
public class TestePessoa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa p = new Pessoa(100);

		System.out.println(p.getSalario());
		System.out.println(p.calcularSalario());

		PessoaFisica pf = new PessoaFisica();
		pf.setSalario(850);
		pf.setCpf(1283091283);

		System.out.println(pf.calcularSalario());
		
		PessoaJuridica pj = new PessoaJuridica();
		pj.setSalario(500);
		pj.setBonificacao(0.3);
		pj.setCnpj(287349823);
		
		System.out.println(pj.calcularSalario());
	}

}
