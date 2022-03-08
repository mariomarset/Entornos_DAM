package prueba;

public class Triangulo {
	
	double base;	//lado1
	double altura;
	double lado2;
	double lado3;
	
	public Triangulo() {
		
	}
	
	public void setBase(double b) {
		base = b;
	}
	
	public void setAltura(double a) {
		altura = a;
	}
	
	public void setLado2(double l) {
		lado2 = l;
	}
	
	public void setLado3(double lad) {
		lado2 = lad;
	}
	
	public double getBase() {
		return base;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public double getLado2() {
		return lado2;
	}
	
	public double getLado3() {
		return lado3;
	}
	
	public double calcularArea() {
		return base*altura/2;
	}
	
	public double calcularPerimetro(double lado2, double lado3, double base) {
		return base + lado2 + lado3;
	}
}
