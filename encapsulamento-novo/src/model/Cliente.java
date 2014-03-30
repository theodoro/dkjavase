package model;

import java.time.temporal.ValueRange;

public class Cliente {

	private String nome;
	private Integer cpf;

	public Cliente() {

	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public void setCpf(Integer cpf) {
		validaCpf(cpf);
		this.cpf = cpf;
	}

	public Integer getCpf() {
		return this.cpf;
	}

	public boolean validaCpf(Integer cpf) {
		if (Integer.toString(cpf.intValue()).length() < 15) {
			
			System.out.println("CPF Invalido!!!");
			
			return false;
		}else{
			return true;
		}
	}

}
