package comunicacion;

public class Alfabeto extends Pictograma {
	private static String[] letras;
	private String interpretacion;
	
	public Alfabeto(String origen, String[] letras, String interpretacion) {
		super(origen);
		this.letras=letras;
		this.interpretacion=interpretacion;
	}
	public int cantidadLetras() {
		return letras.length;
	}
	
	public String interpretacion() {
		return interpretacion;
	}
	
	public String toString() {
		String cadena="";
		for(int i=0; i<letras.length;i++) {
			if(i!=letras.length-1) {
				cadena+=letras[i]+", ";
			}
			else {
				cadena+=letras[-1];
			}
		}
		return cadena;
	}

	public static String[] getLetras() {
		return letras;
	}

	public static void setLetras(String[] letras) {
		Alfabeto.letras = letras;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
}
