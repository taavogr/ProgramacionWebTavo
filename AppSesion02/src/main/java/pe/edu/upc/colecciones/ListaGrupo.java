package pe.edu.upc.colecciones;

import java.util.ArrayList;
import java.util.List;

import pe.edu.upc.entitys.Grupo;

public class ListaGrupo {
	//Interface nombrevariable;
	//Declarar la lista
	private List<Grupo> lGrupo;

	public ListaGrupo() {
		//Creando la lista tipo ArrayList
		lGrupo = new ArrayList<>();
	}

	
	public String insGrupo(Grupo oGrupo) {
		lGrupo.add(oGrupo);
		return "Registro exitoso";
		
	}

	public int cntGrupo() {
		return lGrupo.size();
	}

	public Grupo elemento(int pos) {
		return lGrupo.get(pos);
	}

}
