
public class Matricula {

	private String nomeAluno = "";
	private String nomeMae = "";
	private String nomePai = "";
	private int rgAluno = 0;
	private String dataNascAluno = "";
	
	public Matricula() {
		
	}
	
	public Matricula(String nomeAluno, 
			String nomeMae,
			String nomePai,
			int rgAluno,
			String dataNascAluno) {
		
		this.nomeAluno = nomeAluno;
		this.nomeMae = nomeMae;
		this.nomePai = nomePai;
		this.rgAluno = rgAluno;
		this.dataNascAluno = dataNascAluno;
	}
	
	public String getNomeAluno() {
		return nomeAluno;
	}
	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	public String getNomePai() {
		return nomePai;
	}
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	public int getRgAluno() {
		return rgAluno;
	}
	public void setRgAluno(int rgAluno) {
		
		this.rgAluno = rgAluno;
	}
	public String getDataNascAluno() {
		return dataNascAluno;
	}
	public void setDataNascAluno(String dataNascAluno) {
		this.dataNascAluno = dataNascAluno;
	}

}
