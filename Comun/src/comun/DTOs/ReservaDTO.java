package comun.DTOs;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class ReservaDTO {
	private long id;
	private ClienteDTO cliente;
	private Timestamp momentoDeReserva;
	private Date inicio;
	private Date fin;
	private boolean lunes = false;
	private boolean martes = false;
	private boolean miercoles = false;
	private boolean jueves = false;
	private boolean viernes = false;
	private boolean sabado = false;
	private boolean domingo = false;
	private Time hora;
	private Integer concretada = 0;// -1 => cancelada | 0 => pendiente/sin concretar | 1 => concretada
	
	public ReservaDTO() {
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

	public Timestamp getFechaDeReserva() {
		return momentoDeReserva;
	}

	public void setFechaDeReserva(Timestamp fechaDeReserva) {
		this.momentoDeReserva = fechaDeReserva;
	}

	public Integer getConcretada() {
		return concretada;
	}

	public void setConcretada(Integer concretada) {
		this.concretada = concretada;
	}

	public Timestamp getMomentoDeReserva() {
		return momentoDeReserva;
	}

	public void setMomentoDeReserva(Timestamp momentoDeReserva) {
		this.momentoDeReserva = momentoDeReserva;
	}

	public Date getInicio() {
		return inicio;
	}

	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}

	public Date getFin() {
		return fin;
	}

	public void setFin(Date fin) {
		this.fin = fin;
	}

	public boolean isLunes() {
		return lunes;
	}

	public void setLunes(boolean lunes) {
		this.lunes = lunes;
	}

	public boolean isMartes() {
		return martes;
	}

	public void setMartes(boolean martes) {
		this.martes = martes;
	}

	public boolean isMiercoles() {
		return miercoles;
	}

	public void setMiercoles(boolean miercoles) {
		this.miercoles = miercoles;
	}

	public boolean isJueves() {
		return jueves;
	}

	public void setJueves(boolean jueves) {
		this.jueves = jueves;
	}

	public boolean isViernes() {
		return viernes;
	}

	public void setViernes(boolean viernes) {
		this.viernes = viernes;
	}

	public boolean isSabado() {
		return sabado;
	}

	public void setSabado(boolean sabado) {
		this.sabado = sabado;
	}

	public boolean isDomingo() {
		return domingo;
	}

	public void setDomingo(boolean domingo) {
		this.domingo = domingo;
	}

	public Time getHora() {
		return hora;
	}

	public void setHora(Time hora) {
		this.hora = hora;
	}

}
