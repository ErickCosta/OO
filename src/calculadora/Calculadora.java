import java.util.LinkedList;

public class Calculadora {

	private long id = 0;
	private String cor = "";
	private long tamanho = 0;
	private String modelo = "";
	private Operacao op = new Operacao();
	
	public Calculadora() {
	}
	public Calculadora(long id, String cor, long tamanho, String modelo) {
		this.id = id;
		this.cor = cor;
		this.tamanho = tamanho;
		this.modelo = modelo;
	}
	
	public String calcularSoma(LinkedList<Double> listaValores) {
		return op.somarValores(listaValores);
	}
	public String calcularSoma(double v1, double v2, double v3) {
		return String.valueOf(v1 + v2 + v3);
	}
	
	public String calcularSubtracao(double v1, double v2) {
		return String.valueOf(v1 - v2);
	}
	public String calcularMultiplicacao(double v1, double v2) {
		return String.valueOf(v1 * v2);
	}
	public String calcularDivisao(double v1, double v2) {
		
		if (v2 == 0) {
			return "Denominador zero! Não é possível realizar a divisão!";
		}
		
		return String.valueOf(v1 / v2);
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public long getTamanho() {
		return tamanho;
	}
	public void setTamanho(long tamanho) {
		this.tamanho = tamanho;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}	
}
