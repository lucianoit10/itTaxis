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

import comun.DTOs.LocalidadDTO;

import servidor.Persistencia.AccesoBD;
import servidor.Persistencia.Dominio.Localidad;

public class LocalidadAssembler {
	
	private AccesoBD accesoBD;

	public LocalidadAssembler(AccesoBD accesoBD) {
		this.accesoBD = accesoBD;
	}

	public LocalidadDTO getLocalidadDTO(Localidad localidad) {
		LocalidadDTO localidadDTO = new LocalidadDTO();
		localidadDTO.setId(localidad.getId());
		localidadDTO.setNombre(localidad.getNombre());
		return localidadDTO;
	}

	public Localidad getLocalidad(LocalidadDTO localidadDTO) {
		Localidad localidad =	(Localidad) accesoBD.buscarPorId(Localidad.class, localidadDTO.getId());
		localidad.setNombre(localidadDTO.getNombre());
		return localidad;
	}
	
	public Localidad getLocalidadNuevo(LocalidadDTO localidadDTO) {
		Localidad localidad =	new Localidad();
		localidad.setId(localidadDTO.getId());
		localidad.setNombre(localidadDTO.getNombre());
		return localidad;
	}

}