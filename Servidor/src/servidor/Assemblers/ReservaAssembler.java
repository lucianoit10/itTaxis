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

import comun.DTOs.ReservaDTO;

import servidor.Persistencia.AccesoBD;
import servidor.Persistencia.Dominio.Reserva;

public class ReservaAssembler {
	
	private AccesoBD accesoBD;

	public ReservaAssembler(AccesoBD accesoBD) {
		this.accesoBD = accesoBD;
	}

	public ReservaDTO getReservaDTO(Reserva reserva) {
		ReservaDTO reservaDTO = new ReservaDTO();
		reservaDTO.setId(reserva.getId());
		reservaDTO.setInicio(reserva.getInicio());
		reservaDTO.setFin(reserva.getFin());
		reservaDTO.setHora(reserva.getHora());
		reservaDTO.setLunes(reserva.isLunes());
		reservaDTO.setMartes(reserva.isMartes());
		reservaDTO.setMiercoles(reserva.isMiercoles());
		reservaDTO.setJueves(reserva.isJueves());
		reservaDTO.setViernes(reserva.isViernes());
		reservaDTO.setSabado(reserva.isSabado());
		reservaDTO.setDomingo(reserva.isDomingo());
		reservaDTO.setFechaDeReserva(reserva.getFechaDeReserva());
		reservaDTO.setConcretada(reserva.getConcretada());
		ClienteAssembler clienteAssembler = new ClienteAssembler(accesoBD);
		reservaDTO.setCliente(clienteAssembler.getClienteDTO(reserva.getCliente()));
		return reservaDTO;
	}

	public Reserva getReserva(ReservaDTO reservaDTO) {
		Reserva reserva =	(Reserva) accesoBD.buscarPorId(Reserva.class, reservaDTO.getId());
		reserva.setInicio(reservaDTO.getInicio());
		reserva.setFin(reservaDTO.getFin());
		reserva.setHora(reservaDTO.getHora());
		reserva.setLunes(reservaDTO.isLunes());
		reserva.setMartes(reservaDTO.isMartes());
		reserva.setMiercoles(reservaDTO.isMiercoles());
		reserva.setJueves(reservaDTO.isJueves());
		reserva.setViernes(reservaDTO.isViernes());
		reserva.setSabado(reservaDTO.isSabado());
		reserva.setDomingo(reservaDTO.isDomingo());
		reserva.setFechaDeReserva(reservaDTO.getFechaDeReserva());
		reserva.setConcretada(reservaDTO.getConcretada());
		ClienteAssembler clienteAssembler = new ClienteAssembler(accesoBD);
		reserva.setCliente(clienteAssembler.getCliente(reservaDTO.getCliente()));
		return reserva;
	}
	
	public Reserva getReservaNuevo(ReservaDTO reservaDTO) {
		Reserva reserva =	new Reserva();
		reserva.setId(reservaDTO.getId());
		reserva.setInicio(reservaDTO.getInicio());
		reserva.setFin(reservaDTO.getFin());
		reserva.setHora(reservaDTO.getHora());
		reserva.setLunes(reservaDTO.isLunes());
		reserva.setMartes(reservaDTO.isMartes());
		reserva.setMiercoles(reservaDTO.isMiercoles());
		reserva.setJueves(reservaDTO.isJueves());
		reserva.setViernes(reservaDTO.isViernes());
		reserva.setSabado(reservaDTO.isSabado());
		reserva.setDomingo(reservaDTO.isDomingo());
		reserva.setFechaDeReserva(reservaDTO.getFechaDeReserva());
		reserva.setConcretada(reservaDTO.getConcretada());
		ClienteAssembler clienteAssembler = new ClienteAssembler(accesoBD);
		reserva.setCliente(clienteAssembler.getCliente(reservaDTO.getCliente()));
		return reserva;
	}

}