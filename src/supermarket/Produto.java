package supermarket;

public class Produto {

	private String validade = "";
	private long codigoBarras = 0;
	private int id = 0;
	
	public Produto() {
		
	}
	
	public Produto(String validade,
					long codigoBarras,
					int id) {
		
		this.validade = validade;
		this.codigoBarras = codigoBarras;
		this.id = id;
	}
	
	public String getValidade() {
		return this.validade;
	}
	
	public void setValidade(String validade) {
		this.validade = validade;
	}
}
