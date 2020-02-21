package entities;

public class Item {
		private Integer quant;
		private Double price;
		private Produto produto;
		public Item(Integer quant, Double price, Produto produto) {
			this.quant = quant;
			this.price = price;
			this.produto = produto;
		}
		public Integer getQuant() {
			return quant;
		}
		public void setQuant(Integer quant) {
			this.quant = quant;
		}
		public Double getPrice() {
			return price;
		}
		public void setPrice(Double price) {
			this.price = price;
		}
		public Produto getProduto() {
			return produto;
		}
		public void setProduto(Produto produto) {
			this.produto = produto;
		}
		
		public Double subTotal() {
			return quant * price;
		}
		@Override
		public String toString() {
			return  produto.getProduto() + "  $"
					+ price + "\n"					
					+ "Quant: "
					+ quant
					+ " SubTotal: "
					+ String.format("%.2f", subTotal());
		}
		
		
		
}
