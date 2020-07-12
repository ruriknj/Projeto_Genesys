package aplicacao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CALDA")
public class Calda {

	@Id
	@Column(name = "id_calda")
	private Long id;
}
