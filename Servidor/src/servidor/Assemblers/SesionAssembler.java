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

import comun.DTOs.SesionDTO;

import servidor.Persistencia.AccesoBD;
import servidor.Persistencia.Dominio.Sesion;

public class SesionAssembler {
	
	private AccesoBD accesoBD;

	public SesionAssembler(AccesoBD accesoBD) {
		this.accesoBD = accesoBD;
	}

	public SesionDTO getSesionDTO(Sesion sesion) {
		SesionDTO sesionDTO = new SesionDTO();
		sesionDTO.setId(sesion.getId());
		sesionDTO.setInicio(sesion.getInicio());
		sesionDTO.setFin(sesion.getFin());
		UsuarioAssembler usuarioAssembler = new UsuarioAssembler(accesoBD);
		sesionDTO.setUsuario(usuarioAssembler.getUsuarioDTO(sesion.getUsuario()));
		return sesionDTO;
	}

	public Sesion getSesion(SesionDTO sesionDTO) {
		Sesion sesion =	(Sesion) accesoBD.buscarPorId(Sesion.class, sesionDTO.getId());
		sesion.setInicio(sesionDTO.getInicio());
		sesion.setFin(sesionDTO.getFin());
		UsuarioAssembler usuarioAssembler = new UsuarioAssembler(accesoBD);
		sesion.setUsuario(usuarioAssembler.getUsuario(sesionDTO.getUsuario()));
		return sesion;
	}
	
	public Sesion getSesionNuevo(SesionDTO sesionDTO) {
		Sesion sesion =	new Sesion();
		sesion.setId(sesionDTO.getId());
		sesion.setInicio(sesionDTO.getInicio());
		sesion.setFin(sesionDTO.getFin());
		UsuarioAssembler usuarioAssembler = new UsuarioAssembler(accesoBD);
		sesion.setUsuario(usuarioAssembler.getUsuario(sesionDTO.getUsuario()));
		return sesion;
	}

}