package source;

public class Diagnostico {

	public static String verificaGlicose(ProntuarioDigital prontuario) {
		String resultado = "Valor inv�lido";
		if (prontuario.getGlicose() < 100 && prontuario.getGlicose() > 0) resultado = "Normal";
		else if (prontuario.getGlicose() >= 100 && prontuario.getGlicose() <= 125) resultado = "Pre Diabetes";
		else if (prontuario.getGlicose() > 125) resultado = "Diabetes";
		return resultado;
	}
	
	public static String verificaOxigenacao(ProntuarioDigital prontuario) {
		String resultado = "Indeterminado";
		if (prontuario.getSaturacao() < 90) {
			resultado = "Satura��o baixa - hip�xia";
		} else if (prontuario.getSaturacao() >= 90 && prontuario.getSaturacao() <= 94) {
			resultado = "Satura��o em alerta, verificar se o paciente apresenta sintomas de gripe ou resfriado";
		} else {
			resultado = "Satura��o normal";
		}
		return resultado;
	}

}
