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

import comun.DTOs.CocheDTO;

import servidor.Persistencia.AccesoBD;
import servidor.Persistencia.Dominio.Coche;

public class CocheAssembler {
	
	private AccesoBD accesoBD;

	public CocheAssembler(AccesoBD accesoBD) {
		this.accesoBD = accesoBD;
	}

	public CocheDTO getCocheDTO(Coche coche) {
		CocheDTO cocheDTO = new CocheDTO();
		cocheDTO.setId(coche.getId());
		cocheDTO.setActivo(coche.getActivo());
		cocheDTO.setPatente(coche.getPatente());
		cocheDTO.setChapaTaxi(coche.getChapaTaxi());
		cocheDTO.setMarcaYModelo(coche.getMarcaYModelo());
		DueñoAssembler dueñoAssembler = new DueñoAssembler(accesoBD);
		cocheDTO.setDueño(dueñoAssembler.getDueñoDTO(coche.getDueño()));
		return cocheDTO;
	}

	public Coche getCoche(CocheDTO cocheDTO) {
		Coche coche =	(Coche) accesoBD.buscarPorId(Coche.class, cocheDTO.getId());
		coche.setActivo(cocheDTO.getActivo());
		coche.setPatente(cocheDTO.getPatente());
		coche.setChapaTaxi(cocheDTO.getChapaTaxi());
		coche.setMarcaYModelo(cocheDTO.getMarcaYModelo());
		DueñoAssembler dueñoAssembler = new DueñoAssembler(accesoBD);
		coche.setDueño(dueñoAssembler.getDueño(cocheDTO.getDueño()));
		return coche;
	}
	
	public Coche getCocheNuevo(CocheDTO cocheDTO) {
		Coche coche =	new Coche();
		coche.setId(cocheDTO.getId());
		coche.setActivo(cocheDTO.getActivo());
		coche.setPatente(cocheDTO.getPatente());
		coche.setChapaTaxi(cocheDTO.getChapaTaxi());
		coche.setMarcaYModelo(cocheDTO.getMarcaYModelo());
		DueñoAssembler dueñoAssembler = new DueñoAssembler(accesoBD);
		coche.setDueño(dueñoAssembler.getDueño(cocheDTO.getDueño()));
		return coche;
	}

}