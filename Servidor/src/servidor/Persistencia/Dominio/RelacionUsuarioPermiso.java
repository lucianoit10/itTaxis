package servidor.Persistencia.Dominio;

public class RelacionUsuarioPermiso {
	private long id;
	private Usuario usuario;
	private Permiso permiso;
	
	public RelacionUsuarioPermiso() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Permiso getPermiso() {
		return permiso;
	}

	public void setPermiso(Permiso permiso) {
		this.permiso = permiso;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
}
