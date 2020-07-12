package dao;

import java.util.List;

import entidade.Calda;
import entidade.Pedido;
import entidade.Sabor;
import entidade.Sorvete;

public interface PedidoDAO {
	
	public void inserirPedido(Pedido pedido);
	public void alterarPedido(Pedido pedido);
	public void excluirPedido(Pedido pedido);
	public Pedido pesuisarPedido(Long idPedido);
	public List<Pedido> listarTodos();
	
	public void inserirSorvete(Sorvete sorvete);
	public void excluirSorvete(Sorvete sorvete);
	
	public List<Calda> listaCaldas();
	public List<Sabor> listaSabores();
}
