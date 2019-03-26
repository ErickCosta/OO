
public class PessoaFisica extends Pessoa {

	private int cpf = 0;
	
	public PessoaFisica() {
		
	}

	public PessoaFisica(int cpf) {
		this.cpf = cpf;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	public double calcularSalario() {
		return getSalario();
	}
}
