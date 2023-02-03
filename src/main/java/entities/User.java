package entities;

import java.util.Objects;

public class User {
	
	private int id;
	private String nome;
	private String eMail;
	private String telefone;
	private String password;
	
	public User() {
		
	}
	
	public User(String nome, String eMail, String telefone, String password) {
		this.nome = nome;
		this.eMail = eMail;
		this.telefone = telefone;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public int hashCode() {
		return Objects.hash(eMail, id, nome, password, telefone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(eMail, other.eMail) && id == other.id && Objects.equals(nome, other.nome)
				&& Objects.equals(password, other.password) && Objects.equals(telefone, other.telefone);
	}
	 
	
	
	
	
}
