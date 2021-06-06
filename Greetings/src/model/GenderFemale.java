package model;

public class GenderFemale extends User{

	public GenderFemale(String name, String typeGender) {
		super(name, typeGender);
	}
	
	public String salutation(String type) {
		return "Bem-vindo, Sra. " + getName() + "!";
		
	}


}

