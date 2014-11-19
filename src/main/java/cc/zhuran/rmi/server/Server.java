package cc.zhuran.rmi.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Server extends Remote{
	public String getOSName() throws RemoteException;
}
