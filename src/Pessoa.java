//Representação da entidade pessoa
public class Pessoa {
	
	//Atributo referente ao nome de uma pessoa
	String nome = "";
	//Atributo referente ao sexo de uma pessoa (obs. false - Feminino true - Masculino)
	boolean sexo = false;
	//Atributo referente a idade de uma pessoa
	int idade = 0;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setSexo(boolean sexo) {
		this.sexo = sexo;
	}

	public boolean getSexo() {
		return this.sexo;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
}
