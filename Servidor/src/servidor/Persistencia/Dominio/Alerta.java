package servidor.Persistencia.Dominio;

import java.sql.Timestamp;

public class Alerta {
	private long id;
	private Pedido pedido;
	private Timestamp activacion;
	private boolean estado = true;
	
	public Alerta() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
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
