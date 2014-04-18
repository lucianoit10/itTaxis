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
package comun;

public class RootAndIp {

	/* Valores por defecto - verificar el conf.ini */
	private static String ip_servidor="";
	private static String ip_cliente="";
	private static int port= 43210;
	private static String db="";
	private static String username = "";
	private static String password = "";
	private static String path_manual = "";
	
	public static void setConf(String nameFile) {
		if ((nameFile == null)||(nameFile.trim().length() == 0)){
			nameFile = "conf.ini";
		}
		IniFile ini = new IniFile(nameFile);
		ip_servidor = ini.getParameters("ip_servidor");
		ip_cliente= ini.getParameters("ip_cliente");
		db = ini.getParameters("db");
		port = Integer.parseInt(ini.getParameters("port"));
		username = ini.getParameters("username");
		password = ini.getParameters("password");
		path_manual = ini.getParameters("path_manual");
	}

	public static String getIp_servidor() {
		return ip_servidor;
	}

	public static void setIp_servidor(String ip_servidor) {
		RootAndIp.ip_servidor = ip_servidor;
	}

	public static String getUsername() {
		return username;
	}

	public static void setUsername(String username) {
		RootAndIp.username = username;
	}

	public static String getPassword() {
		return password;
	}

	public static void setPassword(String password) {
		RootAndIp.password = password;
	}

	public static String getDb() {
		return db;
	}

	public static void setDb(String db) {
		RootAndIp.db = db;
	}

	public static String getIp_cliente() {
		return ip_cliente;
	}

	public static void setIp_cliente(String ip_cliente) {
		RootAndIp.ip_cliente = ip_cliente;
	}

	public static int getPort() {
		return port;
	}

	public static void setPort(int port) {
		RootAndIp.port = port;
	}

	public static String getPath_manual() {
		return path_manual;
	}

	public static void setPath_manual(String path_manual) {
		RootAndIp.path_manual = path_manual;
	}
	
}

