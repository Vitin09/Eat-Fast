package proyectoDAO;
// Generated 08-may-2018 19:15:02 by Hibernate Tools 5.1.0.Alpha1

import java.util.Date;

/**
 * Pedido generated by hbm2java
 */
public class Pedido implements java.io.Serializable {

	private int pkIdPedido;
	private Cliente cliente;
	private Restaurantexcarta restaurantexcarta;
	private Date fechaHora;

	public Pedido() {
	}

	public Pedido(int pkIdPedido) {
		this.pkIdPedido = pkIdPedido;
	}

	public Pedido(int pkIdPedido, Cliente cliente, Restaurantexcarta restaurantexcarta, Date fechaHora) {
		this.pkIdPedido = pkIdPedido;
		this.cliente = cliente;
		this.restaurantexcarta = restaurantexcarta;
		this.fechaHora = fechaHora;
	}

	public int getPkIdPedido() {
		return this.pkIdPedido;
	}

	public void setPkIdPedido(int pkIdPedido) {
		this.pkIdPedido = pkIdPedido;
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Restaurantexcarta getRestaurantexcarta() {
		return this.restaurantexcarta;
	}

	public void setRestaurantexcarta(Restaurantexcarta restaurantexcarta) {
		this.restaurantexcarta = restaurantexcarta;
	}

	public Date getFechaHora() {
		return this.fechaHora;
	}

	public void setFechaHora(Date fechaHora) {
		this.fechaHora = fechaHora;
	}

}