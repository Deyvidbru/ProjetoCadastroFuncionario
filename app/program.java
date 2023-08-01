package app;

import java.util.List;
//import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.Empresa;
import model.Funcionario;

public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Empresa empresa = new Empresa();
		int opcao = 0;
		
		do {
			System.out.println("--------- Oxente Sistemas --------");
			System.out.println("1 .................Cadastrar Funcionário");
			System.out.println("2 ................ Exibir dados do Funcionário");
			System.out.println("3 ................ Remover Funcionário");
			System.out.println("4 ................ Exibir todos os funcionários cadastrados");
			System.out.println("0 ............... Sair");
			System.out.print("Digite a opção desejada: ");
			opcao = sc.nextInt();
			System.out.println();
			
			switch(opcao) {
			case 1:
				System.out.print("Digite o cpf do funcionario: ");
				int cpf = sc.nextInt();
				System.out.print("Digite o nome do funcionario: ");
				sc.nextLine();
				String nome = sc.nextLine();
				System.out.print("Digite o salario do funcionario: ");
				double salario = sc.nextDouble();
				System.out.println();
				Funcionario func = new Funcionario(cpf, nome, salario);
				empresa.addElemento(func);
				break;
			case 2:
				System.out.print("Digite o cpf do funcionario: ");
				cpf = sc.nextInt();
				
				boolean registro = false;
				
				List<Funcionario> funcionario = empresa.getElementos();
				
				for(Funcionario f : funcionario) {
					if(cpf == f.getCpf()) {
						System.out.println("\nDados do funcionario");
						System.out.println("--------------------");
						System.out.printf("Nome do funcionario: %s%nCPF do funcionario: %d%nSalario do funcionario: R$%.2f%n%n", f.getNome(), f.getCpf(), f.getSalario());
						registro = true;
					}
				}
				if(!registro) {
					System.out.println("Esse funcionario nao existe\n");
				}	
				break;
			case 3:
				System.out.print("Digite o cpf do funcionario: ");
				cpf = sc.nextInt();
				registro = false; 
				
				funcionario = empresa.getElementos();
				
				for(int i = 0; i < funcionario.size(); i++) {
					Funcionario f = funcionario.get(i);
					if(cpf == f.getCpf()) {
						funcionario.remove(f);
						System.out.println("Funcionario removido\n");
						registro = true;
					}
				}
				
				if(!registro) {
					System.out.println("Esse funcionario nao existe\n");
				}
				break;
				
			case 4:
				funcionario = empresa.getElementos();
				if(funcionario.size() == 0) {
					System.out.println("Nao ha nenhum funcionario\n");
				}else {
					for(Funcionario f : funcionario) {
						System.out.printf("Nome do funcionario: %s%nCPF do funcionario: %d%nSalario do funcionario: R$%.2f%n%n", f.getNome(), f.getCpf(), f.getSalario());
					}
				}
				break;
			case 0:
				System.out.println("Procura finalizada!");
				break;
			default:
				System.out.println("Dado errado! Digite novamente\n");
				break;
			}
		}while(opcao != 0);
		sc.close();
	}
}
