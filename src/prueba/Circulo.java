package prueba;

public class Circulo {
	
	double radio;
	
	public Circulo() {
		
	}
	
	public void setRadio(double r) {
		radio = r;
	}
	
	public double getRadio() {
		return radio;
	}
	
	public double calcularArea() {
		return Math.PI*Math.pow(radio,2);
	}
	
	public double calcularPerimetro() {
		return 2*Math.PI*radio;
	}
}
