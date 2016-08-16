package pe.edu.upc.view;

import pe.edu.upc.entitys.Fruta;

public class AppFrutas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruta objFruta = new Fruta("mango", "Amarillo", "Dulce");
        System.out.println(objFruta.comerFruta());
        
        System.out.println(Fruta.LugarOrigen);
        
        Fruta.LugarOrigen="Marte";
        System.out.println(Fruta.LugarOrigen);
        
        Fruta.detalleclaseFruta();
        
        
        
	}

}
