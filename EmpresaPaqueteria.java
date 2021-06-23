/*
*	Name file: EmpresaPaqueteria.java
*	@author: Gustavo Alberto Vasquez Damaso
*	@version: 1.0
*/

import java.io.*;

public class EmpresaPaqueteria{
	public static void main(String[] args) throws IOException{
		
		Envio obj1 = new Envio();
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Ingrese la direccion origen: ");
		obj1.setDireccionOrigen(reader.readLine());
		
		System.out.print("Ingrese la direccion del destino: ");
		obj1.setDireccionDestino(reader.readLine());
		
		System.out.print("Ingrese el peso del paquete: ");
		obj1.setPesoPaqueteGramos(Float.parseFloat(reader.readLine()));
		
		
		obj1.calcularTotalEnvio();
		
		System.out.println("\n\n\t>>>>>>>>>>> ETIQUETA FEDEX <<<<<<<<<<<<");
		System.out.println("Origen: " + obj1.getDireccionOrigen());
		System.out.println("Destino: " + obj1.getDireccionDestino());
		System.out.println("Peso paquete: " + obj1.getPesoPaqueteGramos());
		System.out.println("Precio Envio: " + obj1.getTotalEnvio());
	}
}