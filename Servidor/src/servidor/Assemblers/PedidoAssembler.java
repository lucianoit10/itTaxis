/********************************************************
  This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *********************************************************/
package servidor.Assemblers;

import comun.DTOs.PedidoDTO;

import servidor.Persistencia.AccesoBD;
import servidor.Persistencia.Dominio.Pedido;

public class PedidoAssembler {
	
	private AccesoBD accesoBD;

	public PedidoAssembler(AccesoBD accesoBD) {
		this.accesoBD = accesoBD;
	}

	public PedidoDTO getPedidoDTO(Pedido pedido) {
		PedidoDTO pedidoDTO = new PedidoDTO();
		pedidoDTO.setId(pedido.getId());
		pedidoDTO.setMomentoPedido(pedido.getMomentoPedido());
		pedidoDTO.setFechaAReservar(pedido.getFechaAReservar());
		pedidoDTO.setObservacion(pedido.getObservacion());
		pedidoDTO.setEstado(pedido.getEstado());
		ReservaAssembler reservaAssembler = new ReservaAssembler(accesoBD);
		pedidoDTO.setReserva(reservaAssembler.getReservaDTO(pedido.getReserva()));
		ClienteAssembler clienteAssembler = new ClienteAssembler(accesoBD);
		pedidoDTO.setCliente(clienteAssembler.getClienteDTO(pedido.getCliente()));
		UsuarioAssembler usuarioAssembler = new UsuarioAssembler(accesoBD);
		pedidoDTO.setReceptor(usuarioAssembler.getUsuarioDTO(pedido.getReceptor()));
		DestinoAssembler destinoAssembler = new DestinoAssembler(accesoBD);
		pedidoDTO.setDestino(destinoAssembler.getDestinoDTO(pedido.getDestino()));
		return pedidoDTO;
	}

	public Pedido getPedido(PedidoDTO pedidoDTO) {
		Pedido pedido =	(Pedido) accesoBD.buscarPorId(Pedido.class, pedidoDTO.getId());
		pedido.setMomentoPedido(pedidoDTO.getMomentoPedido());
		pedido.setFechaAReservar(pedidoDTO.getFechaAReservar());
		pedido.setObservacion(pedidoDTO.getObservacion());
		pedido.setEstado(pedidoDTO.getEstado());
		ReservaAssembler reservaAssembler = new ReservaAssembler(accesoBD);
		pedido.setReserva(reservaAssembler.getReserva(pedidoDTO.getReserva()));
		ClienteAssembler clienteAssembler = new ClienteAssembler(accesoBD);
		pedido.setCliente(clienteAssembler.getCliente(pedidoDTO.getCliente()));
		UsuarioAssembler usuarioAssembler = new UsuarioAssembler(accesoBD);
		pedido.setReceptor(usuarioAssembler.getUsuario(pedidoDTO.getReceptor()));
		DestinoAssembler destinoAssembler = new DestinoAssembler(accesoBD);
		pedido.setDestino(destinoAssembler.getDestino(pedidoDTO.getDestino()));
		return pedido;
	}
	
	public Pedido getPedidoNuevo(PedidoDTO pedidoDTO) {
		Pedido pedido =	new Pedido();
		pedido.setId(pedidoDTO.getId());
		pedido.setMomentoPedido(pedidoDTO.getMomentoPedido());
		pedido.setFechaAReservar(pedidoDTO.getFechaAReservar());
		pedido.setObservacion(pedidoDTO.getObservacion());
		pedido.setEstado(pedidoDTO.getEstado());
		ReservaAssembler reservaAssembler = new ReservaAssembler(accesoBD);
		pedido.setReserva(reservaAssembler.getReserva(pedidoDTO.getReserva()));
		ClienteAssembler clienteAssembler = new ClienteAssembler(accesoBD);
		pedido.setCliente(clienteAssembler.getCliente(pedidoDTO.getCliente()));
		UsuarioAssembler usuarioAssembler = new UsuarioAssembler(accesoBD);
		pedido.setReceptor(usuarioAssembler.getUsuario(pedidoDTO.getReceptor()));
		DestinoAssembler destinoAssembler = new DestinoAssembler(accesoBD);
		pedido.setDestino(destinoAssembler.getDestino(pedidoDTO.getDestino()));
		return pedido;
	}

}