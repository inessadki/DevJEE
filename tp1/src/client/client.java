package client;
import java.rmi.Naming ;
import serveur.hello ;


public class client {

	public client() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		hello obj;
		String message;
		
		try{
			obj=(hello)Naming.lookup("rmi://localhost:1099//helloserver");
			message=obj.Sayhello();
			System.out.println(message);
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
