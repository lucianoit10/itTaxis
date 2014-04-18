package comun.DTOs;

public class RelacionUsuarioPermisoDTO {
	private long id;
	private UsuarioDTO usuario;
	private PermisoDTO permiso;
	
	public RelacionUsuarioPermisoDTO() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public PermisoDTO getPermiso() {
		return permiso;
	}

	public void setPermiso(PermisoDTO permiso) {
		this.permiso = permiso;
	}

	public UsuarioDTO getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioDTO usuario) {
		this.usuario = usuario;
	}
	
}
