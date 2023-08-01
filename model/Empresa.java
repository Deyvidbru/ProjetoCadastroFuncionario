package model;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	private String nome;
	private int cnpj;
	private int naturezaJuridica;
	private String setor;
	
	List<Funcionario> dados = new ArrayList<>();
	
	public void addElemento(Funcionario elemento) {
		dados.add(elemento);
	}
	
	public List<Funcionario> getElementos(){
		return dados;
	}
	
	public void removeElemento(Funcionario elemento) {
		dados.add(elemento);
	}
}

