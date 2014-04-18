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
package comun.Test;

import java.rmi.Remote;
import java.util.Vector;

import comun.DTOs.ObjetoDTO;

public interface ITest extends Remote{
	
	public Long agregarObjeto(ObjetoDTO objeto)throws Exception;
	public void eliminarObjeto(Long id)throws Exception;
	public void modificarObjeto(Long id,ObjetoDTO modificado)throws Exception;
	
	public Vector<ObjetoDTO> obtenerObjetos()throws Exception;
	
	public boolean existeObjeto(Long id) throws Exception;
	public boolean existeObjeto(String nombre_objeto) throws Exception;
	
	public ObjetoDTO buscarObjeto(Long id) throws Exception;
	public ObjetoDTO buscarObjeto(String nombre_objeto) throws Exception;

}
