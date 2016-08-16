package pe.edu.upc.entitys;

public class Mermelada extends Fruta 
{
    private int duracionDias;
    private String tipoEnvase;
    
    public Mermelada(int duraciondias, String tipoenvase, String nombre, String color, String sabor)
    {
        super(nombre, color, sabor);
        this.duracionDias = duraciondias;
        this.tipoEnvase = tipoenvase;
    }
    
    public String prepararmermelada()
    {
        return ("preparando mermelada de : " + this.getNombre());
    }
    
}
