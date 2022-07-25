package codigo;

import java.text.DecimalFormat;
import java.util.Scanner;
import dimensiones.DOS;

public class Dos_Dimensiones {
static int opcion = 0;
	
	public static void DOS() {
		DOS dos = new DOS();
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
					+ "\n\nMasa 1: ");
			float masa1 = teclado.nextFloat();
			dos.setMasa1(masa1);
			System.out.println("\nPosición en X: ");
			float posicion1 = teclado.nextFloat();
			dos.setPosicion1(posicion1);
			System.out.println("\nPosición en Y: ");
			float posicion3 = teclado.nextFloat();
			dos.setPosicion3(posicion3);
			
			
			double suma = (((dos.getMasa1()*dos.getPosicion1()))/((dos.getMasa1()+dos.getMasa2())));
			dos.setSuma(suma);
			double centroDeMasa = (((dos.getMasa1()*dos.getPosicion3()))/((dos.getMasa1()+dos.getMasa2())));
			dos.setCentroDeMasa(centroDeMasa);
			
			System.out.println("Centro de masa en X = " + df.format(dos.getSuma()));
			System.out.println("Centro de masa en Y = " + df.format(dos.getCentroDeMasa()));

			break;

		case 2:
				System.out.println("Usted eligió calcular el Centro de masa para dos objetos."
						+ "\nIngrese los datos solicitados"
						+ "\n\nMasa 1: ");
				float masa11 = teclado.nextFloat();
				dos.setMasa1(masa11);
				System.out.println("\nPosición en X: ");
				float posicion11 = teclado.nextFloat();
				dos.setPosicion1(posicion11);
				System.out.println("\nPosición en Y: ");
				float posicion33 = teclado.nextFloat();
				dos.setPosicion3(posicion33);
				
				System.out.println("\nMasa 2");
				float masa2 = teclado.nextFloat();
				dos.setMasa2(masa2);
				System.out.println("\nPosición en X: ");
				float posicion2 = teclado.nextFloat();
				dos.setPosicion2(posicion2);
				System.out.println("\nPosición en Y: ");
				float posicion4 = teclado.nextFloat();
				dos.setPosicion4(posicion4);
				
				double suma2 = (((dos.getMasa1()*dos.getPosicion1())+ (dos.getMasa2()*dos.getPosicion2()))/((dos.getMasa1()+dos.getMasa2())));
				dos.setSuma(suma2);
				double centroDeMasa2 = (((dos.getMasa1()*dos.getPosicion3())+ (dos.getMasa2()*dos.getPosicion4()))/((dos.getMasa1()+dos.getMasa2())));
				dos.setCentroDeMasa(centroDeMasa2);
				
				System.out.println("Centro de masa en X = " + df.format(dos.getSuma()));
				System.out.println("Centro de masa en Y = " + df.format(dos.getCentroDeMasa()));

				break;
		case 3:
			System.out.println("Usted eligió calcular el Centro de masa para Tres objetos."
					+ "\nIngrese los datos solicitados"
					+ "\n\nMasa 1: ");
			float masa111 = teclado.nextFloat();
			dos.setMasa1(masa111);
			System.out.println("\nPosición en X: ");
			float posicion111 = teclado.nextFloat();
			dos.setPosicion1(posicion111);
			System.out.println("\nPosición en Y: ");
			float posicion333 = teclado.nextFloat();
			dos.setPosicion3(posicion333);
			
			System.out.println("\nMasa 2");
			float masa22 = teclado.nextFloat();
			dos.setMasa2(masa22);
			System.out.println("\nPosición en X: ");
			float posicion22 = teclado.nextFloat();
			dos.setPosicion2(posicion22);
			System.out.println("\nPosición en Y: ");
			float posicion44 = teclado.nextFloat();
			dos.setPosicion4(posicion44);
			
