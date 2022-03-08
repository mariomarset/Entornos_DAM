package prueba;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main_operaciones_2 {

	public static void main(String[] args) {
		
		int opciones, alternativa, eleccion = 0;
		double num1, num2, num3, num4, num5 = 0;
		String insertado = "";
		String respuesta = "si";
		Scanner entrada = new Scanner(System.in);
		
		Menus menus1 = new Menus();
		Cuadrado cuadrado1 = new Cuadrado();
		Triangulo t = new Triangulo();
		Circulo circle = new Circulo();
		Mayor_menor signo = new Mayor_menor();
		
		do {
		
		try {
				
		System.out.println(menus1.menu_opciones());
		opciones = entrada.nextInt();
		
		switch (opciones) {
		case 1:
			System.out.println(menus1.menu_figuras());
			opciones = entrada.nextInt();
			
			if (opciones == 1) {
				System.out.println(menus1.menu_area_cua());
				double tamano = entrada.nextDouble();
				cuadrado1.setLado(tamano);
				System.out.println("El resultado del área del CUADRADO es "+cuadrado1.calcularArea());
				System.out.println("");
				System.out.println(menus1.menu_perm_si_o_no());
				alternativa = entrada.nextInt();
				if (alternativa == 1) {
					System.out.println(menus1.menu_perm_cua());
					tamano = entrada.nextDouble();
					cuadrado1.setLado(tamano);
					System.out.println("El resultado del perímetro del CUADRADO es "+cuadrado1.calcularPerimetro());
				}else if (alternativa == 2) {
					System.out.println("Finalizando el programa");
				}
			}else if (opciones == 2) {
				System.out.println(menus1.menu_area_tri());
				double base = entrada.nextDouble();
				double altura = entrada.nextDouble();
				System.out.println("¿Lados restantes del trángulo?");
				double lado2 = entrada.nextDouble();
				double lado3 = entrada.nextDouble();
				t.setBase(base);
				t.setAltura(altura);
				t.setLado2(lado2);
				t.setLado3(lado3);
				System.out.println("El resultado del área del TRIÁNGULO es "+t.calcularArea());
				System.out.println("");
				System.out.println(menus1.menu_perm_si_o_no());
				alternativa = entrada.nextInt();
				if (alternativa == 1) {
					System.out.println(menus1.menu_perm_tri());
					//base = entrada.nextDouble();
					//t.setBase(base);
					//double lado2 = entrada.nextDouble();
					//t.setLado2(lado2);
					//double lado3 = entrada.nextDouble();
					//t.setLado3(lado3);
					System.out.println("El resultado del perímetro del TRIÁNGULO es "+t.calcularPerimetro(lado2, lado3, base));
				}else if (alternativa == 2) {
					System.out.println("Finalizando el programa");
				}
			}else if (opciones == 3) {
				System.out.println(menus1.menu_area_circ());
				double rad = entrada.nextDouble();
				circle.setRadio(rad);
				System.out.println("Has introducido un radio de "+circle.getRadio());
				System.out.println("El área del círculo es: "+circle.calcularArea());
				System.out.println("");
				System.out.println(menus1.menu_perm_si_o_no());
				alternativa = entrada.nextInt();
				if (alternativa == 1) {
					System.out.println("Introduce el radio");
					rad = entrada.nextDouble();
					circle.setRadio(rad);;
					System.out.println("El resultado del perímetro del CÍRCULO es "+circle.calcularPerimetro());
				}else if (alternativa == 2) {
					System.out.println("Finalizando el programa");
				}
			}
		break;
		case 2:
			System.out.println(menus1.menu_operaciones());
			eleccion = entrada.nextInt();
			if (eleccion == 1) {
				System.out.println("Introduce 3 números por pantalla");
				num1 = entrada.nextDouble();
				num2 = entrada.nextDouble();
				num3 = entrada.nextDouble();
				
				if(num1>num2 && num1>num3 && num2>num3){
					System.out.println(signo.condicion_1(num1, num2, num3));
				}else if(num1>num3 && num1>num2 && num3>num2){
					System.out.println(signo.condicion_2(num1, num2, num3));
				}else if(num2>num1 && num2>num3 && num1>num3){
					System.out.println(signo.condicion_3(num1, num2, num3));
				}else if(num2>num3 && num2>num1 && num3>num1){
					System.out.println(signo.condicion_4(num1, num2, num3));
				}else if(num3>num1 && num3>num2 && num1>num2){
					System.out.println(signo.condicion_5(num1, num2, num3));
				}else if(num3>num2 && num3>num1 && num2>num1){
					System.out.println(signo.condicion_6(num1, num2, num3));
				}else if(num1 == num2 && num1 == num3 && num2 == num3) {
					System.out.println("Los números son iguales, por lo que no se puede hacer la comparación numérica");
				}
			}else if (eleccion == 2) {
				System.out.println("Introduce un número");
				num4 = entrada.nextDouble();
				System.out.println("Introduce el número a elevar");
				num5 = entrada.nextDouble();
				System.out.println("El resultado es "+signo.elevar(num4, num5));
			}
		break;	
				
		}
		
		System.out.println(menus1.menu_final());
		insertado = entrada.next();
		
		}catch(InputMismatchException e) {
			e.printStackTrace();
			System.out.println("El error en cuestión es "+e.getMessage());
			System.out.println("Has introducido un valor no numérico");
		}catch(Exception e) {
			System.out.println("Algo no está bien hecho. Revisa el código");
		}
	
	}while(respuesta.equals(insertado));

		entrada.close();
	}

}
