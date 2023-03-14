package cap3;

public class Produto {
	private String nome;
	private double estoque;
	private double preco;
	
	public Produto(String nome, double estoque, double preco) {
		super();
		this.nome = nome;
		this.estoque = estoque;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getEstoque() {
		return estoque;
	}

	public void setEstoque(double estoque) {
		this.estoque = estoque;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	@Override
	public String toString() {
		return String.format("- Produto %s -%nestoque = %s%npreco = %s%n", nome, estoque, preco);
	}
	
}
