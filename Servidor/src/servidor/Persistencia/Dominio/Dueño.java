package servidor.Persistencia.Dominio;

public class Dueño{
	private long id;
	private Cliente cliente;
	
	public Dueño() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
}
