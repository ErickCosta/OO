
public class Pessoa {

	private double salario = 0;
	
	public Pessoa() {

	}
	
	public Pessoa(double salario) {
		this.salario = salario;
	}
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public abstract double calcularSalario() {
		return 0.0;
	}
}
