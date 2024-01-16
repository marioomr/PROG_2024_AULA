package aula;

import java.util.Arrays;

public class Aula {

		private String alumnos[];
		private int contador = 0;
		
		
		
		public Aula(int caben) {
			alumnos = new String[caben];
		}
		
		public void addAlumno(String nombre) {
			
			alumnos [contador] = nombre;
			contador++;
			
		}
		
		public String toString() {
			return Arrays.toString(alumnos);
					
		}
		
	
}
