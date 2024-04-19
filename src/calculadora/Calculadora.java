package calculadora;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int opcion;

		do {
			System.out.println("-----CALCULADORA----");
			System.out.println("0. Salir");
			System.out.println("1. Multiplicar");
			System.out.println("2. Dividir");
			System.out.println("3. Sumar");
			System.out.println("--------------------");
			System.out.print("Elige una opción: ");
			opcion = Integer.parseInt(teclado.nextLine());

			switch (opcion) {
			case 1:
				System.out.print("Introduce el primer valor: ");
				double valor1 = Integer.parseInt(teclado.nextLine());

				System.out.print("Introduce el segundo valor: ");
				double valor2 = Integer.parseInt(teclado.nextLine());

				System.out.printf("El resultado es: %.2f\n", valor1 * valor2);

				break;
			case 2:
				System.out.print("Introduce el primer valor: ");
				double numero1 = Integer.parseInt(teclado.nextLine());

				System.out.print("Introduce el segundo valor: ");
				double numero2 = Integer.parseInt(teclado.nextLine());

				System.out.printf("El resultado es: %.2f\n", numero1 / numero2);

				break;

			case 3:
				System.out.print("Introduce el primer valor: ");
				double num1 = Integer.parseInt(teclado.nextLine());
				System.out.print("Introduce el segundo valor: ");
				double num2 = Integer.parseInt(teclado.nextLine());

				System.out.printf("El resultado es: %.2f\n", num1 + num2);

			}

		} while (opcion != 0);

		teclado.close();

	}

}
