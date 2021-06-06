package view;

import java.util.Scanner;

import model.Shop;
import model.User;

public class Client {

	public static void main(String[] args) {
		String type = "";
		String name = "";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Olá, Qual o seu nome?");
		name = sc.next();
		System.out.println("Qual o seu gênero? [M/F] ou [Indefinido]");
		type = sc.next();
		
		Shop shop = new Shop();
		User user = shop.getUser(name, type);

		System.out.println(user.salutation(type));

		
		sc.close();
		
		
	}

}