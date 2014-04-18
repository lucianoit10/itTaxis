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
package servidor.Persistencia;

public class Singleton {

	/**
	 * Constructor de la clase.
	 */
	private Singleton() {
	}

	/**
	 * Obtiene una instancia unica de la base de datos.
	 */
	public static Singleton getInstance() {
		return NewSingletonHolder.INSTANCE;
	}

	/**
	 * Crea una nueva instancia de la clase Singleton.
	 */
	private static class NewSingletonHolder {
		private static final Singleton INSTANCE = new Singleton();
	}
}
