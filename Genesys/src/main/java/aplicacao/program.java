package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import entidade.Usuario;
import util.JpaUtil;

public class program {

	public static void main(String[] args) {

		EntityManager em = JpaUtil.getEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		Usuario usuario = new Usuario("nick@com", "Nick", "987654321", "12345");

		em.persist(usuario);

		tx.commit();

		em.close();

	}

}
