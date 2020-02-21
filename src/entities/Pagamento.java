package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.FormaPagamento;

public class Pagamento {
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private Date moment;
	private FormaPagamento pagamento;
	private Client client;
	
	private List<Item>  itens = new ArrayList<>();
	
	public Pagamento(Date moment, FormaPagamento pagamento, Client client) {
		this.moment = moment;
		this.pagamento = pagamento;
		this.client = client;
	}
	public Date getMoment() {
		return moment;
	}
	public void setMoment(Date moment) {
		this.moment = moment;
	}
	public FormaPagamento getPagamento() {
		return pagamento;
	}
	public void setPagamento(FormaPagamento pagamento) {
		this.pagamento = pagamento;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public List<Item> getItens() {
		return itens;
	}

	public void additem(Item item) {
		itens.add(item);
	}
	
	public void removeitem(Item item) {
		itens.remove(item);
	}
	
	public Double total() {
		double soma = 0.0;
		for(Item c : itens) {
			soma += c.subTotal();
		}
		return soma;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(client + "\n");
		sb.append(pagamento + "\n");
		sb.append(sdf.format(moment) + "\n");
		sb.append("-----------------------" + "\n");
		sb.append("Lista de itens \n");
		for (Item c : itens) {
			sb.append(c + "\n");
		}
		sb.append("Total: " + String.format("%.2f", total()));
		return sb.toString();
	}
	
	
	
	
}
