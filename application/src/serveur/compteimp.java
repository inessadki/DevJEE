package serveur;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class compteimp extends UnicastRemoteObject implements icompte{
	double solde;
	public compteimp() throws RemoteException {
		super();
			
	}
	public void debiter(double d) throws RemoteException{
		
		System.out.println(solde-d);
	}
	public void crediter(double d) throws RemoteException{
		System.out.println(solde+d);
	}
	public void lireSolde() throws RemoteException{
		System.out.println(solde);
	}
}
