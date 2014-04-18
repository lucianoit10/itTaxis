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

import comun.DTOs.DestinoDTO;

import servidor.Persistencia.AccesoBD;
import servidor.Persistencia.Dominio.Destino;

public class DestinoAssembler {
	
	private AccesoBD accesoBD;

	public DestinoAssembler(AccesoBD accesoBD) {
		this.accesoBD = accesoBD;
	}

	public DestinoDTO getDestinoDTO(Destino destino) {
		DestinoDTO destinoDTO = new DestinoDTO();
		destinoDTO.setId(destino.getId());
		destinoDTO.setAltura(destino.getAltura());
		destinoDTO.setObservacion(destino.getObservacion());
		CalleAssembler calleAssembler = new CalleAssembler(accesoBD);
		destinoDTO.setCalle(calleAssembler.getCalleDTO(destino.getCalle()));
		return destinoDTO;
	}

	public Destino getDestino(DestinoDTO destinoDTO) {
		Destino destino =	(Destino) accesoBD.buscarPorId(Destino.class, destinoDTO.getId());
		destino.setAltura(destinoDTO.getAltura());
		destino.setObservacion(destinoDTO.getObservacion());
		CalleAssembler calleAssembler = new CalleAssembler(accesoBD);
		destino.setCalle(calleAssembler.getCalle(destinoDTO.getCalle()));
		return destino;
	}
	
	public Destino getDestinoNuevo(DestinoDTO destinoDTO) {
		Destino destino =	new Destino();
		destino.setId(destinoDTO.getId());
		destino.setAltura(destinoDTO.getAltura());
		destino.setObservacion(destinoDTO.getObservacion());
		CalleAssembler calleAssembler = new CalleAssembler(accesoBD);
		destino.setCalle(calleAssembler.getCalle(destinoDTO.getCalle()));
		return destino;
	}

}