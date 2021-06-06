package model;

public class User {
	
		private String name;
		private String type;

		public User(String name, String typeGender) {
			this.name = name;
			this.type = typeGender;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getTypeGender() {
			return type;
		}

		public void setTypeGender(String typeGender) {
			this.type = typeGender;
		}

		public String salutation(String type) {
			return "Bem-vindo(a) " + this.name + "!";
		}

	

}
