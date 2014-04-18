package comun.DTOs;

import java.sql.Timestamp;

public class PedidoDTO {
	private long id;
	private UsuarioDTO receptor;
	private ClienteDTO cliente;
	private Timestamp momentoPedido;
	private DestinoDTO destino;
	private String observacion;
	private ReservaDTO reserva;
	private Timestamp fechaAReservar;
	private Integer estado=0;// -1 => cancelada | 0 => pendiente/sin concretar | 1 => concretada
		
	public PedidoDTO() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public ClienteDTO getCliente() {
		return cliente;
	}

	public void setCliente(ClienteDTO cliente) {
		this.cliente = cliente;
	}

	public UsuarioDTO getReceptor() {
		return receptor;
	}

	public void setReceptor(UsuarioDTO receptor) {
		this.receptor = receptor;
	}

	public Timestamp getMomentoPedido() {
		return momentoPedido;
	}

	public void setMomentoPedido(Timestamp momentoPedido) {
		this.momentoPedido = momentoPedido;
	}

	public DestinoDTO getDestino() {
		return destino;
	}

	public void setDestino(DestinoDTO destino) {
		this.destino = destino;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public ReservaDTO getReserva() {
		return reserva;
	}

	public void setReserva(ReservaDTO reserva) {
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
