/**
 * 
 */
package com.carol.negocio;

import java.io.IOException;
import java.util.List;

import com.carol.datos.ConsultaDatos;

/**
 * @author carol
 *
 */
public class LogicaNegocio {
	
	public  int cuantosCoches(String nombre) throws IOException {
		//Usar clase datos
		ConsultaDatos consultaDatos = new ConsultaDatos();
		List<String> nombres = consultaDatos.consultaCoches(); //Array de string que devuelve la capa de datos
		int contador = 0;
		
		for (String nombreArray : nombres) {
			if(nombreArray.contentEquals(nombre)) {
				contador++;
			}
		}
		return contador;
	}

}
