package servidor.Persistencia.Dominio;

import java.sql.Timestamp;

public class Viaje {
	private long id;
	private Pedido pedido;
	private Usuario asignador;
	private Turno asignado;
	private Timestamp momentoAsignacion;
	private String zonaDestino;
	private Double recaudacion;
	private Timestamp momentoConcretacion;
	
	public Viaje() {
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

	public Usuario getAsignador() {
		return asignador;
	}

	public void setAsignador(Usuario asignador) {
		this.asignador = asignador;
	}

	public Turno getAsignado() {
		return asignado;
	}

	public void setAsignado(Turno asignado) {
		this.asignado = asignado;
	}

	public Timestamp getMomentoAsignacion() {
		return momentoAsignacion;
	}

	public void setMomentoAsignacion(Timestamp momentoAsignacion) {
		this.momentoAsignacion = momentoAsignacion;
	}

	public String getZonaDestino() {
		return zonaDestino;
	}

	public void setZonaDestino(String zonaDestino) {
		this.zonaDestino = zonaDestino;
	}

	public Double getRecaudacion() {
		return recaudacion;
	}

	public void setRecaudacion(Double recaudacion) {
		this.recaudacion = recaudacion;
	}

	public Timestamp getMomentoConcretacion() {
		return momentoConcretacion;
	}

	public void setMomentoConcretacion(Timestamp momentoConcretacion) {
		this.momentoConcretacion = momentoConcretacion;
	}

}
