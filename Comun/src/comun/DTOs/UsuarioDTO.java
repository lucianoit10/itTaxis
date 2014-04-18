package comun.DTOs;

public class UsuarioDTO extends ClienteDTO{
	private String nombreDeUsuario;
	private String password;
	
	public UsuarioDTO() {
		super();
	}
	
	public String getNombreDeUsuario() {
		return nombreDeUsuario;
	}
	
	public void setNombreDeUsuario(String nombreDeUsuario) {
		this.nombreDeUsuario = nombreDeUsuario;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
}
