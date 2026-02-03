package SistemaEscola;

import java.time.LocalDate;

public class Matricula {
	
	private LocalDate dataMatricula;
	private String status;
	
	public Matricula (LocalDate dataMatricula, String status) {
		this.dataMatricula = dataMatricula;
		this.status = status;
	}
	
	public LocalDate getDataMatricula() {
		return dataMatricula;
	}
	
	public String getStatus() {
		return status;
	}
}
