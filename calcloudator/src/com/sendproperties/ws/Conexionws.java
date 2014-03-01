package com.sendproperties.ws;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import org.kobjects.base64.Base64;
import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;


	class Conexionws {
		//http://10.42.0.13:8080/wsmatlab/services/Mservices?wsdl
		
		static String ip;//="10..42.0.13";
		static String port;//="8080";
		String namespace="http://ws.sendproperties.com";
		String url="http://"+ip+":"+port+"/wsmatlab/services/Mservices?wsdl";
		

	public String multiplicar(String numero1, String numero2 ) throws IOException {
		final String NAMESPACE = this.namespace; 
	    final String URL = url;
	    final String METHOD_NAME = "multiplicacion";
		final String SOAP_ACTION = namespace+"/"+METHOD_NAME+"/"; //"http://ws.sendproperties.com/enviarArrayList/";
	    
		String respuesta="";
		String parametro=numero1+";"+numero2;
	    SoapObject request = new SoapObject(NAMESPACE, METHOD_NAME);
	    
//	    Pass value for fname variable in the web service
        PropertyInfo lnameProp =new PropertyInfo();
        lnameProp.setName("param1");
        lnameProp.setValue(parametro);
        lnameProp.setType(String.class);
        request.addProperty(lnameProp); 
	        
	    SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
	    envelope.setOutputSoapObject(request);
        HttpTransportSE androidHttpTransport = new HttpTransportSE(URL);
        
        try {
           androidHttpTransport.call(SOAP_ACTION, envelope);
           SoapPrimitive response = (SoapPrimitive)envelope.getResponse();
           respuesta=response.toString();
        	
  
        } catch (Exception e) {
            System.out.println("Error de aqui en la conexion http"+e);
        }
		return respuesta;
		
	}
	
	
	public String expresionmatlab(String parametro) throws IOException {
		final String NAMESPACE = this.namespace; 
	    final String URL = url;
	    final String METHOD_NAME = "matlabservice";
		final String SOAP_ACTION = namespace+"/"+METHOD_NAME+"/"; 
	    
		String respuesta="";
		
	    SoapObject request = new SoapObject(NAMESPACE, METHOD_NAME);
	    
//	    Pass value for fname variable in the web service
        PropertyInfo lnameProp =new PropertyInfo();
        lnameProp.setName("param1");
        lnameProp.setValue(parametro);
        lnameProp.setType(String.class);
        request.addProperty(lnameProp); 
	        
	    SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
	    envelope.setOutputSoapObject(request);
        HttpTransportSE androidHttpTransport = new HttpTransportSE(URL);
        
        try {
           androidHttpTransport.call(SOAP_ACTION, envelope);
           SoapPrimitive response = (SoapPrimitive)envelope.getResponse();
           respuesta=response.toString();
        	
  
        } catch (Exception e) {
            System.out.println("Error de aqui en la conexion http"+e);
        }
		return respuesta;
		
	}
	
	
	public String convertir(String numero1, String numero2 ) throws IOException {
		final String NAMESPACE = this.namespace; 
	    final String URL = url;
	    final String METHOD_NAME = "convertir";
		final String SOAP_ACTION = namespace+"/"+METHOD_NAME+"/"; //"http://ws.sendproperties.com/enviarArrayList/";
	    
		String respuesta="";
		String parametro=numero1+";"+numero2;
	    SoapObject request = new SoapObject(NAMESPACE, METHOD_NAME);
	    
//	    Pass value for fname variable in the web service
        PropertyInfo lnameProp =new PropertyInfo();
        lnameProp.setName("param1");
        lnameProp.setValue(parametro);
        lnameProp.setType(String.class);
        request.addProperty(lnameProp); 
	        
	    SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
	    envelope.setOutputSoapObject(request);
        HttpTransportSE androidHttpTransport = new HttpTransportSE(URL);
        
        try {
           androidHttpTransport.call(SOAP_ACTION, envelope);
           SoapPrimitive response = (SoapPrimitive)envelope.getResponse();
           respuesta=response.toString();
        	
  
        } catch (Exception e) {
            System.out.println("Error de aqui en la conexion http"+e);
        }
		return respuesta;
		
	}
	
	
	
	
}