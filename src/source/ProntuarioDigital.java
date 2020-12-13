package source;

public class ProntuarioDigital {

	private double temperatura;
	private int glicose;
	private int batimentos;
	private int saturacao;
	private int pSistolica;
	private int pDiastolica;
	
	public ProntuarioDigital(double temperatura, int glicose, int batimentos, int saturacao, int pSistolica,
			int pDiastolica) {
		super();
		this.temperatura = temperatura;
		this.glicose = glicose;
		this.batimentos = batimentos;
		this.saturacao = saturacao;
		this.pSistolica = pSistolica;
		this.pDiastolica = pDiastolica;
	}
	
	public double getTemperatura() {
		return temperatura;
	}
	public int getGlicose() {
		return glicose;
	}
	public int getBatimentos() {
		return batimentos;
	}
	public int getSaturacao() {
		return saturacao;
	}
	public int getpSistolica() {
		return pSistolica;
	}
	public int getpDiastolica() {
		return pDiastolica;
	}
	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}
	public void setGlicose(int glicose) {
		this.glicose = glicose;
	}
	public void setBatimentos(int batimentos) {
		this.batimentos = batimentos;
	}
	public void setSaturacao(int saturacao) {
		this.saturacao = saturacao;
	}
	public void setpSistolica(int pSistolica) {
		this.pSistolica = pSistolica;
	}
	public void setpDiastolica(int pDiastolica) {
		this.pDiastolica = pDiastolica;
	}
	
}
