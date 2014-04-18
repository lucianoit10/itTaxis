package servidor.Persistencia.Dominio;

public class Coche {
	private long id;
	private Dueño dueño;
	private String patente;
	private String chapaTaxi;
	private String marcaYModelo; //ver bien si es necesario crear clases para ello
	private boolean activo = true;
	
	public Coche() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Dueño getDueño() {
		return dueño;
	}

	public void setDueño(Dueño dueño) {
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
