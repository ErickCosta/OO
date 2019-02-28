package supermarket;

import java.util.LinkedList;

public class Prateleira {

	private LinkedList<Produto> produtos = new LinkedList<Produto>();
	
	private Secao secao = new Secao();

	public LinkedList<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(LinkedList<Produto> produtos) {
		this.produtos = produtos;
	}

	public Secao getSecao() {
		return secao;
	}

	public void setSecao(Secao secao) {
		this.secao = secao;
	}
	
	
	
}
