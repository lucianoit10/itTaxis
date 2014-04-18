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

import comun.DTOs.PermisoDTO;

import servidor.Persistencia.AccesoBD;
import servidor.Persistencia.Dominio.Permiso;

public class PermisoAssembler {
	
	private AccesoBD accesoBD;

	public PermisoAssembler(AccesoBD accesoBD) {
		this.accesoBD = accesoBD;
	}

	public PermisoDTO getPermisoDTO(Permiso permiso) {
		PermisoDTO permisoDTO = new PermisoDTO();
		permisoDTO.setId(permiso.getId());
		permisoDTO.setNombre(permiso.getNombre());
		return permisoDTO;
	}

	public Permiso getPermiso(PermisoDTO permisoDTO) {
		Permiso permiso =	(Permiso) accesoBD.buscarPorId(Permiso.class, permisoDTO.getId());
		permiso.setNombre(permisoDTO.getNombre());
		return permiso;
	}
	
	public Permiso getPermisoNuevo(PermisoDTO permisoDTO) {
		Permiso permiso =	new Permiso();
		permiso.setId(permisoDTO.getId());
		permiso.setNombre(permisoDTO.getNombre());
		return permiso;
	}

}