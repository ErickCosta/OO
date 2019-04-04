
public class PessoaJuridica extends Pessoa {

	private int cnpj = 0;
	private double bonificacao = 0;
	public PessoaJuridica() {

	}

	public PessoaJuridica(int cnpj) {
		this.cnpj = cnpj;
	}

	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}
		
	public double getBonificacao() {
		return bonificacao;
	}

	public void setBonificacao(double bonificacao) {
		this.bonificacao = bonificacao;
	}

	public double calcularSalario() {
		return (getSalario() * getBonificacao() * 2) + getSalario();
	}
}
