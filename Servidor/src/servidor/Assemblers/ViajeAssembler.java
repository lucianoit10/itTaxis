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

import comun.DTOs.ViajeDTO;

import servidor.Persistencia.AccesoBD;
import servidor.Persistencia.Dominio.Viaje;

public class ViajeAssembler {
	
	private AccesoBD accesoBD;

	public ViajeAssembler(AccesoBD accesoBD) {
		this.accesoBD = accesoBD;
	}

	public ViajeDTO getViajeDTO(Viaje viaje) {
		ViajeDTO viajeDTO = new ViajeDTO();
		viajeDTO.setId(viaje.getId());
		viajeDTO.setMomentoAsignacion(viaje.getMomentoAsignacion());
		viajeDTO.setZonaDestino(viaje.getZonaDestino());
		viajeDTO.setRecaudacion(viaje.getRecaudacion());
		viajeDTO.setMomentoConcretacion(viaje.getMomentoConcretacion());
		PedidoAssembler pedidoAssembler = new PedidoAssembler(accesoBD);
		viajeDTO.setPedido(pedidoAssembler.getPedidoDTO(viaje.getPedido()));
		UsuarioAssembler usuarioAssembler = new UsuarioAssembler(accesoBD);
		viajeDTO.setAsignador(usuarioAssembler.getUsuarioDTO(viaje.getAsignador()));
		TurnoAssembler asignadoAssembler = new TurnoAssembler(accesoBD);
		viajeDTO.setAsignado(asignadoAssembler.getTurnoDTO(viaje.getAsignado()));
		return viajeDTO;
	}

	public Viaje getViaje(ViajeDTO viajeDTO) {
		Viaje viaje =	(Viaje) accesoBD.buscarPorId(Viaje.class, viajeDTO.getId());
		viaje.setMomentoAsignacion(viajeDTO.getMomentoAsignacion());
		viaje.setZonaDestino(viajeDTO.getZonaDestino());
		viaje.setRecaudacion(viajeDTO.getRecaudacion());
		viaje.setMomentoConcretacion(viajeDTO.getMomentoConcretacion());
		PedidoAssembler pedidoAssembler = new PedidoAssembler(accesoBD);
		viaje.setPedido(pedidoAssembler.getPedido(viajeDTO.getPedido()));
		UsuarioAssembler usuarioAssembler = new UsuarioAssembler(accesoBD);
		viaje.setAsignador(usuarioAssembler.getUsuario(viajeDTO.getAsignador()));
		TurnoAssembler asignadoAssembler = new TurnoAssembler(accesoBD);
		viaje.setAsignado(asignadoAssembler.getTurno(viajeDTO.getAsignado()));
		return viaje;
	}
	
	public Viaje getViajeNuevo(ViajeDTO viajeDTO) {
		Viaje viaje =	new Viaje();
		viaje.setId(viajeDTO.getId());
		viaje.setMomentoAsignacion(viajeDTO.getMomentoAsignacion());
		viaje.setZonaDestino(viajeDTO.getZonaDestino());
		viaje.setRecaudacion(viajeDTO.getRecaudacion());
		viaje.setMomentoConcretacion(viajeDTO.getMomentoConcretacion());
		PedidoAssembler pedidoAssembler = new PedidoAssembler(accesoBD);
		viaje.setPedido(pedidoAssembler.getPedido(viajeDTO.getPedido()));
		UsuarioAssembler usuarioAssembler = new UsuarioAssembler(accesoBD);
		viaje.setAsignador(usuarioAssembler.getUsuario(viajeDTO.getAsignador()));
		TurnoAssembler asignadoAssembler = new TurnoAssembler(accesoBD);
		viaje.setAsignado(asignadoAssembler.getTurno(viajeDTO.getAsignado()));
		return viaje;
	}

}