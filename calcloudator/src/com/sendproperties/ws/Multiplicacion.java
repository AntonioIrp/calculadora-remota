package com.sendproperties.ws;
 
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.TabHost.TabSpec;
 
public class Multiplicacion extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.multiplicacion);
        
}
    
    public void OnCalcularMultiplicacion(View v){
    	EditText numero1P=(EditText) findViewById(R.id.numero1multi);
    	EditText numero2P=(EditText) findViewById(R.id.numero2multi);
    	TextView resultadosP=(TextView) findViewById(R.id.textView4);
    	
    	String numero1=numero1P.getText().toString();
    	String numero2=numero2P.getText().toString();
    	
    	try {
            Conexionws conn=new Conexionws();
			String resultado=conn.multiplicar(numero1,numero2);
			resultadosP.setText(resultado);
		
		} catch (Exception e) {
			
			Toast.makeText(this,"El servidor no esta activo", Toast.LENGTH_SHORT).show();
		}
    	
    }
}