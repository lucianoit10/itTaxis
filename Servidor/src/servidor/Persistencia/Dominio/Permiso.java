package servidor.Persistencia.Dominio;

public class Permiso {
	private long id;
	private String nombre;
	
	public Permiso() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
