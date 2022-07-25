package codigo;
import java.util.Scanner;

public class inicio {
	public static void main(String[] args) {	
		Calculadora();

}
	public static void Calculadora() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Hola que tal, soy tu calculadora R2-D2, te ayudare a calcular los centros de masa. "
				+ "\nDime en cuantas dimensiones esta el objeto"
				+ "\n1. Una"
				+ "\n2. Dos"
				+ "\n3. Tres"
				+ "\n#Presiona el numero de la dimension");
		int opcion = teclado.nextInt();

		switch (opcion) {
			case 1:
				System.out.println("Usted eligió una Dimension ");
				Una_Dimension.UNA();
				break;
				
			case 2:
				System.out.println("Usted eligió dos Dimensiones");
				Dos_Dimensiones.DOS();
				break;
			
			case 3:
				System.out.println("Usted eligió tres Dimensiones");
				Tres_Dimensiones.TRES();
				break;
			
			default:
				System.out.println("Elija una opción correcta");
				Calculadora();
				break;	
	}
		


}
}

