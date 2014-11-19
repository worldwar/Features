package cc.zhuran.rmi.server;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Main {
	private static Registry registry;
	public static void main(String[] args){
		try {
			registry = LocateRegistry.createRegistry(4444);
			registry.rebind("OSServer", new OSServer());
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
}
