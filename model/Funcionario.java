package model;

public class Funcionario {
	private int cpf;
	private String nome;
	private double salario;
	
	public Funcionario(int cpf, String nome, double salario) {
		this.cpf = cpf;
		this.nome = nome;
		this.salario = salario;
	}
	
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
