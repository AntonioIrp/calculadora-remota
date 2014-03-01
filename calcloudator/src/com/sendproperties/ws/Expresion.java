package com.sendproperties.ws;
 
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
 
public class Expresion extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.expresion);
    }
    
    public void OnCalcularMatlab(View v){
    	EditText expresionP=(EditText) findViewById(R.id.exprmatlab);
    	
    	TextView resultadosP=(TextView) findViewById(R.id.resultmatlab);
    	
    	String numero=expresionP.getText().toString();
    	
    	try {
            Conexionws conn=new Conexionws();
			String resultado=conn.expresionmatlab(numero);
			resultadosP.setText(resultado);
		
		} catch (Exception e) {
			
			Toast.makeText(this,"El servidor no esta activo", Toast.LENGTH_SHORT).show();
		}
    	
    }
    
}