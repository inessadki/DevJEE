package serveur;
import java.rmi.Naming ;
import java.rmi.registry.LocateRegistry;
public class server {

	public server() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try{
	LocateRegistry .createRegistry(1099);
	helloinplement obj=new helloinplement();
	Naming.rebind("rmi://localhost:1099//helloserver",obj);
	System.out.println(obj.toString());
	
}
catch(Exception e){
	e.printStackTrace();
}
	}

}
