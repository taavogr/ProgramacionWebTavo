package pe.edu.upc.entitys;

public class Fruta {

	private String nombre;
	private String color;
	private String sabor;
	private boolean puedoHacerJugo;
	
	public static String LugarOrigen = "UPC";

	public Fruta() {
		this.nombre = "Indefinido";
		this.color = "S/C";
		this.sabor = "S/S";
		this.puedoHacerJugo = false;
	}

	public Fruta(String nombre, String color, String sabor) {
		this.nombre = nombre;
		this.color = color;
		this.sabor = sabor;
		this.puedoHacerJugo = false;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public boolean isPuedoHacerJugo() {
		return puedoHacerJugo;
	}

	public void setPuedoHacerJugo(boolean puedoHacerJugo) {
		this.puedoHacerJugo = puedoHacerJugo;
	}

	public void asignaValorJugo(boolean puedohacerjugo) {
		this.puedoHacerJugo = puedohacerjugo;
	}

	public String comerFruta() {
		return "Comiendo Fruta: " + nombre;
	}

	public String jugoFruta() {
		if (puedoHacerJugo) {
			return "preparando Jugo de Fruta : " + nombre;
		}

		return "No se puede hacer Jugo de la Fruta : " + nombre;
	}

	public static void detalleclaseFruta() {
		System.out.println("Se detallaron los principales atributos y metodos");
	}

}
