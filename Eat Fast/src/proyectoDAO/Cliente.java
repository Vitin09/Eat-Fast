package proyectoDAO;
// Generated 08-may-2018 19:15:02 by Hibernate Tools 5.1.0.Alpha1

import java.util.HashSet;
import java.util.Set;

/**
 * Cliente generated by hbm2java
 */
public class Cliente implements java.io.Serializable {

	private int pkIdCliente;
	private String nombreCliente;
	private String dni;
	private String direccion;
	private Integer telefono;
	private Set pedidos = new HashSet(0);

	public Cliente() {
	}

	public Cliente(int pkIdCliente) {
		this.pkIdCliente = pkIdCliente;
	}

	public Cliente(/*int pkIdCliente,*/ String nombreCliente, String dni, String direccion, Integer telefono, Set pedidos) {
		this.pkIdCliente = pkIdCliente;
		this.nombreCliente = nombreCliente;
		this.dni = dni;
		this.direccion = direccion;
		this.telefono = telefono;
		this.pedidos = pedidos;
	}

	public int getPkIdCliente() {
		return this.pkIdCliente;
	}

	public void setPkIdCliente(int pkIdCliente) {
		this.pkIdCliente = pkIdCliente;
	}

	public String getNombreCliente() {
		return this.nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getDni() {
		return this.dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Integer getTelefono() {
		return this.telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

	public Set getPedidos() {
		return this.pedidos;
	}

	public void setPedidos(Set pedidos) {
		this.pedidos = pedidos;
	}

}
