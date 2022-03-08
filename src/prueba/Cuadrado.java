package prueba;

public class Cuadrado {
	
	double lado;
	
	public Cuadrado() {
		
	}
	
	public void setLado(double l) {
		lado = l;
	}
	
	public double getLado() {
		return lado;
	}
	
	public double calcularArea() {
		return lado*lado;
	}
	
	public double calcularPerimetro() {
		return lado*4;
	}
}
