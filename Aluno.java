package SistemaEscola;

import java.time.LocalDate;

public class Aluno {
	
	private String nome;
	private String email;
	private LocalDate dataNascimento;
	
	public Aluno (String nome, String email, LocalDate dataNascimento) {
		this.nome = nome;
		this.email = email;
		this.dataNascimento = dataNascimento;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	
	
}