			System.out.println("\nMasa 3");
			float masa3 = teclado.nextFloat();
			dos.setMasa3(masa3);
			System.out.println("\nPosición en X: ");
			float posicion5 = teclado.nextFloat();
			dos.setPosicion5(posicion5);
			System.out.println("\nPosición en Y: ");
			float posicion6 = teclado.nextFloat();
			dos.setPosicion6(posicion6);
			
			double suma22 = (((dos.getMasa1()*dos.getPosicion1())+ (dos.getMasa2()*dos.getPosicion2())+ (dos.getMasa3()*dos.getPosicion5()))/(dos.getMasa1()
					+dos.getMasa2()+dos.getMasa3()));
			dos.setSuma(suma22);
			double centroDeMasa22 = (((dos.getMasa1()*dos.getPosicion3())+ (dos.getMasa2()*dos.getPosicion4())+ (dos.getMasa3()*dos.getPosicion6()))/((dos.getMasa1()+dos.getMasa2() + dos.getMasa3())));
			dos.setCentroDeMasa(centroDeMasa22);
			
			System.out.println("Centro de masa en X = " + df.format(dos.getSuma()));
			System.out.println("Centro de masa en Y = " + df.format(dos.getCentroDeMasa()));

			break;
			
		case 4: 
			System.out.println("Usted eligió calcular el Centro de masa para Cuatro objetos."
					+ "\nIngrese los datos solicitados"
					+ "\n\nMasa 1: ");
			float masa1111 = teclado.nextFloat();
			dos.setMasa1(masa1111);
			System.out.println("\nPosición en X: ");
			float posicion1111 = teclado.nextFloat();
			dos.setPosicion1(posicion1111);
			System.out.println("\nPosición en Y: ");
			float posicion14 = teclado.nextFloat();
			dos.setPosicion2(posicion14);
			
			System.out.println("\nMasa 2");
			float masa222 = teclado.nextFloat();
			dos.setMasa2(masa222);
			System.out.println("\nPosición en X: ");
			float posicion444 = teclado.nextFloat();
			dos.setPosicion4(posicion444);
			System.out.println("\nPosición en Y: ");
			float posicion55 = teclado.nextFloat();
			dos.setPosicion5(posicion55);
			
			System.out.println("\nMasa 3");
			float masa33 = teclado.nextFloat();
			dos.setMasa3(masa33);
			System.out.println("\nPosición en X: ");
			float posicion66 = teclado.nextFloat();
			dos.setPosicion6(posicion66);
			System.out.println("\nPosición en Y: ");
			float posicion7 = teclado.nextFloat();
			dos.setPosicion7(posicion7);
			
			System.out.println("\nMasa 4");
			float masa4 = teclado.nextFloat();
			dos.setMasa4(masa4);
			System.out.println("\nPosición en X: ");
			float posicion8 = teclado.nextFloat();
			dos.setPosicion8(posicion8);
			System.out.println("\nPosición en Y: ");
			float posicion9 = teclado.nextFloat();
			dos.setPosicion9(posicion9);
			
			double suma44 = (((dos.getMasa1() * dos.getPosicion1()) + (dos.getMasa2() * dos.getPosicion4())
					+ (dos.getMasa3() * dos.getPosicion6())
					+ (dos.getMasa4() * dos.getPosicion8())) 
					/(dos.getMasa1() + dos.getMasa2() + dos.getMasa3() + dos.getMasa4())); 
			dos.setSuma(suma44);
			
			double centroDeMasa44 = (((dos.getMasa1() * dos.getPosicion2()) + (dos.getMasa2() * dos.getPosicion5())
					+ (dos.getMasa3() * dos.getPosicion7())
					+ (dos.getMasa4() * dos.getPosicion9())) 
					/(dos.getMasa1() + dos.getMasa2() + dos.getMasa3() + dos.getMasa4())); 
			dos.setCentroDeMasa(centroDeMasa44);
			
