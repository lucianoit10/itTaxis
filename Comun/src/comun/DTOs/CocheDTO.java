package comun.DTOs;

public class CocheDTO {
	private long id;
	private DueñoDTO dueño;
	private String patente;
	private String chapaTaxi;
	private String marcaYModelo; //ver bien si es necesario crear clases para ello
	private boolean activo = true;
	
	public CocheDTO() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public DueñoDTO getDueño() {
		return dueño;
	}

	public void setDueño(DueñoDTO dueño) {
		this.dueño = dueño;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public String getChapaTaxi() {
		return chapaTaxi;
	}

	public void setChapaTaxi(String chapaTaxi) {
		this.chapaTaxi = chapaTaxi;
	}

	public String getMarcaYModelo() {
		return marcaYModelo;
	}

	public void setMarcaYModelo(String marcaYModelo) {
		this.marcaYModelo = marcaYModelo;
	}

	public boolean getActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	
}
