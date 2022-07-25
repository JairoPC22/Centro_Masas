package codigo;

import java.util.Scanner;

public class While {
	public void acceso() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("\nEliga una opcion: " 
		+ "\n0. Salir del programa" 
		+ "\n1. Volver a inicio");
		int opcion = scanner.nextInt();

		while (opcion != 0 || opcion != 0) {
			inicio.Calculadora();

			opcion = scanner.nextInt();
		}
		System.out.println("\nGracias por usarme ten un buen dia \n"+
							"El programa ha finalizado....");
	}

}
