package prueba;

public class Menus {
	
	public Menus() {
		
	}
	
	public String menu_opciones() {
		String texto = "Elige una de las siguientes opciones\n1)Figuras geom�tricas\n2)Operaciones matem�ticas";
		return texto;
	}
	
	public String menu_figuras() {
		String texto = "Elige una de estas 3 opciones\n1-Cuadrado\n2-Tri�ngulo\n3-C�rculo";
		return texto;
	}
	
	public String menu_area_cua() {
		String texto = "C�lculo del �rea del CUADRADO\n�Lado?";
		return texto;
	}
	
	public String menu_perm_si_o_no() {
		String texto = "�Quieres calcular el per�metro tambi�n?\nElige 1 si lo deseas\nEn su defecto elige cualquier otro n�mero si no quieres calcularlo";	
		return texto;
	}
	
	public String menu_perm_cua() {
		String texto = "C�lculo del per�metro del CUADRADO\n�Lado?";
		return texto;
	}
	
	public String menu_area_tri() {
		String texto = "C�lculo del �rea del TRI�NGULO\n�Base y Altura?";
		return texto;
	}
	
	public String menu_perm_tri() {
		String texto = "C�lculo del per�metro del TRI�NGULO";
		return texto;
	}
	
	public String menu_area_circ() {
		String texto = "C�lculo del �rea del C�RCULO\n�Radio?";
		return texto;
	}
	
	public String menu_perm_circ() {
		String texto = "C�lculo del per�metro del C�RCULO\n�Radio?";
		return texto;
	}
	
	public String menu_operaciones() {
		String texto = "Operaciones matem�ticas\nElige una de estas 2 opciones\n1-Mayor o menor\n2-Elevar un n�mero";
		return texto;
	}
	
	public String menu_final() {
		String texto = "�Desea volver al men� principal?\n1) si\n2) no";
		return texto;
	}
}