			System.out.println("\nCentro de masa en X = " + df.format(dos.getSuma()));
			System.out.println("Centro de masa en Y = " + df.format(dos.getCentroDeMasa()));

			break;
			
		case 5: 
			System.out.println("Usted eligió calcular el Centro de masa para Cinco objetos."
					+ "\nIngrese los datos solicitados"
					+ "\n\nMasa 1: ");
			float masa1p = teclado.nextFloat();
			dos.setMasa1(masa1p);
			System.out.println("\nPosición en X: ");
			float posicion1x = teclado.nextFloat();
			dos.setPosicion1(posicion1x);
			System.out.println("\nPosición en Y: ");
			float posicion1y = teclado.nextFloat();
			dos.setPosicion2(posicion1y);
			
			System.out.println("\nMasa 2");
			float masa2s = teclado.nextFloat();
			dos.setMasa2(masa2s);
			System.out.println("\nPosición en X: ");
			float posicion4x = teclado.nextFloat();
			dos.setPosicion4(posicion4x);
			System.out.println("\nPosición en Y: ");
			float posicion5y = teclado.nextFloat();
			dos.setPosicion5(posicion5y);
			
			System.out.println("\nMasa 3");
			float masa3t = teclado.nextFloat();
			dos.setMasa3(masa3t);
			System.out.println("\nPosición en X: ");
			float posicion6x = teclado.nextFloat();
			dos.setPosicion6(posicion6x);
			System.out.println("\nPosición en Y: ");
			float posicion7y = teclado.nextFloat();
			dos.setPosicion7(posicion7y);
			
			System.out.println("\nMasa 4");
			float masa4f = teclado.nextFloat();
			dos.setMasa4(masa4f);
			System.out.println("\nPosición en X: ");
			float posicion8x = teclado.nextFloat();
			dos.setPosicion8(posicion8x);
			System.out.println("\nPosición en Y: ");
			float posicion9y = teclado.nextFloat();
			dos.setPosicion9(posicion9y);
			
			System.out.println("\nMasa 5");
			float masa5 = teclado.nextFloat();
			dos.setMasa5(masa5);
			System.out.println("\nPosición en X: ");
			float posicion10x = teclado.nextFloat();
			dos.setPosicion10(posicion10x);
			System.out.println("\nPosición en Y: ");
			float masa6m = teclado.nextFloat();
			dos.setMasa6(masa6m);
			
			double suma474 = (((dos.getMasa1() * dos.getPosicion1()) + (dos.getMasa2() * dos.getPosicion4())
					+ (dos.getMasa3() * dos.getPosicion6())
					+ (dos.getMasa4() * dos.getPosicion8())
					+ (dos.getMasa5() * dos.getPosicion10())) 
					/(dos.getMasa1() + dos.getMasa2() + dos.getMasa3() + dos.getMasa4() + dos.getMasa5())); 
			dos.setSuma(suma474);
			
			double centroDeMasa474 = (((dos.getMasa1() * dos.getPosicion2()) + (dos.getMasa2() * dos.getPosicion5())
					+ (dos.getMasa3() * dos.getPosicion7())
					+ (dos.getMasa4() * dos.getPosicion9())
					+ (dos.getMasa5() * dos.getMasa6())) 
					/(dos.getMasa1() + dos.getMasa2() + dos.getMasa3() + dos.getMasa4()+ dos.getMasa5())); 
			dos.setCentroDeMasa(centroDeMasa474);
			
			System.out.println("\nCentro de masa en X = " + df.format(dos.getSuma()));
			System.out.println("Centro de masa en Y = " + df.format(dos.getCentroDeMasa()));

			break;
			
		default:
			System.out.println("Disculpe pero por el "
					+ "momento solo se puede reolver las operaciones"
					+ "con ese numero de objetos, seleccione una opción válida ");
			break;
			
	}
	While mientras = new While();
	mientras.acceso();
		
	}
	}
