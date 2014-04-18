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

import comun.DTOs.UsuarioDTO;

import servidor.Persistencia.AccesoBD;
import servidor.Persistencia.Dominio.Usuario;

public class UsuarioAssembler {
	
	private AccesoBD accesoBD;

	public UsuarioAssembler(AccesoBD accesoBD) {
		this.accesoBD = accesoBD;
	}

	public UsuarioDTO getUsuarioDTO(Usuario usuario) {
		UsuarioDTO usuarioDTO = new UsuarioDTO();
		usuarioDTO.setId(usuario.getId());
		usuarioDTO.setNombre(usuario.getNombre());
		usuarioDTO.setApellido(usuario.getApellido());
		usuarioDTO.setTel(usuario.getTel());
		usuarioDTO.setNombreDeUsuario(usuario.getNombreDeUsuario());
		usuarioDTO.setPassword(usuario.getPassword());
		return usuarioDTO;
	}

	public Usuario getUsuario(UsuarioDTO usuarioDTO) {
		Usuario usuario =	(Usuario) accesoBD.buscarPorId(Usuario.class, usuarioDTO.getId());
		usuario.setNombre(usuarioDTO.getNombre());
		usuario.setApellido(usuarioDTO.getApellido());
		usuario.setTel(usuarioDTO.getTel());
		usuario.setNombreDeUsuario(usuarioDTO.getNombreDeUsuario());
		usuario.setPassword(usuarioDTO.getPassword());
		return usuario;
	}
	
	public Usuario getUsuarioNuevo(UsuarioDTO usuarioDTO) {
		Usuario usuario =	new Usuario();
		usuario.setId(usuarioDTO.getId());
		usuario.setNombre(usuarioDTO.getNombre());
		usuario.setApellido(usuarioDTO.getApellido());
		usuario.setTel(usuarioDTO.getTel());
		usuario.setNombreDeUsuario(usuarioDTO.getNombreDeUsuario());
		usuario.setPassword(usuarioDTO.getPassword());
		return usuario;
	}

}