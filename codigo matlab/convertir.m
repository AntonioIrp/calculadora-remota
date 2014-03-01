function convertir(valor,opcion)


val=str2double(valor);
opc=str2double(opcion);

switch opc
    	
    	case 0  		%cv
    		vatio=val*735.49875;
       	
    		
    	case 1 %w
    		vatio=val;
    		
    		
    	case 2 %dbw
    		vatio=10^(val/10);
    		
    	
    	case 3 %dbm
    		dbw=val-30;
    		vatio=10^(dbw/10);
    		
    		
    	case 4 %mw
    		vatio=val/1000;
    		
    		
    	case 5 %hp
    		vatio=val*745.7;
    		
 
end
    	   
    	dbw=10*log10(vatio);
		dbm=10*log10(vatio/0.001);
		caballo_vapor=vatio*0.0013596211551613;
		mili_vatio=vatio*1000;
		hp=vatio*0.0013410218586563;
		kcalhora=vatio*0.85980415572009;
		kjulioshora=vatio*3.6;


fprintf('%d;%d;%d;%d;%d;%d;%d;%d',caballo_vapor,vatio,dbw,dbm,mili_vatio,hp,kcalhora,kjulioshora)