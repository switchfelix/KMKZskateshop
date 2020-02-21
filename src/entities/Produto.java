package entities;

public class Produto {
	private String produto;
	private Double preco;
	
	public Produto(String produto) {
		this.produto = produto;
	}
	public Produto(String produto, Double preco) {
		this.produto = produto;
		this.preco = preco;
	}
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	
}
