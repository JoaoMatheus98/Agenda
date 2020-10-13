
public class TabelaHash {
	private Arvore[] tabela;
	
	public TabelaHash() 
	{
		tabela = new Arvore[26];
		for(int i = 0; i<26; i++) 
		{
			tabela[i] = null;
		}
	}
	
	private int funcaoHash(String nome) 
	{
		return nome.toLowerCase().charAt(0) % 26;
	}
	
	public void inserir(String nome,int dia,int mes) 
	{
		int i = funcaoHash(nome);
		if(tabela[i]==null) 
		{
			tabela[i] = new Arvore();
		}
		tabela[i].adicionar(nome, dia, mes);
	}
	
	public void exibir() 
	{
		for(int i = 0; i<26 ;i++) 
		{
			if(tabela[i]!=null) 
			{
				tabela[i].exibirEmOrdem();
			}
		}
	}
	
	public void busca(String nome) 
	{
		int i = funcaoHash(nome);
		if(tabela[i].pesquisar(nome)==true) 
		{
			System.out.println("A pessoa" +nome+ "ja existe na tabela");
		}
		else 
			System.out.println("Pessoa nao cadastrada");
	}
	
	public void exibirPorLetra(String nome) 
	{
		int i = funcaoHash(nome);
		if(tabela[i]!=null) 
		{
			tabela[i].exibirEmOrdem();
		}
		else
			System.out.println("Nao existem pessoas com essa inicial");
	}

}
