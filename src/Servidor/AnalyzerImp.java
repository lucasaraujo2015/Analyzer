package Servidor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;



public class AnalyzerImp  extends UnicastRemoteObject implements AnalyzerIn {

	protected AnalyzerImp() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1739312976836725510L;
	private BufferedReader larq;
	@Override
	public String AnalyzerOS() throws RemoteException {
		 String OS = "null";
		 
			OS = System.getProperty("os.name");
			 
			return OS;
	}

	@Override
	public String AnalyzerLinux(String SO) throws RemoteException, IOException {
		String exec = "top > /home/lucas/out.txt";
		Runtime r = Runtime.getRuntime();
		r.exec(exec);
		
		if(SO.equals("Linux")){
			r.exec(exec);
			
			return processa_texto();
		}else {
		return "não é um sistema linux";
		}
		

	}
	
	private String processa_texto() {
		String Arq = "/home/lucas/out.txt", arg = null;
		int count = 0;
		try {
			FileReader arqv = new FileReader(Arq);
			larq = new BufferedReader(arqv);
			String linha = larq.readLine();
			while(linha != null){
				if(linha.contains("java")){
					arg = linha;
					count +=1;
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		if(count == 0){
			return "não existe Java rodando na máquina";
		}
		
		return arg;
		
	}


}
