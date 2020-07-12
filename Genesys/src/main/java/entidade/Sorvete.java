package entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "SORVETE")
public class Sorvete {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "S_SORVETE")
	@SequenceGenerator(sequenceName = "S_SORVETE", name = "S_SORVETE", initialValue = 1)
	@Column(name = "ID", nullable = false)
	private Long id;
	@Column(name = "QTD_BOLAS", nullable = false)
	private String qtdBolas;

	@ManyToOne
	@JoinColumn(name = "ID_PEDIDO", referencedColumnName = "ID", nullable = false)
	private Pedido pedido;
	@OneToOne
	@JoinColumn(name = "ID_CALDA", referencedColumnName = "NOME", nullable = false)
	private Calda calda;
	@OneToOne
	@JoinColumn(name = "ID_SABOR", referencedColumnName = "NOME", nullable = false)
	private Sabor sabor;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getQtdBolas() {
		return qtdBolas;
	}

	public void setQtdBolas(String qtdBolas) {
		this.qtdBolas = qtdBolas;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Calda getCalda() {
		return calda;
	}

	public void setCalda(Calda calda) {
		this.calda = calda;
	}

	public Sabor getSabor() {
		return sabor;
	}

	public void setSabor(Sabor sabor) {
		this.sabor = sabor;
	}

}
