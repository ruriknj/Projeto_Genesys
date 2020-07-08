package controle;

import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.primefaces.PrimeFaces;
import entidade.Usuario;


@ManagedBean(name = "Login")
@SessionScoped
public class loginBean {

	private String emailAdm = "";
	private String senhaAdm = "";
	private List<Usuario> listaUsuarios;
	private String mensagem;
	private Usuario usuario;
	// private UsuarioDao usuarioDao;

	public loginBean() {

		this.usuario = new Usuario();
		this.listaUsuarios = new ArrayList<Usuario>();
		// this.usuarioDao = new UsuarioDao(EntityManagerUtil.getEntityManager());
	}

	public void login() {
		FacesMessage message = null;
		boolean loggedIn = false;

		for (Usuario usuario : listaUsuarios) {
			System.out.println("---------------------");
			System.out.println("Credenciais:" + usuario.getEmail() + "," + usuario.getSenha());
			System.out.println("EmailAdm: " + emailAdm + ", SenhaAdm: " + senhaAdm);
			// System.out.println("loggedIn: " + loggedIn);
			if (emailAdm != null && (emailAdm.equals(usuario.getEmail())) && senhaAdm.equals(usuario.getSenha())
					&& senhaAdm != null) {
				loggedIn = true;
			}
		}
		if (loggedIn) {
			// System.out.println("loggedIn: " + loggedIn);
			message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Bem-vindo", emailAdm);
		} else {
			loggedIn = false;
			System.out.println("Usuario cadastrado final: " + usuario.getEmail() + ", " + usuario.getSenha());
			message = new FacesMessage(FacesMessage.SEVERITY_WARN, "Loggin errado", "Credenciais invalidas");
		}
		FacesContext.getCurrentInstance().addMessage(null, message);
		PrimeFaces.current().ajax().addCallbackParam("loggedIn", loggedIn);
		// System.out.println("loggedIn final: " + loggedIn);
	}

	public String salvar() {

		Usuario novo = new Usuario();

		System.out.println("Usuario digitado: " + this.usuario.getEmail() + ", " + this.usuario.getSenha());
		novo.setNome(this.usuario.getNome());
		novo.setEmail(this.usuario.getEmail());
		novo.setCpf(this.usuario.getCpf());
		novo.setSenha(this.usuario.getSenha());

		System.out.println("Usuario cadastrado: " + novo.getEmail() + ", " + novo.getSenha());
		listaUsuarios.add(novo);
		// this.getUsuarioDao().salvar(usuario);
		System.out.println("Usuario cadastrado2: " + listaUsuarios);
		// this.mensagem = "Usuario cadastrado com Sucesso !!!";
		setEmailAdm("");
		setSenhaAdm("");
		this.usuario = new Usuario();
		return "login?faces-redirect=true";

	}

	public String cadastroUsuario() {
		return "cadastroUsuario?faces-redirect=true";
	}

	public String getEmailAdm() {
		return emailAdm;
	}

	public void setEmailAdm(String emailAdm) {
		this.emailAdm = emailAdm;
	}

	public String getSenhaAdm() {
		return senhaAdm;
	}

	public void setSenhaAdm(String senhaAdm) {
		this.senhaAdm = senhaAdm;
	}

	public List<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}

	public void setListaUsuarios(List<Usuario> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
