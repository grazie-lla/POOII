package br.com.ada.pooii.exercicio6;

import java.util.List;

public class PedidoRepository {
    public void buscarPedido(long id) { /* Violação do SRP */ }
    public void salvar(Pedido pedido) { /* Violação do SRP */ }
    public void atualizar(long id, Pedido pedido) { /* Violação do SRP */ }
    public void deletar(long id) { /* Violação do SRP */ }

}
