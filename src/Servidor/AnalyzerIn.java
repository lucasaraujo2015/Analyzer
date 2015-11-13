package Servidor;

import java.io.IOException;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface AnalyzerIn extends Remote{
public String AnalyzerOS() throws RemoteException;
	
	public String AnalyzerLinux(String SO) throws RemoteException, IOException;

}
