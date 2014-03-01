package com.sendproperties.ws;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Mservices {

	String resultado;
	
	
	public String multiplicacion(String param1)
	{
		String ruta="C:\\multiplicacion.exe";
		String[]parametros;
		parametros=param1.split(";");
		String comando=ruta+" "+ parametros[0]+" "+parametros[1];//+param1;
		try 
		{
			Process p = Runtime.getRuntime().exec(comando); 
			p.waitFor();
			
			InputStream is = p.getInputStream(); 
			             
			/* Se prepara un BufferedReader para poder leer la salida más comodamente. */
			BufferedReader br = new BufferedReader (new InputStreamReader (is));
			String aux = br.readLine();
			resultado=aux.replaceAll(" ", "");
	
		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("no existe");
			}
		
		return resultado;
		
	}
	
	public String matlabservice(String param1)
	{
		String ruta="C:\\matlabservice.exe";
		
		String comando=ruta+" "+ param1;
		
		try 
		{
			Process p = Runtime.getRuntime().exec(comando); 
			p.waitFor();
			
			InputStream is = p.getInputStream(); 
			             
			/* Se prepara un BufferedReader para poder leer la salida más comodamente. */
			BufferedReader br = new BufferedReader (new InputStreamReader (is));
			String aux = br.readLine();
			resultado=aux.replaceAll(" ", "");
	
		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("no existe");
			}
		
		return resultado;
		
	}
	
	
	public String convertir(String param1)
	{
		String ruta="C:\\convertir.exe";
		String[]parametros;
		parametros=param1.split(";");
		String comando=ruta+" "+parametros[0]+" "+parametros[1];
		
		
		try 
		{
			Process p = Runtime.getRuntime().exec(comando); 
			p.waitFor();
			
			InputStream is = p.getInputStream(); 
			             
			/* Se prepara un BufferedReader para poder leer la salida más comodamente. */
			BufferedReader br = new BufferedReader (new InputStreamReader (is));
			String aux = br.readLine();
			resultado=aux.replaceAll(" ", "");
	
		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("no existe");
			}
		
		return resultado;
		
	}
	

}
