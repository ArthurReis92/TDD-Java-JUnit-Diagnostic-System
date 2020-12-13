package testes;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import source.Diagnostico;
import source.ProntuarioDigital;

public class TestDiagnostico {
	ProntuarioDigital pd;

	double temperatura = 37;
	int glicose = 88;
	private int batimentos = 85;
	private int saturacao = 98;
	private int pSistolica = 119;
	private int pDiastolica = 70;

	@Before
	public void initProntuario() {
		pd = new ProntuarioDigital(temperatura, glicose, batimentos, saturacao, pSistolica, pDiastolica);
	}

	@Test
	public void testVerificaGlicoseNormal() {
		pd.setGlicose(92);
		assertEquals("Normal", Diagnostico.verificaGlicose(pd));
	}

	@Test
	public void testVerificaGlicosePreDiabetes() {
		pd.setGlicose(120);
		assertEquals("Pre Diabetes", Diagnostico.verificaGlicose(pd));
	}

	@Test
	public void testVerificaGlicoseDiabetes() {
		pd.setGlicose(130);
		assertEquals("Diabetes", Diagnostico.verificaGlicose(pd));
	}
	
	@Test
	public void testVerificaOxigenacaoBaixa() {
		pd.setSaturacao(82);
		assertEquals("Saturação baixa - hipóxia", Diagnostico.verificaOxigenacao(pd));
	}
	
	@Test
	public void testVerificaOxigenacaoAlerta() {
		pd.setSaturacao(92);
		assertEquals("Saturação em alerta, verificar se o paciente apresenta sintomas de gripe ou resfriado", Diagnostico.verificaOxigenacao(pd));
	}
	
	@Test
	public void testVerificaOxigenacaoNormal() {
		assertEquals("Saturação normal", Diagnostico.verificaOxigenacao(pd));
	}
}
