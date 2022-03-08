package prueba;

public class Mayor_menor {
	
private double num1, num2, num3, num4, num5;
	
	public Mayor_menor() {
		
	}
	
	public void setnum1(double n1) {
		num1 = n1;
	}
	
	public double getnum1() {
		return num1;
	}
	
	public void setnum2(double n2) {
		num2 = n2;
	}
	
	public double getnum2() {
		return num2;
	}
	
	public void setnum3(double n3) {
		num3 = n3;
	}
	
	public double getnum3() {
		return num3;
	}
	
	public void setnum4(double n4) {
		num4 = n4;
	}
	
	public double getnum4() {
		return num4;
	}
	
	public void setnum5(double n5) {
		num5 = n5;
	}
	
	public double getnum5() {
		return num5;
	}
	
	public String condicion_1(double num1, double num2, double num3) {
		return num1+" > "+num2+" > "+num3;
		
	}
	
	public String condicion_2(double num1, double num2, double num3) {
		String condicion2 = num1+" > "+num3+" > "+num2;
		return condicion2;
	}
	
	public String condicion_3(double num1, double num2, double num3) {
		String condicion3 = num2+" > "+num1+" > "+num3;
		return condicion3;
	}
	
	public String condicion_4(double num1, double num2, double num3) {
		String condicion4 = num2+" > "+num3+" > "+num1;
		return condicion4;
	}
	
	public String condicion_5(double num1, double num2, double num3) {
		String condicion5 = num3+" > "+num1+" > "+num2;
		return condicion5;
	}
	
	public String condicion_6(double num1, double num2, double num3) {
		String condicion6 = num3+" > "+num2+" > "+num1;
		return condicion6;
	}
	
	public double elevar(double num4, double num5) {
		double elevar = Math.pow(num4,num5);
		return elevar;
	}
}
