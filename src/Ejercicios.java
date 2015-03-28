import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;


public class Ejercicios {

	//Escribe la variable contenido al inicio de un archivo que tiene como nombre nombre_archivo
	static void escribirString(String nombre_archivo, String contenido)
	{
		try 
		{
		// llama al archivo nombre_archivo
		PrintWriter pw = new PrintWriter(nombre_archivo);
		//llama el contenido del archivo nombre_archivo tipo texto
		pw.write(contenido);
		pw.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	//Escribe la variable contenido al inicio de un archivo que tiene como nombre nombre_archivo
	static void escribirInt(String nombre_archivo, int contenido)
	{
		try
		{
			// llama al archivo nombre_archivo
			PrintWriter pw = new PrintWriter(nombre_archivo);
			//llama el contenido del archivo nombre_archivo tipo numero
			pw.println(contenido);
			pw.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	//Devuelve el primer entero contenido en el archivo con nombre nombre_archivo
	static int leerEntero(String nombre_archivo)
	{
		try
		{
			//ingresa un entero al archivo nombre_archivo
			Scanner scanner_archivo = new Scanner (new File (nombre_archivo));
			int entero = scanner_archivo.nextInt();
			scanner_archivo.close();
			//regresa el entero ingresado
			return entero;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		// en caso no ingresa nada regresa el archivo en blaco
		return leerEntero(nombre_archivo);
	}
	
	//Devuelve la primera string contenida en el archivo con nombre nombre_archivo
	static String leerString(String nombre_archivo)
	{
		try
		{
		//ingresa una cadena al archivo nombre_archivo
		Scanner scanner_archivo = new Scanner (new File (nombre_archivo));
		String cadena = scanner_archivo.next();
		scanner_archivo.close();
		//regresa la cadena ingresado
		return cadena;
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	// en caso no ingresa nada regresa el archivo en blaco
		return nombre_archivo;
	}
	
	//Devuelve el primer double contenido en el archivo con nombre nombre_archivo
	static double leerDouble(String nombre_archivo)
	{
		try
		{
			//ingresa un tipo Double al archivo nombre_archivo
			Scanner scanner_archivo = new Scanner (new File (nombre_archivo));
			Double leer = scanner_archivo.nextDouble();
			scanner_archivo.close();
			//regresa el archivo ingresado
			return leer;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		//regresa 0 sy no se ingresa un contenido al archivo 
		return 0;
	}
	
	//Devuelve la cantidad de veces que buscada (dado) existe en el archivo con nombre nombre_archivo (dado)
	static int contar(String nombre_archivo, String buscada)
	{
		try
		{
		int cont = 0;
		Scanner scanner_archivo = new Scanner (new File (nombre_archivo));
		scanner_archivo.close();
		while(scanner_archivo.hasNext())
			{
				if(scanner_archivo.equals(buscada))
				{
				cont = cont + 1;
				}
			}
		return cont;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return 0;
	}
	
	//Devuelve el promedio de los numeros almacenados en un archivo
	//Nota: el archivo unicamente contiene enteros
	static int getPromedio(String nombre_archivo)
	{
		try
		{
			int suma = 0;
			int num = 0;
			int promedio;
			Scanner scanner_archivo = new Scanner (new File (nombre_archivo));
			while(scanner_archivo.hasNext())
			{
				suma = suma + scanner_archivo.nextInt();
				num = num + 1;
			}
			return promedio = suma / num;
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
