package codigo;
import java.text.DecimalFormat;
import java.util.Scanner;
import dimensiones.UNA;

public class Una_Dimension {
static int opcion = 0;
	
	public static void UNA() {
		UNA una = new UNA();
		Scanner teclado = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.println("Cuantos objetos son: "
				+ "\n1. Uno"
				+ "\n2. Dos"
				+ "\n3. Tres"
				+ "\n4. Cuatro"
				+ "\n5. Cinco"
				+ "\n#Recuerda que la masa es kg");
		opcion = teclado.nextInt();
		
		switch (opcion) {
			case 1:
				System.out.println("Usted eligió calcular el Centro de masa para un objeto."
						+ "\nIngrese los datos solicitados"
						+ "\n\nMasa: ");
				float masa1 = teclado.nextFloat();
				una.setMasa1(masa1);
				System.out.println("\nPosición: ");
				float posicion1 = teclado.nextFloat();
				una.setPosicion1(posicion1);
				
				double suma = ((una.getMasa1() * una.getPosicion1())/una.getMasa1());
				una.setSuma(suma);
				
				System.out.println("Centro de masa = " + df.format(una.getSuma()));
				break;
			case 2:
				System.out.println("Usted eligió calcular el Centro de masa para dos objetos."
						+ "\nIngrese los datos solicitados"
						+ "\n\nMasa 1: ");
				float masa11 = teclado.nextFloat();
				una.setMasa1(masa11);
				System.out.println("\nPosición 1: ");
				float posicion11 = teclado.nextFloat();
				una.setPosicion1(posicion11);
				
				System.out.println("\nMasa 2: ");
				float masa2 = teclado.nextFloat();
				una.setMasa2(masa2);
				System.out.println("\nPosición 2: ");
				float posicion2 = teclado.nextFloat();
				una.setPosicion2(posicion2);
				
				double suma2 = ((((una.getMasa1()* una.getPosicion1()))+ una.getMasa2() * una.getPosicion2()));
				una.setSuma(suma2);
				
				double centroDeMasa = (una.getSuma()/(una.getMasa1() + una.getMasa2()));
				una.setCentroDeMasa(centroDeMasa);
				
				System.out.println("Centro de masa = " + df.format(una.getCentroDeMasa()));
				break;				
			case 3:
				System.out.println("Usted eligió calcular el Centro de masa para Tres objetos."
						+ "\nIngrese los datos solicitados"
						+ "\n\nMasa 1: ");
				float masa111 = teclado.nextFloat();
				una.setMasa1(masa111);
				System.out.println("\nPosición 1: ");
				float posicion111 = teclado.nextFloat();
				una.setPosicion1(posicion111);
				
				System.out.println("\nMasa 2: ");
				float masa22 = teclado.nextFloat();
				una.setMasa2(masa22);
				System.out.println("\nPosición 2: ");
				float posicion22 = teclado.nextFloat();
				una.setPosicion2(posicion22);

				System.out.println("\nMasa 3: ");
				float masa3= teclado.nextFloat();
				una.setMasa3(masa3);
				System.out.println("\nPosición 3: ");
				float posicion3 = teclado.nextFloat();
				una.setPosicion3(posicion3);
				
				double suma22 = ((((una.getMasa1()* una.getPosicion1()))+ una.getMasa2() * una.getPosicion2()) + una.getMasa3() * una.getPosicion3() );
				una.setSuma(suma22);
				
				double centroDeMasa2 = (una.getSuma()/(una.getMasa1() + una.getMasa2() + una.getMasa3()));
				una.setCentroDeMasa(centroDeMasa2);
				
				System.out.println("Centro de masa = " + df.format(una.getCentroDeMasa()));
				break;
				
			case 4:
				System.out.println("Usted eligió calcular el Centro de masa para Cuatro objetos."
						+ "\nIngrese los datos solicitados"
						+ "\n\nMasa 1: ");
				float masa1111 = teclado.nextFloat();
				una.setMasa1(masa1111);
				System.out.println("\nPosición 1: ");
				float posicion1111 = teclado.nextFloat();
				una.setPosicion1(posicion1111);
				
				System.out.println("\nMasa 2: ");
				float masa222 = teclado.nextFloat();
				una.setMasa2(masa222);
				System.out.println("\nPosición 2: ");
				float posicion222 = teclado.nextFloat();
				una.setPosicion2(posicion222);

				System.out.println("\nMasa 3: ");
				float masa33= teclado.nextFloat();
				una.setMasa3(masa33);
				System.out.println("\nPosición 3: ");
				float posicion33 = teclado.nextFloat();
				una.setPosicion3(posicion33);
				
				System.out.println("\nMasa 4: ");
				float masa4= teclado.nextFloat();
				una.setMasa4(masa4);
				System.out.println("\nPosición 4: ");
				float posicion4 = teclado.nextFloat();
				una.setPosicion4(posicion4);
				
				double suma222 = ((((una.getMasa1()* una.getPosicion1()))+ (una.getMasa2() * una.getPosicion2())) + (una.getMasa3() * una.getPosicion3()) + (una.getMasa4() * una.getPosicion4()));
				una.setSuma(suma222);
				
				double centroDeMasa22 = (una.getSuma()/(una.getMasa1() + una.getMasa2() + una.getMasa3()+ una.getMasa4()));
				una.setCentroDeMasa(centroDeMasa22);
				
				System.out.println("Centro de masa = " + df.format(una.getCentroDeMasa()));
				break;
				
			case 5:
				System.out.println("Usted eligió calcular el Centro de masa para Cinco objetos."
						+ "\nIngrese los datos solicitados"
						+ "\n\nMasa 1: ");
				float masa11111 = teclado.nextFloat();
				una.setMasa1(masa11111);
				System.out.println("\nPosición 1: ");
				float posicion11111 = teclado.nextFloat();
				una.setPosicion1(posicion11111);
				
				System.out.println("\nMasa 2: ");
				float masa2222 = teclado.nextFloat();
				una.setMasa2(masa2222);
				System.out.println("\nPosición 2: ");
				float posicion2222 = teclado.nextFloat();
				una.setPosicion2(posicion2222);

				System.out.println("\nMasa 3: ");
				float masa333= teclado.nextFloat();
				una.setMasa3(masa333);
				System.out.println("\nPosición 3: ");
				float posicion333 = teclado.nextFloat();
				una.setPosicion3(posicion333);
				
				System.out.println("\nMasa 4: ");
				float masa44= teclado.nextFloat();
				una.setMasa4(masa44);
				System.out.println("\nPosición 4: ");
				float posicion44 = teclado.nextFloat();
				una.setPosicion4(posicion44);
				
				System.out.println("\nMasa 5: ");
				float masa5= teclado.nextFloat();
				una.setMasa5(masa5);
				System.out.println("\nPosición 5: ");
				float posicion5 = teclado.nextFloat();
				una.setPosicion5(posicion5);
				
				double suma2222 = ((((una.getMasa1()* una.getPosicion1()))+ 
						(una.getMasa2() * una.getPosicion2())) 
						+ (una.getMasa3() * una.getPosicion3()) 
						+ (una.getMasa4() * una.getPosicion4())+ (una.getMasa5() * una.getPosicion5()));
				una.setSuma(suma2222);
				
				double centroDeMasa222 = (una.getSuma()/(una.getMasa1() + una.getMasa2() + una.getMasa3()+ una.getMasa4() + una.getMasa5()));
				una.setCentroDeMasa(centroDeMasa222);
				
				System.out.println("Centro de masa = " + df.format(una.getCentroDeMasa()));
				break;


			default:
				System.out.println("Disculpe pero por el "
						+ "momento solo se puede reolver las operaciones"
						+ "con ese numero de objetos, seleccione una opción válida ");
				break;
				
		}
		While mientras = new While();
		mientras.acceso();
			
			
	}}

