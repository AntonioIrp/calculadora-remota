package com.sendproperties.ws;

import android.os.Bundle;
import android.app.Activity;
import android.widget.TextView;

public class Resultados extends Activity {
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultados);
        
        
        Bundle bundle;
        TextView resultado_caballo_vapor=(TextView)findViewById(R.id.resultado_caballo_vapor);
        TextView resultado_vatio=(TextView)findViewById(R.id.resultado_vatio);
        TextView resultado_dbw=(TextView)findViewById(R.id.resultado_dbw);
        TextView resultado_dbm=(TextView)findViewById(R.id.resultado_dbm);
        TextView resultado_mw=(TextView)findViewById(R.id.resultado_mw);
        TextView resultado_hp=(TextView)findViewById(R.id.resultado_caballo_potencia);
        TextView resultado_kcalhoras=(TextView)findViewById(R.id.resultado_kcalhora);
        TextView resultado_kjulioshora=(TextView)findViewById(R.id.resultado_kjulioshora);
        
        
        
        bundle=getIntent().getExtras();
        resultado_caballo_vapor.setText(bundle.getString("caballo_vapor"));
        resultado_vatio.setText(bundle.getString("vatio"));
        resultado_dbw.setText(bundle.getString("dbw"));
        resultado_dbm.setText(bundle.getString("dbm"));
        resultado_mw.setText(bundle.getString("mw"));
        resultado_hp.setText(bundle.getString("hp"));
        resultado_kcalhoras.setText(bundle.getString("kcalhora"));
        resultado_kjulioshora.setText(bundle.getString("kjulioshora"));

    }
    
}
