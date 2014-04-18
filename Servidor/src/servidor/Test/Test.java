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
package servidor.Test;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Vector;

import comun.DTOs.ObjetoDTO;
import comun.Test.ITest;

public class Test extends UnicastRemoteObject implements ITest {

	private static final long serialVersionUID = 1L;

	public Test() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Long agregarObjeto(ObjetoDTO objeto) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminarObjeto(Long id) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modificarObjeto(Long id, ObjetoDTO modificado) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Vector<ObjetoDTO> obtenerObjetos() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existeObjeto(Long id) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean existeObjeto(String nombre_objeto) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ObjetoDTO buscarObjeto(Long id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ObjetoDTO buscarObjeto(String nombre_objeto) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
