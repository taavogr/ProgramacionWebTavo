package pe.edu.upc.view;

import java.util.Scanner;

import pe.edu.upc.Entitys.Operacion;

public class AppCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Operacion objOperacion = new Operacion();
		
		while(true){
			Scanner s= new Scanner(System.in);
			
			System.out.print("Operacion :");
			objOperacion.setOperacion((s.next().charAt(0)));
			System.out.print("Numero 1 :");
			objOperacion.setNumeroA(s.nextDouble());
			System.out.print("Numero 2 :");
			objOperacion.setNumeroB(s.nextDouble());
			
			System.out.println("Resultado="+objOperacion.Calcular());
			
			System.out.println("Continuas (SI/NO)");
			
			if ((s.next()).equals("NO")) {
				System.out.println("OK, Gracias");
				break;
				
			}
			
		}
		

	}

}
