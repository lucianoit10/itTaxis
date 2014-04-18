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
package servidor;

import java.net.InetAddress;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import servidor.Test.Test;

import comun.RootAndIp;
import comun.Utils;

public class Servidor {

	private Test controlTest = null;
	private String name = "";
	private String ip = "";

	public Servidor() {
	}
	
	public void iniciar() throws Exception {
		comun.RootAndIp.setConf("");
		int port = RootAndIp.getPort();
		
		Registry Naming = LocateRegistry.createRegistry(port);
		Utils.setCodeBase(Servidor.class);
		
		System.out.println("Iniciando servidor !!!");

		comun.RootAndIp.setConf("");
        ip = RootAndIp.getIp_servidor();
        System.out.println("ip localhost"+InetAddress.getLocalHost().toString());
		System.out.println("Ip: " + this.ip);

		this.name = "rmi://" + this.ip + "/IControlTest";
		Naming.rebind(this.name, this.controlTest);
		System.out.println("Nombre: " + this.name);
		
		// Cargar el resto de los controles
		System.out.println("Listo para conexiones");
		int exit = 0;
		synchronized (this) {
			if(exit!=1)
				this.wait();
		}
		//GUIServidor serv = new GUIServidor();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}


	public Test getControlTest() {
		return controlTest;
	}

	public void setControlTest(Test controlTest) {
		this.controlTest = controlTest;
	}

}
