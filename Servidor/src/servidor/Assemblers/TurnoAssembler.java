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

import comun.DTOs.TurnoDTO;

import servidor.Persistencia.AccesoBD;
import servidor.Persistencia.Dominio.Turno;

public class TurnoAssembler {
	
	private AccesoBD accesoBD;

	public TurnoAssembler(AccesoBD accesoBD) {
		this.accesoBD = accesoBD;
	}

	public TurnoDTO getTurnoDTO(Turno turno) {
		TurnoDTO turnoDTO = new TurnoDTO();
		turnoDTO.setId(turno.getId());
		turnoDTO.setDesde(turno.getDesde());
		turnoDTO.setHasta(turno.getHasta());
		ChoferAssembler choferAssembler = new ChoferAssembler(accesoBD);
		turnoDTO.setChofer(choferAssembler.getChoferDTO(turno.getChofer()));
		CocheAssembler cocheAssembler = new CocheAssembler(accesoBD);
		turnoDTO.setCoche(cocheAssembler.getCocheDTO(turno.getCoche()));
		return turnoDTO;
	}

	public Turno getTurno(TurnoDTO turnoDTO) {
		Turno turno =	(Turno) accesoBD.buscarPorId(Turno.class, turnoDTO.getId());
		turno.setDesde(turnoDTO.getDesde());
		turno.setHasta(turnoDTO.getHasta());
		ChoferAssembler choferAssembler = new ChoferAssembler(accesoBD);
		turno.setChofer(choferAssembler.getChofer(turnoDTO.getChofer()));
		CocheAssembler cocheAssembler = new CocheAssembler(accesoBD);
		turno.setCoche(cocheAssembler.getCoche(turnoDTO.getCoche()));
		return turno;
	}
	
	public Turno getTurnoNuevo(TurnoDTO turnoDTO) {
		Turno turno =	new Turno();
		turno.setId(turnoDTO.getId());
		turno.setDesde(turnoDTO.getDesde());
		turno.setHasta(turnoDTO.getHasta());
		ChoferAssembler choferAssembler = new ChoferAssembler(accesoBD);
		turno.setChofer(choferAssembler.getChofer(turnoDTO.getChofer()));
		CocheAssembler cocheAssembler = new CocheAssembler(accesoBD);
		turno.setCoche(cocheAssembler.getCoche(turnoDTO.getCoche()));
		return turno;
	}

}