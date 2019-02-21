import java.util.LinkedList;
import java.util.List;

public class Diretor extends Funcionario {
	
	private List<Professor> professores = new LinkedList<Professor>();
	
	public void setProfessores(List<Professor> professores) {
		this.professores = professores;
	}
	
	public List<Professor> getProfessores(){
		return this.professores;
	}
	
}
