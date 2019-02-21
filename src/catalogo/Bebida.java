package catalogo;

public class Bebida {
	
	private String nome = "";
	private String embalagem = "";
	private int mililitros = 0;
	private long codigoBarras = 0;
	private long id = 0;
	
	public Bebida() {
		
	}
	
	public Bebida(String nome,
						String embalagem,
						int mililitros,
						long codigoBarras,
						long id) {
		
		this.nome = nome;
		this.embalagem = embalagem;
		this.mililitros = mililitros;
		this.codigoBarras = codigoBarras;
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmbalagem() {
		return embalagem;
	}
	public void setEmbalagem(String embalagem) {
		this.embalagem = embalagem;
	}
	public int getMililitros() {
		return mililitros;
	}
	public void setMililitros(int mililitros) {
		this.mililitros = mililitros;
	}
	public long getCodigoBarras() {
		return codigoBarras;
	}
	public void setCodigoBarras(long codigoBarras) {
		this.codigoBarras = codigoBarras;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
}
