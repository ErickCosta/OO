import java.util.LinkedList;

public abstract class Operacao implements IOperacao{

	public abstract String calcularOperacao(LinkedList<Double> valores);
	
}
