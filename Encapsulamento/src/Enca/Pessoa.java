package Enca;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
	
	private String nome;
	private LocalDate dataNasimento;
	
	public Pessoa(String nome,int dia,int mes, int ano){
		this.nome= nome;
		this.dataNasimento = LocalDate.of(ano,mes,dia);
	};
	
	public int calcularIdade() {
		return Period.between(dataNasimento, LocalDate.now()).getYears();
	};
	
	public String getNome() {
		return nome;
	};
	public void setNome(String nome) {
		this.nome = nome;
	};
	public LocalDate getDataNasimento() {
		return dataNasimento;
	}
}


