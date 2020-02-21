package application;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Item;
import entities.Pagamento;
import entities.Produto;
import entities.enums.FormaPagamento;


public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("KAMIKAZE SKATESHOP");
		System.out.println();
		System.out.println("Dados do cliente: ");
		System.out.print("Nome: ");
		String name = sc.nextLine();
		System.out.print("Instagram: ");
		String instagram = sc.nextLine();
		System.out.print("Data de nascimento: ");
		Date dateBirth = sdf.parse(sc.next());
		Client client = new Client(name, instagram, dateBirth);
		System.out.println();
		System.out.print("Forma de pagamento(avista/debito/prazo): ");
		FormaPagamento forma = FormaPagamento.valueOf(sc.next());
		Pagamento pagamento = new Pagamento(new Date(), forma, client);
		
		System.out.println();
		System.out.print("Quantos items pretende comprar? ");
		int quantItem = sc.nextInt();
		System.out.println();
		for (int i = 0; i<quantItem; i++) {
			sc.nextLine();
			System.out.print("Produto: ");
			String produto =sc.nextLine();
			System.out.print("Preço: ");
			Double price = sc.nextDouble();
			Produto produtos = new Produto(produto, price);
			System.out.print("Quantidade: ");
			Integer quant = sc.nextInt();
			System.out.println();
			Item itens = new Item(quant, price, produtos);
			pagamento.additem(itens);
			
		}
		
		System.out.println("---------------------------------");
		System.out.println("Nota fiscal");
		System.out.println(pagamento);
		sc.close();
	}

}
