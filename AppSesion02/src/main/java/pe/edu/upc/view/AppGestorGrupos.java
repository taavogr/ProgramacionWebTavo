package pe.edu.upc.view;

import java.util.Scanner;

import pe.edu.upc.colecciones.ListaGrupo;
import pe.edu.upc.entitys.Grupo;

public class AppGestorGrupos {

	public static void main(String[] args) {
		// TODO code application logic here
		ListaGrupo lGrupo = new ListaGrupo();

		int Opcion = 0;

		while (true) {

			System.out.println(" 1. Registrar Grupo ");
			System.out.println(" 2. Listar Grupos  ");

			System.out.println(" 3. Salir ");
			System.out.print(" Ingrese su Opcion : ");

			Scanner oScanner = new Scanner(System.in);
			Opcion = oScanner.nextInt();
			
			switch (Opcion) {
			case 1:
				regGrupo(lGrupo);
				break;
			case 2:
				lisGrupo(lGrupo);
				break;

			case 3:
				return;

			}

		}

		
	}

	public static void regGrupo(ListaGrupo lGrupo) {
		Scanner oScanner = new Scanner(System.in);
		Grupo oGrupo = new Grupo();

		System.out.print("Ingrese el Nro Grupo: ");
		oGrupo.setNroGrupo(oScanner.nextLine());

		System.out.print("Ingrese el Nombre: ");
		oGrupo.setNombre(oScanner.nextLine());

		System.out.println(lGrupo.insGrupo(oGrupo));

		System.out.print("Presione una Tecla ");
		oScanner.nextLine();
	}

	public static void lisGrupo(ListaGrupo lGrupo) {
		Scanner oScanner = new Scanner(System.in);
		
		for (int i = 0; i < lGrupo.cntGrupo(); i++) {
			Grupo oGrupo = lGrupo.elemento(i);
			System.out.println(oGrupo.getNroGrupo() + " - " +

					oGrupo.getNombre());
		}
		System.out.print("Presione una Tecla ");
		oScanner.nextLine();
	}

}
