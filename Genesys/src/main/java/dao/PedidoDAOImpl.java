package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.primefaces.expression.impl.FindComponentExpressionResolver;

import entidade.Calda;
import entidade.Pedido;
import entidade.Sabor;
import entidade.Sorvete;
import entidade.Usuario;
import util.JpaUtil;

public class PedidoDAOImpl implements PedidoDAO{

	@Override
	public void inserirPedido(Pedido pedido) {
		EntityManager ent = JpaUtil.getEntityManager();
		
		EntityTransaction trans = ent.getTransaction();
		trans.begin();
		
		ent.persist(pedido);
		
		trans.commit();
		ent.close();
	}

	@Override
	public void alterarPedido(Pedido pedido) {
EntityManager ent = JpaUtil.getEntityManager();
		
		EntityTransaction trans = ent.getTransaction();
		trans.begin();
		
		ent.merge(pedido);
		
		trans.commit();
		ent.close();
	}
		
	}

	@Override
	public void excluirPedido(Pedido pedido) {
EntityManager ent = JpaUtil.getEntityManager();
		
		EntityTransaction trans = ent.getTransaction();
		trans.begin();
		
		ent.remove(pedido);
		
		trans.commit();
		ent.close();
	}
		

	@Override
	public Pedido pesuisarPedido(Long idPedido) {
		EntityManager ent = JpaUtil.getEntityManager();
		
		Pedido pedido = ent.find(Pedido.class, 1L);

		return pedido;
		return null;
	}

	@Override
	public List<Pedido> listarTodos() {
		EntityManager ent = JpaUtil.getEntityManager();

		Query query = ent.createQuery("from Pedido p");
		
		List<Pedido> pedidos = query.getResultList();
	
		return pedidos;
	}

	@Override
	public void inserirSorvete(Sorvete sorvete) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluirSorvete(Sorvete sorvete) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Calda> listaCaldas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Sabor> listaSabores() {
		// TODO Auto-generated method stub
		return null;
	}

}
