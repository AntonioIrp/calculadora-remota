package com.sendproperties.ws;

import android.os.Bundle;
import android.app.Activity;
import android.app.Dialog;
import android.app.TabActivity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class Seleccion extends TabActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_seleccion);
		

        TabHost tabHost = getTabHost();
        
        // Tab for Photos
        TabSpec photospec = tabHost.newTabSpec("Multiplicación");
        // setting Title and Icon for the Tab
        photospec.setIndicator("Multiplicación", getResources().getDrawable(R.drawable.logomultiplicar));
        Intent photosIntent = new Intent(this, Multiplicacion.class);
        photospec.setContent(photosIntent);
 
        // Tab for Songs
        TabSpec songspec = tabHost.newTabSpec("Matlab");
        songspec.setIndicator("Matlab", getResources().getDrawable(R.drawable.matlab));
        Intent songsIntent = new Intent(this, Expresion.class);
        songspec.setContent(songsIntent);
 
        // Tab for Videos
        TabSpec videospec = tabHost.newTabSpec("Potencia");
        videospec.setIndicator("Potencia", getResources().getDrawable(R.drawable.battery));
        Intent videosIntent = new Intent(this, ConversorUnidades.class);
        videospec.setContent(videosIntent);
 
        // Adding all TabSpec to TabHost
        tabHost.addTab(photospec); // Adding photos tab
        tabHost.addTab(songspec); // Adding songs tab
        tabHost.addTab(videospec); // Adding videos tab
    }
		


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_seleccion, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.crear:
			final Dialog dialog = new Dialog(this); 
	        dialog.setContentView(R.layout.dialog_configuracion);
	        dialog.setTitle("Configuración TCP/IP ");                          
	        dialog.show();
	        Button b = (Button)dialog.findViewById(R.id.buttonIP);
	        
	        b.setOnClickListener(new OnClickListener() {
	           

				public void onClick(View v) {
					
					
					EditText ipEdit=(EditText)dialog.findViewById(R.id.ip);
			    	EditText portEdit=(EditText)dialog.findViewById(R.id.port);
			    	
			    	Conexionws.ip =	ipEdit.getEditableText().toString();
			    	Conexionws.port = portEdit.getEditableText().toString();
			    	
					dialog.cancel();					
				}});
	        
			
			return true;
		}
		return false;
    }
    

}
