package calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int respuestaUsuario;
		
		do {
			System.out.println("Menú calculadora");
			System.out.println("----------------");
			System.out.println("1. Dividir");
			System.out.println("0. Salir");
			System.out.print("Dime una opción: ");
			respuestaUsuario = Integer.parseInt(s.nextLine());

			System.out.println();

			switch (respuestaUsuario) {
			case 0:
				System.out.println("Has salido al programa");
				break;
			case 1:
				System.out.println("Dime un número: ");
				int numero1 = Integer.parseInt(s.nextLine());

				System.out.println("Dime otro número: ");
				int numero2 = Integer.parseInt(s.nextLine());

				System.out.println();

				double resultado = numero1 / numero2;

				System.out.printf("El resultado de %d / %d es: %.1f\n", numero1, numero2, resultado);

				break;
			}
		} while (respuestaUsuario != 0);

		System.out.println();
	}
}
