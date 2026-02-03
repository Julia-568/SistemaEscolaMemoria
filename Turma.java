package SistemaEscola;

public class Turma {

  private int codigoTurma;
	private int ano;
	private String periodo;
	
	public Turma (int codigoTurma, int ano, String periodo) {
		this.codigoTurma = codigoTurma;
		this.ano = ano;
		this.periodo = periodo;
	}
	
	public int getCodigoTurma() {
		return codigoTurma;
	}
	
	public int getAno() {
		return ano;
	}
	
	public String getPeriodo() {
		return periodo;
	}

}
