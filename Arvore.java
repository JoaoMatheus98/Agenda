
public class Arvore {
	private No raiz;
	public void adicionar(String nome, int dia, int mes) 
	{
		if(raiz == null) 
		{
			raiz = new No(nome,dia,mes);
		}
		else 
		{
			adicionar(nome,dia,mes,raiz);
		}
	}
	public void adicionar(String nome,int dia,int mes,No raiz) 
	{
		if(nome.compareTo(raiz.nome)<0) 
		{
			if(raiz.esquerda==null) 
			{
				raiz.esquerda = new No(nome,dia,mes);
			}
			else 
			{
				adicionar(nome,dia,mes, raiz.esquerda);
			}
		}
		
		else if(nome.compareTo(raiz.nome)>0) 
		{
			if(raiz.direita == null) 
			{
				raiz.direita = new No(nome,dia,mes);
			}
			else 
			{
				adicionar(nome,dia,mes,raiz.direita);
			}
		}
	}
	
	public boolean pesquisar(String nome) 
	{
		if(raiz == null) 
		{
			return false;
		}
		else 
		{
			return pesquisar(nome,raiz);
		}
	}
	
	public boolean pesquisar(String nome,No raiz) 
	{
		if(nome == raiz.nome) 
		{
			return true;
		}
		
		else if(nome.compareTo(raiz.nome)<0) 
		{
			if (raiz.esquerda == null) 
			{
				return false;
			}
			else 
			{
				return pesquisar(nome,raiz.esquerda);
			}
		}
		
		else if (nome.compareTo(raiz.nome)>0) 
		{
			if (raiz.direita == null) 
			{
				return false;
			}
			else 
			{
				return pesquisar(nome,raiz.direita);
			}
		}
		
		return false;
	}
	
	public void exibirEmOrdem() 
	{
		if(raiz != null) 
		{
			exibirEmOrdem(raiz);
		}
	}
	
	public void exibirEmOrdem(No raiz) 
	{
		if (raiz.esquerda != null) 
		{
			exibirEmOrdem(raiz.esquerda);
		}

		System.out.print(raiz.nome + "..." + raiz.dia + "/" + raiz.mes);
		System.out.println();

		if (raiz.direita != null) 
		{
			exibirEmOrdem(raiz.direita);
		}
	}

}
