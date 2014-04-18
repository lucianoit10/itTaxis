package comun.DTOs;

public class DueñoDTO extends ClienteDTO{
	private long id;
	private ClienteDTO cliente;
	
	public DueñoDTO() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public ClienteDTO getCliente() {
		return cliente;
	}

	public void setCliente(ClienteDTO cliente) {
		this.cliente = cliente;
	}
}
