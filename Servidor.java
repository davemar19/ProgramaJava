import java.net.*;
import java.io.*;
import java.util.*;

public class Servidor{

	double a,b;

	public static void main(String args[]) {
		Suma S=new Suma();
		S.a=Double.parseDouble(args[0]);
		S.b=Double.parseDouble(args[1]);
		System.out.printf("\n la suma es %f", S.Sumar());
	}
	public double Sumar(){
		return a+b;
	}
	public double restar(){
		return a-b;
	}
	public double multiplicar(){
		return a*b;
	}
	public double dividir(){
		return a/b;
	}

	try{
		ServerSocket server = new ServerSocket(8080);
		
		while(true){

			Socket cliente = server.accept();
			PrintWriter salida = new PrintWriter(cliente.getOutputStream(), true);
			System.out.println("Usuario conectado");
			salida.println("Bienvenido");
		}

	}catch(IOException e){
		System.out.println("No hay flujo...");
	}

	}
}