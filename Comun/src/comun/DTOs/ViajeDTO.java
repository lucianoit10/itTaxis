package comun.DTOs;

import java.sql.Timestamp;

public class ViajeDTO {
	private long id;
	private PedidoDTO pedido;
	private UsuarioDTO asignador;
	private TurnoDTO asignado;
	private Timestamp momentoAsignacion;
	private String zonaDestino;
	private Double recaudacion;
	private Timestamp momentoConcretacion;
	
	public ViajeDTO() {
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

	public UsuarioDTO getAsignador() {
		return asignador;
	}

	public void setAsignador(UsuarioDTO asignador) {
		this.asignador = asignador;
	}

	public TurnoDTO getAsignado() {
		return asignado;
	}

	public void setAsignado(TurnoDTO asignado) {
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
