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

import comun.DTOs.RelacionUsuarioPermisoDTO;

import servidor.Persistencia.AccesoBD;
import servidor.Persistencia.Dominio.RelacionUsuarioPermiso;

public class RelacionUsuarioPermisoAssembler {
	
	private AccesoBD accesoBD;

	public RelacionUsuarioPermisoAssembler(AccesoBD accesoBD) {
		this.accesoBD = accesoBD;
	}

	public RelacionUsuarioPermisoDTO getRelacionUsuarioPermisoDTO(RelacionUsuarioPermiso relacionUsuarioPermiso) {
		RelacionUsuarioPermisoDTO relacionUsuarioPermisoDTO = new RelacionUsuarioPermisoDTO();
		relacionUsuarioPermisoDTO.setId(relacionUsuarioPermiso.getId());
		UsuarioAssembler usuarioAssembler = new UsuarioAssembler(accesoBD);
		relacionUsuarioPermisoDTO.setUsuario(usuarioAssembler.getUsuarioDTO(relacionUsuarioPermiso.getUsuario()));
		PermisoAssembler permisoAssembler = new PermisoAssembler(accesoBD);
		relacionUsuarioPermisoDTO.setPermiso(permisoAssembler.getPermisoDTO(relacionUsuarioPermiso.getPermiso()));
		return relacionUsuarioPermisoDTO;
	}

	public RelacionUsuarioPermiso getRelacionUsuarioPermiso(RelacionUsuarioPermisoDTO relacionUsuarioPermisoDTO) {
		RelacionUsuarioPermiso relacionUsuarioPermiso =	(RelacionUsuarioPermiso) accesoBD.buscarPorId(RelacionUsuarioPermiso.class, relacionUsuarioPermisoDTO.getId());
		UsuarioAssembler usuarioAssembler = new UsuarioAssembler(accesoBD);
		relacionUsuarioPermiso.setUsuario(usuarioAssembler.getUsuario(relacionUsuarioPermisoDTO.getUsuario()));
		PermisoAssembler permisoAssembler = new PermisoAssembler(accesoBD);
		relacionUsuarioPermiso.setPermiso(permisoAssembler.getPermiso(relacionUsuarioPermisoDTO.getPermiso()));
		return relacionUsuarioPermiso;
	}
	
	public RelacionUsuarioPermiso getRelacionUsuarioPermisoNuevo(RelacionUsuarioPermisoDTO relacionUsuarioPermisoDTO) {
		RelacionUsuarioPermiso relacionUsuarioPermiso =	new RelacionUsuarioPermiso();
		relacionUsuarioPermiso.setId(relacionUsuarioPermisoDTO.getId());
		UsuarioAssembler usuarioAssembler = new UsuarioAssembler(accesoBD);
		relacionUsuarioPermiso.setUsuario(usuarioAssembler.getUsuario(relacionUsuarioPermisoDTO.getUsuario()));
		PermisoAssembler permisoAssembler = new PermisoAssembler(accesoBD);
		relacionUsuarioPermiso.setPermiso(permisoAssembler.getPermiso(relacionUsuarioPermisoDTO.getPermiso()));
		return relacionUsuarioPermiso;
	}

}