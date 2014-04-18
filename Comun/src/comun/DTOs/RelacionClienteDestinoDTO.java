package comun.DTOs;

public class RelacionClienteDestinoDTO {
	private long id;
	private ClienteDTO cliente;
	private DestinoDTO destino;
	private int cantidad =0;
	
	public RelacionClienteDestinoDTO() {
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

	public DestinoDTO getDestino() {
		return destino;
	}

	public void setDestino(DestinoDTO destino) {
		this.destino = destino;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
}
