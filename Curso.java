package SistemaEscola;

public class Curso {
  private String nome;
	private double cargaHoraria;
	private String descricao;
	
	public Curso (String nome, double cargaHoraria, String descricao) {
		this.nome = nome;
		this.cargaHoraria = cargaHoraria;
		this.descricao = descricao;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getCargaHoraria() {
		return cargaHoraria;
	}
	
	public String getDescricao() {
		return descricao;
	}

}

