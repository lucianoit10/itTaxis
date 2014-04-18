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

import comun.DTOs.ChoferDTO;

import servidor.Persistencia.AccesoBD;
import servidor.Persistencia.Dominio.Chofer;

public class ChoferAssembler {
	
	private AccesoBD accesoBD;

	public ChoferAssembler(AccesoBD accesoBD) {
		this.accesoBD = accesoBD;
	}

	public ChoferDTO getChoferDTO(Chofer chofer) {
		ChoferDTO choferDTO = new ChoferDTO();
		choferDTO.setId(chofer.getId());
		ClienteAssembler clienteAssembler = new ClienteAssembler(accesoBD);
		choferDTO.setCliente(clienteAssembler.getClienteDTO(chofer.getCliente()));
		return choferDTO;
	}

	public Chofer getChofer(ChoferDTO choferDTO) {
		Chofer chofer =	(Chofer) accesoBD.buscarPorId(Chofer.class, choferDTO.getId());
		ClienteAssembler clienteAssembler = new ClienteAssembler(accesoBD);
		chofer.setCliente(clienteAssembler.getCliente(choferDTO.getCliente()));
		return chofer;
	}
	
	public Chofer getChoferNuevo(ChoferDTO choferDTO) {
		Chofer chofer =	new Chofer();
		chofer.setId(choferDTO.getId());
		ClienteAssembler clienteAssembler = new ClienteAssembler(accesoBD);
		chofer.setCliente(clienteAssembler.getCliente(choferDTO.getCliente()));
		return chofer;
	}

}