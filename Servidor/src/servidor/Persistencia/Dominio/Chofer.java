package servidor.Persistencia.Dominio;

public class Chofer extends Cliente{
	private long id;
	private Cliente cliente;
	
	public Chofer() {
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