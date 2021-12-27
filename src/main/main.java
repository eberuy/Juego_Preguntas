package main;

import java.util.InputMismatchException;
import java.util.Scanner;
import clases.Pregunta;

public class main {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		boolean salir = false;
		int opcion;
		int opcion_2;
		int puntaje=0;
		Pregunta p = null;
		while (!salir) {
			System.out.flush();
			System.out.println("1. Jugar");
			System.out.println("2. Configurar");
			System.out.println("3. Salir");
			
			try {
				System.out.println("Ingrese opcion");
				opcion = sn.nextInt();
				switch (opcion) {
				case 1:
					System.out.println("Comienza el juego");
					System.out.println(p.hacer_pregunta(2));
					int respuesta = sn.nextInt();
					if (p.respuesta(respuesta)== true) {
						System.out.println("respuesta correcta");
						puntaje = puntaje +10;
					}else {
						System.out.println("respuesta incorrecta");
					}
					break;
				case 2:
					System.out.println("1. Agregar pregunta");
					System.out.println("2. Volver");
					opcion_2 = sn.nextInt();
					if (opcion_2 == 1) {
						System.out.println("Ingrese el texto de la pregunta");
						String pregunta = sn.nextLine();
						System.out.println("Ingrese el texto de la opcion1");
						String opcion1 = sn.nextLine();
						System.out.println("Ingrese el texto de la opcion2");
						String opcion2 = sn.nextLine();
						System.out.println("Ingrese el texto de la opcion3");
						String opcion3 = sn.nextLine();
						System.out.println("Ingrese el texto de la opcion4");
						String opcion4 = sn.nextLine();
						System.out.println("Ingrese el numero de la opcion correcta");
						int correcta = sn.nextInt();
						System.out.println("Ingrese la categoria(1 a 5)");
						int categoria = sn.nextInt();
					 p = new Pregunta(pregunta, opcion1, opcion2, opcion3, opcion4, correcta, categoria);
						
					}
					break;
				case 3:
					System.out.println("Su puntaje es de: "+puntaje);
					salir = true;
					break;
				default:
					System.out.println("opcion incorrecta");
				}
			}catch (InputMismatchException e) {
				System.out.println("Debes insertar una opcion");
				sn.next();
			}
		}

	}

}
