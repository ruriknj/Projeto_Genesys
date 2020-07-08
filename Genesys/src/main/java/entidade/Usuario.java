package entidade;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USUARIO")
public class Usuario {

	@Id
	private String email;
	private String nome;
	private String cpf;
	private String senha;

	public Usuario(String email, String nome, String cpf, String senha) {
		super();
		this.email = email;
		this.nome = nome;
		this.cpf = cpf;
		this.senha = senha;
	}

	public Usuario() {
	}

	public String getNome() {
		return nome;

	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "Usuario [nome=" + nome + ", email=" + email + ", cpf=" + cpf + ", senha=" + senha + "]";
	}

}
