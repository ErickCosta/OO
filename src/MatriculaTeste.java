import java.util.Scanner;

public class MatriculaTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner l = new Scanner(System.in);
		Matricula matricula = new Matricula("Erick", 
											"Joana",
											"Jo�o",
											12536215,
											"01/09/1990");
		
			if(matricula.getNomeAluno().equals("Erick")) {
				System.out.println("Achei");
			}else {
				System.out.println("N�o achei");
			}
	
	}
	
}
