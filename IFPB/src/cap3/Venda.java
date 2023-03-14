package cap3;

public class Venda {
	
	private String data;
	private String nome;
	private int quantidade;
	private double valor;
	
	public Venda(String data, Produto produto, int quantidade) {
		this.data = data;
		this.quantidade = quantidade;
		this.valor = produto.getPreco() * quantidade;
		produto.setEstoque(produto.getEstoque() - this.quantidade);
	}

	@Override
	public String toString() {
		return String.format(" - Venda %s -%ndata = %s%nquantidade = %s%nvalor = %s", nome, data, quantidade, valor);
	}
	
}
