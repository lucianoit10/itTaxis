package comun.DTOs;

public class DestinoDTO {
	private long id;
	private CalleDTO calle;
	private String altura;
	private String observacion;
	
	public DestinoDTO() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public CalleDTO getCalle() {
		return calle;
	}

	public void setCalle(CalleDTO calle) {
		this.calle = calle;
	}

	public String getAltura() {
		return altura;
	}

	public void setAltura(String altura) {
		this.altura = altura;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	
}
