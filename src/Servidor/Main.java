package Servidor;


import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;



public class Main {

	public static void main(String[] args)throws RemoteException, AlreadyBoundException {
		// TODO Auto-generated method stub
		
		AnalyzerIn mo = new AnalyzerImp();
		Registry registro = LocateRegistry.createRegistry(1088);
		registro.bind("RMI", mo);
	
	}

}
