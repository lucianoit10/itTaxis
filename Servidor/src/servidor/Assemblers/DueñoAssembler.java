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

import comun.DTOs.DueñoDTO;

import servidor.Persistencia.AccesoBD;
import servidor.Persistencia.Dominio.Dueño;

public class DueñoAssembler {
	
	private AccesoBD accesoBD;

	public DueñoAssembler(AccesoBD accesoBD) {
		this.accesoBD = accesoBD;
	}

	public DueñoDTO getDueñoDTO(Dueño dueño) {
		DueñoDTO dueñoDTO = new DueñoDTO();
		dueñoDTO.setId(dueño.getId());
		ClienteAssembler clienteAssembler = new ClienteAssembler(accesoBD);
		dueñoDTO.setCliente(clienteAssembler.getClienteDTO(dueño.getCliente()));
		return dueñoDTO;
	}

	public Dueño getDueño(DueñoDTO dueñoDTO) {
		Dueño dueño =	(Dueño) accesoBD.buscarPorId(Dueño.class, dueñoDTO.getId());
		ClienteAssembler clienteAssembler = new ClienteAssembler(accesoBD);
		dueñoDTO.setCliente(clienteAssembler.getClienteDTO(dueño.getCliente()));
		return dueño;
	}
	
	public Dueño getDueñoNuevo(DueñoDTO dueñoDTO) {
		Dueño dueño =	new Dueño();
		dueño.setId(dueñoDTO.getId());
		ClienteAssembler clienteAssembler = new ClienteAssembler(accesoBD);
		dueñoDTO.setCliente(clienteAssembler.getClienteDTO(dueño.getCliente()));
		return dueño;
	}

}