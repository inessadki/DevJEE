package serveur;

import java.rmi.Remote;
import java.rmi.RemoteException;
public interface icompte extends Remote {
	public void debiter(double d) throws RemoteException;
	public void crediter(double d) throws RemoteException;
	public void lireSolde() throws RemoteException;

}
