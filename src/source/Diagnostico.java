package source;

public class Diagnostico {

	public static String verificaGlicose(ProntuarioDigital prontuario) {
		String resultado = "Valor inválido";
		if (prontuario.getGlicose() < 100 && prontuario.getGlicose() > 0) resultado = "Normal";
		else if (prontuario.getGlicose() >= 100 && prontuario.getGlicose() <= 125) resultado = "Pre Diabetes";
		else if (prontuario.getGlicose() > 125) resultado = "Diabetes";
		return resultado;
	}

}
