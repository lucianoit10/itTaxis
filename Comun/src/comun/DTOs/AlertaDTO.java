package comun.DTOs;

import java.sql.Timestamp;

public class AlertaDTO {
	private long id;
	private PedidoDTO pedido;
	private Timestamp activacion;
	private boolean estado = true;
	
	public AlertaDTO() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public PedidoDTO getPedido() {
		return pedido;
	}

	public void setPedido(PedidoDTO pedido) {
		this.pedido = pedido;
	}

	public Timestamp getActivacion() {
		return activacion;
	}

	public void setActivacion(Timestamp activacion) {
		this.activacion = activacion;
	}

	public boolean getEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
}
