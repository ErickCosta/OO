import java.util.LinkedList;

public class Soma extends Operacao implements IOperacao {
	
	public String calcularOperacao(LinkedList<Double> valores) {
		
		double soma = 0;
		for (int i = 0; i < valores.size(); i++) {
			soma = soma + valores.get(i);
		}
		
		return String.valueOf(soma);
	}
	
}
