/*
*	Name file: Envio.java
*	@author: Gustavo Alberto Vasquez Damaso
*	@version: 1.0
*/

public class Envio extends Paquete{
	
	private float precioGramo;
	
	public Envio(){
		precioGramo = 0;
	}
	
	public void calcularTotalEnvio(){
		asignarPrecioGramo();
		setTotalEnvio(precioGramo * getPesoPaqueteGramos());
	}
	
	private void asignarPrecioGramo(){
		if(getPesoPaqueteGramos() > 0 && getPesoPaqueteGramos() <= 1000){
			precioGramo = 0.15f;
		}
		else if(getPesoPaqueteGramos() > 1000){
			precioGramo = 0.37f;
		}
		else{
			System.out.println("\nERROR. Peso no valido");
		}
	}
	
	//metodo set
	public void setPrecioGramo(float precioGramo){
		this.precioGramo = precioGramo;
	}
	
	//metodo get
	public float getPrecioGramo(){
		return precioGramo;
	}
	
}