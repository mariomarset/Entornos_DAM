package prueba;

public class Menus {
	
	public Menus() {
		
	}
	
	public String menu_opciones() {
		String texto = "Elige una de las siguientes opciones\n1)Figuras geométricas\n2)Operaciones matemáticas";
		return texto;
	}
	
	public String menu_figuras() {
		String texto = "Elige una de estas 3 opciones\n1-Cuadrado\n2-Triángulo\n3-Círculo";
		return texto;
	}
	
	public String menu_area_cua() {
		String texto = "Cálculo del área del CUADRADO\n¿Lado?";
		return texto;
	}
	
	public String menu_perm_si_o_no() {
		String texto = "¿Quieres calcular el perímetro también?\nElige 1 si lo deseas\nEn su defecto elige cualquier otro número si no quieres calcularlo";	
		return texto;
	}
	
	public String menu_perm_cua() {
		String texto = "Cálculo del perímetro del CUADRADO\n¿Lado?";
		return texto;
	}
	
	public String menu_area_tri() {
		String texto = "Cálculo del área del TRIÁNGULO\n¿Base y Altura?";
		return texto;
	}
	
	public String menu_perm_tri() {
		String texto = "Cálculo del perímetro del TRIÁNGULO";
		return texto;
	}
	
	public String menu_area_circ() {
		String texto = "Cálculo del área del CÍRCULO\n¿Radio?";
		return texto;
	}
	
	public String menu_perm_circ() {
		String texto = "Cálculo del perímetro del CÍRCULO\n¿Radio?";
		return texto;
	}
	
	public String menu_operaciones() {
		String texto = "Operaciones matemáticas\nElige una de estas 2 opciones\n1-Mayor o menor\n2-Elevar un número";
		return texto;
	}
	
	public String menu_final() {
		String texto = "¿Desea volver al menú principal?\n1) si\n2) no";
		return texto;
	}
}
