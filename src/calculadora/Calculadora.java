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
			System.out.println("4. Restar");
			System.out.println("--------------------");
			System.out.print("Elige una opción: ");
			opcion = Integer.parseInt(teclado.nextLine());

			switch (opcion) {
			case 1:
				System.out.print("Introduce el primer valor: ");
				double multiplicacion1 = Integer.parseInt(teclado.nextLine());

				System.out.print("Introduce el segundo valor: ");
				double multiplicacion2 = Integer.parseInt(teclado.nextLine());

				System.out.printf("El resultado es: %.2f\n", multiplicacion1 * multiplicacion2);

				break;
			case 2:
				System.out.print("Introduce el primer valor: ");
				double divison1 = Integer.parseInt(teclado.nextLine());

				System.out.print("Introduce el segundo valor: ");
				double division2 = Integer.parseInt(teclado.nextLine());

				System.out.printf("El resultado es: %.2f\n", divison1 / division2);

				break;

			case 3:
				System.out.print("Introduce el primer valor: ");
				double num1 = Integer.parseInt(teclado.nextLine());
				System.out.print("Introduce el segundo valor: ");
				double num2 = Integer.parseInt(teclado.nextLine());

				System.out.printf("El resultado es: %.2f\n", num1 + num2);

			case 4:
				System.out.print("Introduce el primer valor: ");
				double resta1 = Integer.parseInt(teclado.nextLine());

				System.out.print("Introduce el seg undo valor: ");
				double resta2 = Integer.parseInt(teclado.nextLine());

				System.out.printf("El resultado es: %.2f\n", resta1 - resta2);
				break;

			}

			System.out.println();

		} while (opcion != 0);

		System.out.println("Cerrando calculadora...");
		
		teclado.close();

	}

}
