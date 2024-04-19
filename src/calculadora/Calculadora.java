package calculadora;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		int num = 1;
		int numeroOperacion = 0;
		
		Scanner s = new Scanner(System.in);

		System.out.println("Introduzca un numero del menu:" + "\n1. Multiplicacion " + "\n2. Division " + "\n3. Sumar"
				+ "\n0. Salir");
		while (num != 0) {
			int numeroMenu = 0;
			System.out.println("\nIntroduzca un numero del menu:" + "\n1. Multiplicacion " + "\n2. Division "
					+ "\n3. Sumar" + "\n0. Salir");
			numeroMenu = Integer.parseInt(s.nextLine());

			switch (numeroMenu) {
			case 0:
				System.out.println("Saliendo de la calculadora");
				num = 0;
				break;
			case 3:
				System.out.println(" indique el numero a sumar :");
				numeroOperacion+= Integer.parseInt(s.nextLine());

			}
			System.out.println("Resultado suma:"+numeroOperacion);

		}

	}

}
