package servidor.Persistencia.Dominio;

import java.sql.Timestamp;

public class Pedido {
	private long id;
	private Usuario receptor;
	private Cliente cliente;
	private Timestamp momentoPedido;
	private Destino destino;
	private String observacion;
	private Reserva reserva;
	private Timestamp fechaAReservar;
	private Integer estado=0;// -1 => cancelada | 0 => pendiente/sin concretar | 1 => concretada
		
	public Pedido() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Usuario getReceptor() {
		return receptor;
	}

	public void setReceptor(Usuario receptor) {
		this.receptor = receptor;
	}

	public Timestamp getMomentoPedido() {
		return momentoPedido;
	}

	public void setMomentoPedido(Timestamp momentoPedido) {
		this.momentoPedido = momentoPedido;
	}

	public Destino getDestino() {
		return destino;
	}

	public void setDestino(Destino destino) {
		this.destino = destino;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public Reserva getReserva() {
		return reserva;
	}

	public void setReserva(Reserva reserva) {
		this.reserva = reserva;
	}

	public Timestamp getFechaAReservar() {
		return fechaAReservar;
	}

	public void setFechaAReservar(Timestamp fechaAReservar) {
		this.fechaAReservar = fechaAReservar;
	}

	public Integer getEstado() {
		return estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}
	
}
