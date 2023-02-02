package entities;

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
	 
	
	
	
	
}
