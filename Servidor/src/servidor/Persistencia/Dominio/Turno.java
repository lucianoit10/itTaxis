package servidor.Persistencia.Dominio;

import java.sql.Timestamp;

public class Turno {
	private long id;
	private Chofer chofer;
	private Coche coche;
	private Timestamp desde; 
	private Timestamp hasta;
	
	public Turno() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Chofer getChofer() {
		return chofer;
	}

	public void setChofer(Chofer chofer) {
		this.chofer = chofer;
	}

	public Coche getCoche() {
		return coche;
	}

	public void setCoche(Coche coche) {
		this.coche = coche;
	}

	public Timestamp getDesde() {
		return desde;
	}

	public void setDesde(Timestamp desde) {
		this.desde = desde;
	}

	public Timestamp getHasta() {
		return hasta;
	}

	public void setHasta(Timestamp hasta) {
		this.hasta = hasta;
	}
	
}
