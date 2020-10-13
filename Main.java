import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int op, dia, mes;
		String nome;
		TabelaHash tabela = new TabelaHash();
		
		do 
		{
			System.out.println();
			System.out.println("Menu");
			System.out.println("");
			System.out.println("1-Cadastrar pessoa");
			System.out.println("2-Consultar todas as pessoas inseridas");
			System.out.println("3-Consultar uma pessoa");
			System.out.println("4-Consultar todas as pessoas com inicial digitada");
			System.out.println("5-Sair");
			op = entrada.nextInt();
			if(op<1||op>5)
				System.out.println("Opção invalida");
			if(op==1) 
			{
				System.out.println("Informe o nome");
				nome = entrada.next();
				System.out.println("Informe o dia");
				dia = entrada.nextInt();
				System.out.println("Informe o mes");
				mes = entrada.nextInt();
				tabela.inserir(nome, dia, mes);
				System.out.println("Inserido com sucesso!");
			}
			
			if(op==2) 
			{
				tabela.exibir();
			}
			if(op==3) 
			{
				System.out.println("Consultar se uma pessoa esta na lista");
				nome = entrada.next();
				tabela.busca(nome);
				System.out.println("Digite a primeira letra do nome");
				nome = entrada.next();
				tabela.exibirPorLetra(nome);
			}
			if(op==4) 
			{
				System.out.println("Digite a primeira letra do nome");
				nome = entrada.next();
				tabela.exibirPorLetra(nome);
			}
		}while(op!=6);
		

	}

}
