package entidade;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.crypto.Data;

@Entity
@Table(name = "PEDIDO")
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "S_PEDIDO")
	@SequenceGenerator(name = "S_PEDIDO", sequenceName = "S_PEDIDO", allocationSize = 1)
	@Column(name = "ID", nullable = false)
	private Long id;
	@Column(name = "NOME_CLIENTE", nullable = false)
	private String nomeCliente;
	@Column(name = "DATA_PEDIDO", nullable = false)
	private Data dataPedido;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "PEDIDO")
	private List<Sorvete> sorvetes = new ArrayList<>();

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public Data getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(Data dataPedido) {
		this.dataPedido = dataPedido;
	}

	public List<Sorvete> getSorvetes() {
		return sorvetes;
	}

	public void setSorvetes(List<Sorvete> sorvetes) {
		this.sorvetes = sorvetes;
	}

}
