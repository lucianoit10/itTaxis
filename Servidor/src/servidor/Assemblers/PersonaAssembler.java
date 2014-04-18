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

import comun.DTOs.PersonaDTO;

import servidor.Persistencia.AccesoBD;
import servidor.Persistencia.Dominio.Persona;

public class PersonaAssembler {
	
	private AccesoBD accesoBD;

	public PersonaAssembler(AccesoBD accesoBD) {
		this.accesoBD = accesoBD;
	}

	public PersonaDTO getPersonaDTO(Persona persona) {
		PersonaDTO personaDTO = new PersonaDTO();
		personaDTO.setId(persona.getId());
		personaDTO.setNombre(persona.getNombre());
		personaDTO.setApellido(persona.getApellido());
		personaDTO.setTel(persona.getTel());
		return personaDTO;
	}

	public Persona getPersona(PersonaDTO personaDTO) {
		Persona persona =	(Persona) accesoBD.buscarPorId(Persona.class, personaDTO.getId());
		persona.setNombre(personaDTO.getNombre());
		persona.setApellido(personaDTO.getApellido());
		persona.setTel(personaDTO.getTel());
		return persona;
	}
	
	public Persona getPersonaNuevo(PersonaDTO personaDTO) {
		Persona persona =	new Persona();
		persona.setId(personaDTO.getId());
		persona.setNombre(personaDTO.getNombre());
		persona.setApellido(personaDTO.getApellido());
		persona.setTel(personaDTO.getTel());
		return persona;
	}

}