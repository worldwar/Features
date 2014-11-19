package cc.zhuran.rmi.client;

import cc.zhuran.rmi.server.OSServer;
import cc.zhuran.rmi.server.Server;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Main {
	public static void main(String[] args){
		try {
			Registry registry = LocateRegistry.getRegistry("127.0.0.1", 4444);
			Server server = (Server) registry.lookup("OSServer");
//			Server server = (Server) Naming.lookup("//127.0.0.1/OSServer");
			System.out.println(server.getOSName());
		} catch (NotBoundException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
}
