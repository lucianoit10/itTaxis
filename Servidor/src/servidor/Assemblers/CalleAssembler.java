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

import comun.DTOs.CalleDTO;

import servidor.Persistencia.AccesoBD;
import servidor.Persistencia.Dominio.Calle;

public class CalleAssembler {
	
	private AccesoBD accesoBD;

	public CalleAssembler(AccesoBD accesoBD) {
		this.accesoBD = accesoBD;
	}

	public CalleDTO getCalleDTO(Calle calle) {
		CalleDTO calleDTO = new CalleDTO();
		calleDTO.setId(calle.getId());
		calleDTO.setNombre(calle.getNombre());
		LocalidadAssembler localidadAssembler = new LocalidadAssembler(accesoBD);
		calleDTO.setLocalidad(localidadAssembler.getLocalidadDTO(calle.getLocalidad()));
		return calleDTO;
	}

	public Calle getCalle(CalleDTO calleDTO) {
		Calle calle =	(Calle) accesoBD.buscarPorId(Calle.class, calleDTO.getId());
		calle.setNombre(calleDTO.getNombre());
		LocalidadAssembler localidadAssembler = new LocalidadAssembler(accesoBD);
		calle.setLocalidad(localidadAssembler.getLocalidad(calleDTO.getLocalidad()));
		return calle;
	}
	
	public Calle getCalleNuevo(CalleDTO calleDTO) {
		Calle calle =	new Calle();
		calle.setId(calleDTO.getId());
		calle.setNombre(calleDTO.getNombre());
		LocalidadAssembler localidadAssembler = new LocalidadAssembler(accesoBD);
		calle.setLocalidad(localidadAssembler.getLocalidad(calleDTO.getLocalidad()));
		return calle;
	}

}