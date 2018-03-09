package serveur;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
public class helloinplement extends UnicastRemoteObject implements hello{
	public helloinplement() throws RemoteException{
		super();
		
	}
	;
	public String Sayhello() throws RemoteException{
		return "hello dsi";
	}
}
