package model;

public class Shop extends AbstractShop{

	
	public Shop() {}

	public User getUser(String name, String type) {
		if(type.equals("M")) {
			return new GenderMale(name, type);
		}else if (type.equals("F")) {
			return new GenderFemale(name, type);
		} else if (type.equals("Indefinido")){
			return new User(name, type);
		}else {
			return null;
		}	
	}
}
