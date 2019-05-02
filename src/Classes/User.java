package Classes;

import javax.validation.constraints.NotEmpty;

public class User {
	@NotEmpty(message="No puede estar vacio")
	String name;
	@NotEmpty(message="No puede estar vacio")
	String surname;
	@NotEmpty(message="No puede estar vacio")
	String lolUser;
	@NotEmpty(message="No puede estar vacio")
	String server;

	public User() {
		
	}
	
	public User(String name, String surname, String lolUser, String server, boolean active) {
		this.name = name;
		this.surname = surname;
		this.lolUser = lolUser;
		this.server = server;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getLolUser() {
		return lolUser;
	}

	public void setLolUser(String lolUser) {
		this.lolUser = lolUser;
	}

	public String getServer() {
		return server;
	}

	public void setServer(String server) {
		this.server = server;
	}
}
