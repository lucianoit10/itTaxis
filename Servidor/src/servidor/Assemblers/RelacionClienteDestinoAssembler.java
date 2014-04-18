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

import comun.DTOs.RelacionClienteDestinoDTO;

import servidor.Persistencia.AccesoBD;
import servidor.Persistencia.Dominio.RelacionClienteDestino;

public class RelacionClienteDestinoAssembler {
	
	private AccesoBD accesoBD;

	public RelacionClienteDestinoAssembler(AccesoBD accesoBD) {
		this.accesoBD = accesoBD;
	}

	public RelacionClienteDestinoDTO getRelacionClienteDestinoDTO(RelacionClienteDestino relacionClienteDestino) {
		RelacionClienteDestinoDTO relacionClienteDestinoDTO = new RelacionClienteDestinoDTO();
		relacionClienteDestinoDTO.setId(relacionClienteDestino.getId());
		relacionClienteDestinoDTO.setCantidad(relacionClienteDestino.getCantidad());
		ClienteAssembler clienteAssembler = new ClienteAssembler(accesoBD);
		relacionClienteDestinoDTO.setCliente(clienteAssembler.getClienteDTO(relacionClienteDestino.getCliente()));
		DestinoAssembler destinoAssembler = new DestinoAssembler(accesoBD);
		relacionClienteDestinoDTO.setDestino(destinoAssembler.getDestinoDTO(relacionClienteDestino.getDestino()));
		return relacionClienteDestinoDTO;
	}

	public RelacionClienteDestino getRelacionClienteDestino(RelacionClienteDestinoDTO relacionClienteDestinoDTO) {
		RelacionClienteDestino relacionClienteDestino =	(RelacionClienteDestino) accesoBD.buscarPorId(RelacionClienteDestino.class, relacionClienteDestinoDTO.getId());
		relacionClienteDestino.setCantidad(relacionClienteDestinoDTO.getCantidad());
		ClienteAssembler clienteAssembler = new ClienteAssembler(accesoBD);
		relacionClienteDestino.setCliente(clienteAssembler.getCliente(relacionClienteDestinoDTO.getCliente()));
		DestinoAssembler destinoAssembler = new DestinoAssembler(accesoBD);
		relacionClienteDestino.setDestino(destinoAssembler.getDestino(relacionClienteDestinoDTO.getDestino()));
		return relacionClienteDestino;
	}
	
	public RelacionClienteDestino getRelacionClienteDestinoNuevo(RelacionClienteDestinoDTO relacionClienteDestinoDTO) {
		RelacionClienteDestino relacionClienteDestino =	new RelacionClienteDestino();
		relacionClienteDestino.setId(relacionClienteDestinoDTO.getId());
		relacionClienteDestino.setCantidad(relacionClienteDestinoDTO.getCantidad());
		ClienteAssembler clienteAssembler = new ClienteAssembler(accesoBD);
		relacionClienteDestino.setCliente(clienteAssembler.getCliente(relacionClienteDestinoDTO.getCliente()));
		DestinoAssembler destinoAssembler = new DestinoAssembler(accesoBD);
		relacionClienteDestino.setDestino(destinoAssembler.getDestino(relacionClienteDestinoDTO.getDestino()));
		return relacionClienteDestino;
	}

}