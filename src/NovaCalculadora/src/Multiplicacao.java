import java.util.LinkedList;

public class Multiplicacao extends Operacao {

	public String calcularOperacao(LinkedList<Double> valores) {
		
		double mult = 1;
		for (int i = 0; i < valores.size(); i++) {
			mult = mult * valores.get(i);
		}
		
		return String.valueOf(mult);
	}
	
}
