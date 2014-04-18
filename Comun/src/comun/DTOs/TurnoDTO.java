package comun.DTOs;

import java.sql.Timestamp;

public class TurnoDTO {
	private long id;
	private ChoferDTO chofer;
	private CocheDTO coche;
	private Timestamp desde; 
	private Timestamp hasta;
	
	public TurnoDTO() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public ChoferDTO getChofer() {
		return chofer;
	}

	public void setChofer(ChoferDTO chofer) {
		this.chofer = chofer;
	}

	public CocheDTO getCoche() {
		return coche;
	}

	public void setCoche(CocheDTO coche) {
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
