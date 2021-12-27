package clases;

public class Pregunta {
	private String texto;
	private String r1;
	private String r2;
	private String r3;
	private String r4;
	private int correcta;
	private int categoria;
	
	//constructor
	public Pregunta(String texto, String r1, String r2, String r3, String r4, int correcta, int categoria) {
		this.texto = texto;
		this.r1 = r1;
		this.r2 = r2;
		this.r3 = r3;
		this.r4 = r4;
		this.correcta = correcta;
		this.categoria = categoria;
	}
	
	public String hacer_pregunta(int categoria) {
		String pregunta = this.texto+"/n"
				+"1. "+this.r1+"/n"
				+"2. "+this.r2+"/n"
				+"3. "+this.r3+"/n"
				+"4. "+this.r4+"/n";
		return pregunta;
		
	}
	public boolean respuesta(int respuesta) {
		if(respuesta == this.correcta) {
			return true;
		}else {
			return false;
		}
		
	}
}
