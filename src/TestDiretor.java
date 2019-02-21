import java.util.LinkedList;
import java.util.List;

public class TestDiretor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Professor> listaProfessores = new LinkedList<Professor>();
		
		Diretor diretorSl = new Diretor();
		
		Professor professor1 = new Professor();
		professor1.setNome("Erick");
		professor1.setEndereco("Rua: José Américo");
		professor1.setSexo("M");
		professor1.setMatricula(10928309);
		
		listaProfessores.add(professor1);
				
		Professor professor2 = new Professor();
		professor2.setNome("Alexandre");
		professor2.setEndereco("Rua: José Bonifácio");
		professor2.setSexo("M");
		professor2.setMatricula(10928308);
		
		listaProfessores.add(professor2);
		
		diretorSl.setProfessores(listaProfessores);
		
		
	}
}
