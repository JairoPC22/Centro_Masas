package codigo;

import java.text.DecimalFormat;
import java.util.Scanner;

import dimensiones.TRES;

public class Tres_Dimensiones {
		static int opcion = 0;
			
			public static void TRES() {
				TRES tres = new TRES();
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
				tres.setMasa1(masa1);
				System.out.println("\nPosición en X: ");
				float posicion1 = teclado.nextFloat();
				tres.setPosicion1(posicion1);
				System.out.println("\nPosición en Y: ");
				float posicion2 = teclado.nextFloat();
				tres.setPosicion2(posicion2);
				System.out.println("\nPosición en Z: ");
				float posicion3 = teclado.nextFloat();
				tres.setPosicion3(posicion3);
				
				
				double suma = (((tres.getMasa1()*tres.getPosicion1()))
						/((tres.getMasa1())));
				tres.setSuma(suma);
				double centroDeMasa = (((tres.getMasa1()*tres.getPosicion2()))
						/((tres.getMasa1())));
				tres.setCentroDeMasa(centroDeMasa);
				double suma2 = (((tres.getMasa1()*tres.getPosicion3()))
						/((tres.getMasa1())));
				tres.setSuma2(suma2);
				
				System.out.println("Centro de masa en X = " + df.format(tres.getSuma()));
				System.out.println("Centro de masa en Y = " + df.format(tres.getCentroDeMasa()));
				System.out.println("Centro de masa en Z = " + df.format(tres.getSuma2()));


				break;

			case 2:
					System.out.println("Usted eligió calcular el Centro de masa para dos objetos."
							+ "\nIngrese los datos solicitados"
							+ "\n\nMasa 1: ");
					float masa12 = teclado.nextFloat();
					tres.setMasa1(masa12);
					System.out.println("\nPosición en X: ");
					float posicion1x = teclado.nextFloat();
					tres.setPosicion1(posicion1x);
					System.out.println("\nPosición en Y: ");
					float posicion2y = teclado.nextFloat();
					tres.setPosicion2(posicion2y);
					System.out.println("\nPosición en Z: ");
					float posicion3z = teclado.nextFloat();
					tres.setPosicion3(posicion3z);
					
					System.out.println("\nMasa 2");
					float masa2 = teclado.nextFloat();
					tres.setMasa2(masa2);
					System.out.println("\nPosición en X: ");
					float posicion4x = teclado.nextFloat();
					tres.setPosicion4(posicion4x);
					System.out.println("\nPosición en Y: ");
					float posicion5y = teclado.nextFloat();
					tres.setPosicion5(posicion5y);
					System.out.println("\nPosición en Z: ");
					float posicion10z = teclado.nextFloat();
					tres.setPosicion10(posicion10z);
					
					double suma22 = (((tres.getMasa1()*tres.getPosicion1()) + (tres.getMasa2()* tres.getPosicion4()))
							/((tres.getMasa1() + tres.getMasa2())));
					tres.setSuma(suma22);
					double centroDeMasa22 = (((tres.getMasa1()*tres.getPosicion2()) + (tres.getMasa2()* tres.getPosicion5()))
							/((tres.getMasa1() + tres.getMasa2())));
					tres.setCentroDeMasa(centroDeMasa22);
					double suma2z = (((tres.getMasa1()*tres.getPosicion3()) + (tres.getMasa2()* tres.getPosicion10()))
							/((tres.getMasa1() + tres.getMasa2())));
					tres.setSuma2(suma2z);
					
					System.out.println("Centro de masa en X = " + df.format(tres.getSuma()));
					System.out.println("Centro de masa en Y = " + df.format(tres.getCentroDeMasa()));
					System.out.println("Centro de masa en Z = " + df.format(tres.getSuma2()));
					break;
			case 3:
				System.out.println("Usted eligió calcular el Centro de masa para Tres objetos."
						+ "\nIngrese los datos solicitados"
						+ "\n\nMasa 1: ");
				float masa111 = teclado.nextFloat();
				tres.setMasa1(masa111);
				System.out.println("\nPosición en X: ");
				float posicion111 = teclado.nextFloat();
				tres.setPosicion1(posicion111);
				System.out.println("\nPosición en Y: ");
				float posicion333 = teclado.nextFloat();
				tres.setPosicion2(posicion333);
				System.out.println("\nPosición en Z: ");
				float posicion333z = teclado.nextFloat();
				tres.setPosicion3(posicion333z);
				
				System.out.println("\nMasa 2");
				float masa22 = teclado.nextFloat();
				tres.setMasa2(masa22);
				System.out.println("\nPosición en X: ");
				float posicion44x = teclado.nextFloat();
				tres.setPosicion4(posicion44x);
				System.out.println("\nPosición en Y: ");
				float posicion55y = teclado.nextFloat();
				tres.setPosicion5(posicion55y);
				System.out.println("\nPosición en Z: ");
				float posicion6z = teclado.nextFloat();
				tres.setPosicion6(posicion6z);
				
				System.out.println("\nMasa 3");
				float masa3 = teclado.nextFloat();
				tres.setMasa3(masa3);
				System.out.println("\nPosición en X: ");
				float posicion7 = teclado.nextFloat();
				tres.setPosicion7(posicion7);
				System.out.println("\nPosición en Y: ");
				float posicion8 = teclado.nextFloat();
				tres.setPosicion8(posicion8);
				System.out.println("\nPosición en Z: ");
				float posicion9 = teclado.nextFloat();
				tres.setPosicion9(posicion9);
				
				double suma223 = (((tres.getMasa1()*tres.getPosicion1()) + (tres.getMasa2()* tres.getPosicion4())+ (tres.getMasa3()* tres.getPosicion7())
						/((tres.getMasa1() + tres.getMasa2()+ tres.getMasa3()))));
				tres.setSuma(suma223);
				double centroDeMasa223 = (((tres.getMasa1()*tres.getPosicion2()) + (tres.getMasa2()* tres.getPosicion5()+ (tres.getMasa3()* tres.getPosicion8()))
						/((tres.getMasa1() + tres.getMasa2()+ tres.getMasa3()))));
				tres.setCentroDeMasa(centroDeMasa223);
				double suma23z = (((tres.getMasa1()*tres.getPosicion3()) + (tres.getMasa2()* tres.getPosicion6()+ (tres.getMasa3()* tres.getPosicion9()))
						/((tres.getMasa1() + tres.getMasa2()+ tres.getMasa3()))));
				tres.setSuma2(suma23z);
				
				System.out.println("Centro de masa en X = " + df.format(tres.getSuma()));
				System.out.println("Centro de masa en Y = " + df.format(tres.getCentroDeMasa()));
				System.out.println("Centro de masa en Z = " + df.format(tres.getSuma2()));
				break;
				
			case 4: 
				System.out.println("Usted eligió calcular el Centro de masa para Cuatro objetos."
						+ "\nIngrese los datos solicitados"
						+ "\n\nMasa 1: ");
				float masa1111 = teclado.nextFloat();
				tres.setMasa1(masa1111);
				System.out.println("\nPosición en X: ");
				float posicion1111 = teclado.nextFloat();
				tres.setPosicion1(posicion1111);
				System.out.println("\nPosición en Y: ");
				float posicion1y = teclado.nextFloat();
				tres.setPosicion2(posicion1y);
				System.out.println("\nPosición en Z: ");
				float posicion14 = teclado.nextFloat();
				tres.setPosicion3(posicion14);
				
				System.out.println("\nMasa 2");
				float masa222 = teclado.nextFloat();
				tres.setMasa2(masa222);
				System.out.println("\nPosición en X: ");
				float posicion444x = teclado.nextFloat();
				tres.setPosicion4(posicion444x);
				System.out.println("\nPosición en Y: ");
				float posicion555y = teclado.nextFloat();
				tres.setPosicion5(posicion555y);
				System.out.println("\nPosición en Z: ");
				float posicion66z = teclado.nextFloat();
				tres.setPosicion6(posicion66z);
				
				System.out.println("\nMasa 3");
				float masa33 = teclado.nextFloat();
				tres.setMasa3(masa33);
				System.out.println("\nPosición en X: ");
				float posicion667 = teclado.nextFloat();
				tres.setPosicion7(posicion667);
				System.out.println("\nPosición en Y: ");
				float posicion78 = teclado.nextFloat();
				tres.setPosicion8(posicion78);
				System.out.println("\nPosición en Z: ");
				float posicion99z = teclado.nextFloat();
				tres.setPosicion9(posicion99z);
				
				System.out.println("\nMasa 4");
				float masa4 = teclado.nextFloat();
				tres.setMasa4(masa4);
				System.out.println("\nPosición en X: ");
				float posicion10 = teclado.nextFloat();
				tres.setPosicion10(posicion10);
				System.out.println("\nPosición en Y: ");
				float posicion11 = teclado.nextFloat();
				tres.setPosicion11(posicion11);
				System.out.println("\nPosición en Z: ");
				float posicion112 = teclado.nextFloat();
				tres.setPosicion12(posicion112);
				
				double suma44 = (((tres.getMasa1() * tres.getPosicion1()) + (tres.getMasa2() * tres.getPosicion4())
						+ (tres.getMasa3() * tres.getPosicion7())
						+ (tres.getMasa4() * tres.getPosicion10())) 
						/(tres.getMasa1() + tres.getMasa2() + tres.getMasa3() + tres.getMasa4())); 
				tres.setSuma(suma44);
				
				double centroDeMasa44 = (((tres.getMasa1() * tres.getPosicion2()) + (tres.getMasa2() * tres.getPosicion5())
						+ (tres.getMasa3() * tres.getPosicion8())
						+ (tres.getMasa4() * tres.getPosicion11())) 
						/(tres.getMasa1() + tres.getMasa2() + tres.getMasa3() + tres.getMasa4())); 
				tres.setCentroDeMasa(centroDeMasa44);
				
				double suma27 = ((tres.getMasa1() * tres.getPosicion3()) + (tres.getMasa2() * tres.getPosicion6())
						+ (tres.getMasa3() * tres.getPosicion9())
						+ (tres.getMasa4() * tres.getPosicion12())) 
						/(tres.getMasa1() + tres.getMasa2() + tres.getMasa3() + tres.getMasa4());
				tres.setSuma2(suma27);
				
				System.out.println("Centro de masa en X = " + df.format(tres.getSuma()));
				System.out.println("Centro de masa en Y = " + df.format(tres.getCentroDeMasa()));
				System.out.println("Centro de masa en Z = " + df.format(tres.getSuma2()));
				break;
				
			case 5: 
				System.out.println("Usted eligió calcular el Centro de masa para Cinco objetos."
						+ "\nIngrese los datos solicitados"
						+ "\n\nMasa 1: ");
				float masa15 = teclado.nextFloat();
				tres.setMasa1(masa15);
				System.out.println("\nPosición en X: ");
				float posicion1x5 = teclado.nextFloat();
				tres.setPosicion1(posicion1x5);
				System.out.println("\nPosición en Y: ");
				float posicion1y5 = teclado.nextFloat();
				tres.setPosicion2(posicion1y5);
				System.out.println("\nPosición en Z: ");
				float posicion1z5 = teclado.nextFloat();
				tres.setPosicion3(posicion1z5);
				
				System.out.println("\nMasa 2");
				float masa2s5 = teclado.nextFloat();
				tres.setMasa2(masa2s5);
				System.out.println("\nPosición en X: ");
				float posicion4x5 = teclado.nextFloat();
				tres.setPosicion4(posicion4x5);
				System.out.println("\nPosición en Y: ");
				float posicion5y5 = teclado.nextFloat();
				tres.setPosicion5(posicion5y5);
				System.out.println("\nPosición en Z: ");
				float posicion5z5 = teclado.nextFloat();
				tres.setPosicion6(posicion5z5);
				
				System.out.println("\nMasa 3");
				float masa3t5 = teclado.nextFloat();
				tres.setMasa3(masa3t5);
				System.out.println("\nPosición en X: ");
				float posicion6x5 = teclado.nextFloat();
				tres.setPosicion7(posicion6x5);
				System.out.println("\nPosición en Y: ");
				float posicion7y5 = teclado.nextFloat();
				tres.setPosicion8(posicion7y5);
				System.out.println("\nPosición en Z: ");
				float posicion7z5 = teclado.nextFloat();
				tres.setPosicion9(posicion7z5);
				
				System.out.println("\nMasa 4");
				float masa4f5 = teclado.nextFloat();
				tres.setMasa4(masa4f5);
				System.out.println("\nPosición en X: ");
				float posicion8x = teclado.nextFloat();
				tres.setPosicion10(posicion8x);
				System.out.println("\nPosición en Y: ");
				float posicion9y = teclado.nextFloat();
				tres.setPosicion11(posicion9y);
				System.out.println("\nPosición en Z: ");
				float posicion9yz = teclado.nextFloat();
				tres.setPosicion12(posicion9yz);
				
				System.out.println("\nMasa 5");
				float masa5 = teclado.nextFloat();
				tres.setMasa5(masa5);
				System.out.println("\nPosición en X: ");
				float posicion10xx = teclado.nextFloat();
				tres.setPosicion13(posicion10xx);
				System.out.println("\nPosición en Y: ");
				float masa6my = teclado.nextFloat();
				tres.setPosicion14(masa6my);
				System.out.println("\nPosición en Z: ");
				float masa6myz = teclado.nextFloat();
				tres.setPosicion15(masa6myz);
				
				double suma445 = (((tres.getMasa1() * tres.getPosicion1()) + (tres.getMasa2() * tres.getPosicion4())
						+ (tres.getMasa3() * tres.getPosicion7())
						+ (tres.getMasa4() * tres.getPosicion10())
						+ (tres.getMasa5() * tres.getPosicion13())) 
						/((tres.getMasa1() + tres.getMasa2() + tres.getMasa3() + tres.getMasa4()+ tres.getMasa5()))); 
				tres.setSuma(suma445);
				
				double centroDeMasa445 = (((tres.getMasa1() * tres.getPosicion2()) + (tres.getMasa2() * tres.getPosicion5())
						+ (tres.getMasa3() * tres.getPosicion8())
						+ (tres.getMasa4() * tres.getPosicion11())
						+ (tres.getMasa5() * tres.getPosicion14())) 
						/(tres.getMasa1() + tres.getMasa2() + tres.getMasa3() + tres.getMasa4()+ tres.getMasa5())); 
				tres.setCentroDeMasa(centroDeMasa445);
				
				double suma275 = ((tres.getMasa1() * tres.getPosicion3()) + (tres.getMasa2() * tres.getPosicion6())
						+ (tres.getMasa3() * tres.getPosicion9())
						+ (tres.getMasa4() * tres.getPosicion12())
						+ (tres.getMasa5() * tres.getPosicion15())) 
						/(tres.getMasa1() + tres.getMasa2() + tres.getMasa3() + tres.getMasa4()+ tres.getMasa5());
				tres.setSuma2(suma275);
				
				System.out.println("Centro de masa en X = " + df.format(tres.getSuma()));
				System.out.println("Centro de masa en Y = " + df.format(tres.getCentroDeMasa()));
				System.out.println("Centro de masa en Z = " + df.format(tres.getSuma2()));
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
