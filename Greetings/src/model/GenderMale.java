package model;

public class GenderMale extends User{

	public GenderMale(String name, String typeGender) {
		super(name, typeGender);
	}
	
	public String salutation(String type) {
		return "Bem-vindo, Sr. " + getName() + "!";
		
	}

}
