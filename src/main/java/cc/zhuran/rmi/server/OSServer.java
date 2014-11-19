package cc.zhuran.rmi.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class OSServer extends UnicastRemoteObject implements Server {
	public OSServer() throws RemoteException {

	}

	@Override
	public String getOSName() throws RemoteException{
		return System.getProperty("os.name");
	}
}