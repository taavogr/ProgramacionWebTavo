package pe.edu.upc.entitys;

public class Operacion {
	
	private double numeroA;
	private double numeroB;
	private char operacion;
	
	
	
	public Operacion() {
		super();
	}

	public Operacion(double numeroA, double numeroB, char operacion) {
		super();
		this.numeroA = numeroA;
		this.numeroB = numeroB;
		this.operacion = operacion;
	}

	public double getNumeroA() {
		return numeroA;
	}

	public void setNumeroA(double numeroA) {
		this.numeroA = numeroA;
	}

	public double getNumeroB() {
		return numeroB;
	}

	public void setNumeroB(double numeroB) {
		this.numeroB = numeroB;
	}

	public char getOperacion() {
		return operacion;
	}

	public void setOperacion(char operacion) {
		this.operacion = operacion;
	}
	
	public double Calcular(){
		
		try{
			switch (this.operacion){
			case '+' :
				return this.numeroA+this.numeroB;
			case '-' :
				return this.numeroA-this.numeroB;
			case '*' :
				return this.numeroA*this.numeroB;
			case '/' :
				return this.numeroA/this.numeroB;
			default:
				return 0;
			}
		}catch(Exception e){
			return 0;
		}
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"Calculadora";
	}
	
	
	

}
