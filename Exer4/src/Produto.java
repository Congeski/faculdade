
public class Produto {
	public String nome;
	public float preco;
	public int quantidade;
	
	public Produto(String nome, float preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public int efetuarVenda(int quantidade){
		if(this.quantidade > quantidade) {
			this.quantidade = this.quantidade - quantidade;
			return 1;
		}
		else {
			return 0;
		}
	}
	
	
}
