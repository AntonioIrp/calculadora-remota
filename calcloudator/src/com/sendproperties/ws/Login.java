package com.sendproperties.ws;

import java.io.IOException;
import android.app.Activity;
import android.media.AudioManager;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.content.Context;
import android.content.DialogInterface;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;

import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;



import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends Activity {

    int iduser;
    public boolean backButton = false;
    public boolean homeButton = false;
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login); 
    }   
    
    
    
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
    	    if (keyCode == KeyEvent.KEYCODE_BACK) 
    	    {
    	    	backButton = true;
    	    	
    	    	final Builder alertDialog = new AlertDialog.Builder(this);
      		  alertDialog.setTitle("¿Quieres salir de la aplicacion?");
      		 
      		 
  			  alertDialog.setPositiveButton("SI",new DialogInterface.OnClickListener() {
  				  public void onClick(DialogInterface dialog, int which) 
  				  {
  					finish();  	
  				  }
  				 } );
  			  
  			  
  			  alertDialog.setNegativeButton("NO",new DialogInterface.OnClickListener() {
  				  public void onClick(DialogInterface dialog, int which) 
  				  {
  		                 
  		                                          
  		          }
  		       });
      		
      		  alertDialog.setIcon(R.drawable.warning);
      		  alertDialog.show();
    
    	    	
    	     	
    	     return true;
    	    }else if(keyCode == KeyEvent.KEYCODE_HOME)
    	    {
    	    	homeButton = true;
    	    }
    	    return super.onKeyDown(keyCode, event);
    }
    
    
    public void OnCalcularMultiplicacion(View v)
    {
    	EditText numeroP=(EditText)findViewById(R.id.numero);
        TextView resultadoP=(TextView) findViewById(R.id.resultado);
        
    	String numero = numeroP.getText().toString();
       
        
        
    
        
        try {
            Conexionws conn=new Conexionws();
			String resultado=conn.multiplicar(numero,numero);
			resultadoP.setText(resultado);
		
		} catch (Exception e) {
			
			Toast.makeText(this,"El servidor no esta activo", Toast.LENGTH_SHORT).show();
		}
    }
    
 
    
   
    
 }