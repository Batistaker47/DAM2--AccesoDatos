package com.example.LecturaEscrituraXLSXtxt.models;

public class Data {
	
	private String tipoRespuesta;
	private String pregunta;
	private String respuesta;
	private String resultado;
	
<<<<<<< HEAD
	public Data(String tipoRespuesta, String pregunta, String respuesta, String resultado) {
		this.tipoRespuesta = tipoRespuesta;
		this.pregunta = pregunta;
		this.respuesta = respuesta;
		this.resultado = resultado;
=======
	
	public Data(String hour, String day, String subject) {
		this.hour = hour;
		this.day = day;
		this.subject = subject;
>>>>>>> 877ad33c9d512b7b64fc83aae811038dcbb79b38
	}


	public String getTipoRespuesta() {
		return tipoRespuesta;
	}


	public void setTipoRespuesta(String tipoRespuesta) {
		this.tipoRespuesta = tipoRespuesta;
	}


	public String getPregunta() {
		return pregunta;
	}


	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}


	public String getRespuesta() {
		return respuesta;
	}


	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}


	public String getResultado() {
		return resultado;
	}


	public void setResultado(String resultado) {
		this.resultado = resultado;
	}


	@Override
	public String toString() {
		return 	"\nTipoRespuesta=" + tipoRespuesta + 
				"\nPregunta=" + pregunta + 
				"\nRespuesta=" + respuesta +
				"\nResultado=" + resultado;
	}
	
	
	
	
	
	
	
	
	
}
