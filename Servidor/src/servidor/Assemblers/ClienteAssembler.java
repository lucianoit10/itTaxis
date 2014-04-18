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

import comun.DTOs.ClienteDTO;

import servidor.Persistencia.AccesoBD;
import servidor.Persistencia.Dominio.Cliente;

public class ClienteAssembler {
	
	private AccesoBD accesoBD;

	public ClienteAssembler(AccesoBD accesoBD) {
		this.accesoBD = accesoBD;
	}

	public ClienteDTO getClienteDTO(Cliente ciente) {
		ClienteDTO cienteDTO = new ClienteDTO();
		cienteDTO.setId(ciente.getId());
		cienteDTO.setNombre(ciente.getNombre());
		cienteDTO.setApellido(ciente.getApellido());
		cienteDTO.setTel(ciente.getTel());
		return cienteDTO;
	}

	public Cliente getCliente(ClienteDTO cienteDTO) {
		Cliente ciente =	(Cliente) accesoBD.buscarPorId(Cliente.class, cienteDTO.getId());
		ciente.setNombre(cienteDTO.getNombre());
		ciente.setApellido(cienteDTO.getApellido());
		ciente.setTel(cienteDTO.getTel());
		return ciente;
	}
	
	public Cliente getClienteNuevo(ClienteDTO cienteDTO) {
		Cliente ciente =	new Cliente();
		ciente.setId(cienteDTO.getId());
		ciente.setNombre(cienteDTO.getNombre());
		ciente.setApellido(cienteDTO.getApellido());
		ciente.setTel(cienteDTO.getTel());
		return ciente;
	}

}