package SistemaEscola;

public class Professor {

  private String nome;
	private String email;
	private String especialidade;
	
	public Professor (String nome, String email, String especialidade) {
		this.nome = nome;
		this.email = email;
		this.especialidade = especialidade;
	}

	public String getNome() {
		return nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getEspecialidade() {
		return especialidade;
	}

}
