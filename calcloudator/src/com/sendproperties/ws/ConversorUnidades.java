package com.sendproperties.ws;

import java.text.NumberFormat;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class ConversorUnidades extends Activity {

	int seleccion;
	String resultado;
	
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
          	
        Spinner spinner=(Spinner)findViewById(R.id.spinner1);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.unidades, android.R.layout.simple_spinner_item);
        
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        
        spinner.setOnItemSelectedListener(new OnItemSelectedListener() 
        {
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) 
            {
             Toast.makeText(parentView.getContext(), "Has seleccionado: " +
             parentView.getItemAtPosition(position).toString(), Toast.LENGTH_LONG).show();
             
             long item_id=parentView.getItemIdAtPosition(position);
             seleccion=(int)item_id;
            }                  
            public void onNothingSelected(AdapterView<?> parentView) 
            {
            
            }    
        });         
    }

    public void mostrar(View v)
    {
		EditText nombre = (EditText)findViewById(R.id.valor);		
    	
    	String numero=nombre.getText().toString();
//    	resultadosP.setText(String.valueOf(seleccion));
    	
    	try {
            Conexionws conn=new Conexionws();
			resultado=conn.convertir(numero,String.valueOf(seleccion));
		
		} catch (Exception e) {
			
			Toast.makeText(this,"El servidor no esta activo", Toast.LENGTH_SHORT).show();
		}
    	
    	String resultadosArray[];
    	resultadosArray=resultado.split(";");
    	
    	//preparacion de la activity: resultados
    	Intent i = new Intent(this, Resultados.class);
        i.putExtra("caballo_vapor", resultadosArray[0]);
        i.putExtra("vatio", resultadosArray[1]);
        i.putExtra("dbw", resultadosArray[2]);
        i.putExtra("dbm", resultadosArray[3]);
        i.putExtra("mw", resultadosArray[4]);
        i.putExtra("hp", resultadosArray[5]);
        i.putExtra("kcalhora", resultadosArray[6]);
        i.putExtra("kjulioshora", resultadosArray[7]);
       
        startActivity(i);  
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
