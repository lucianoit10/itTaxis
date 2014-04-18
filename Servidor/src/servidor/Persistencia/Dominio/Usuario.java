package servidor.Persistencia.Dominio;

public class Usuario extends Cliente{
	private String nombreDeUsuario;
	private String password;
	
	public Usuario() {
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
