/*
*	Name file: Paquete.java
*	@author: Gustavo Alberto Vasquez Damaso
*	@version: 1.0
*/

public class Paquete{
	
	private String direccionDestino;
	private String direccionOrigen;
	private float pesoPaqueteGramos;
	private float totalEnvio;
	
	
	//metodos set
	public void setDireccionDestino(String direccionDestino){
		this.direccionDestino = direccionDestino;
	}
	
	public void setDireccionOrigen(String direccionOrigen){
		this.direccionOrigen = direccionOrigen;
	}
	
	public void setPesoPaqueteGramos(float pesoPaqueteGramos){
		this.pesoPaqueteGramos = pesoPaqueteGramos;
	}
	
	public void setTotalEnvio(float totalEnvio){
		this.totalEnvio = totalEnvio;
	}
	
	//metodos get
	public String getDireccionDestino(){
		return direccionDestino;
	}
	
	public String getDireccionOrigen(){
		return direccionOrigen;
	}
	
	public float getPesoPaqueteGramos(){
		return pesoPaqueteGramos;
	}
	
	public float getTotalEnvio(){
		return totalEnvio;
	}
	
}