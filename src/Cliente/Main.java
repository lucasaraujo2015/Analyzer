package Cliente;

import java.io.IOException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import Servidor.AnalyzerIn;


public class Main {
	

	
	public static void main(String[] args) throws NotBoundException, IOException {
		String so = null;
		Registry registro = LocateRegistry.getRegistry("localhost", 1088);
		AnalyzerIn an = (AnalyzerIn) registro.lookup("RMI");

		so = an.AnalyzerOS();
		System.out.println(so);
		System.out.println("result:\n"+an.AnalyzerLinux(so));
	}

}
