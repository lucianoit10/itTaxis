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

import comun.DTOs.AlertaDTO;

import servidor.Persistencia.AccesoBD;
import servidor.Persistencia.Dominio.Alerta;

public class AlertaAssembler {
	
	private AccesoBD accesoBD;

	public AlertaAssembler(AccesoBD accesoBD) {
		this.accesoBD = accesoBD;
	}

	public AlertaDTO getAlertaDTO(Alerta alerta) {
		AlertaDTO alertaDTO = new AlertaDTO();
		alertaDTO.setId(alerta.getId());
		alertaDTO.setActivacion(alertaDTO.getActivacion());
		alertaDTO.setEstado(alerta.getEstado());
		PedidoAssembler pedidoAssembler = new PedidoAssembler(accesoBD);
		alertaDTO.setPedido(pedidoAssembler.getPedidoDTO(alerta.getPedido()));
		return alertaDTO;
	}

	public Alerta getAlerta(AlertaDTO alertaDTO) {
		Alerta alerta =	(Alerta) accesoBD.buscarPorId(Alerta.class, alertaDTO.getId());
		alerta.setActivacion(alertaDTO.getActivacion());
		alerta.setEstado(alertaDTO.getEstado());
		PedidoAssembler pedidoAssembler = new PedidoAssembler(accesoBD);
		alerta.setPedido(pedidoAssembler.getPedido(alertaDTO.getPedido()));
		return alerta;
	}
	
	public Alerta getAlertaNuevo(AlertaDTO alertaDTO) {
		Alerta alerta =	new Alerta();
		alerta.setId(alertaDTO.getId());
		alerta.setActivacion(alertaDTO.getActivacion());
		alerta.setEstado(alertaDTO.getEstado());
		PedidoAssembler pedidoAssembler = new PedidoAssembler(accesoBD);
		alerta.setPedido(pedidoAssembler.getPedido(alertaDTO.getPedido()));
		return alerta;
	}

}