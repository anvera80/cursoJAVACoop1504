package fin.coop1504.tallerjava;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AplicacionArchivo {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		File archivo = new File("C:\\cursoJAVACoop1504\\ArchivoEjemplo.txt");
		System.out.println("se puede leer" + archivo.canRead());
		System.out.println("se puede escribir" + archivo.canWrite());
		System.out.println("el archivo existe" + archivo.exists());
		System.out.println("el archivo es un directorio" + archivo.isDirectory());
		System.out.println("ruta absoluta" + archivo.getAbsolutePath());
		System.out.println("nombre de archivo" + archivo.getName());
		System.out.println("tamaño del archivo" + archivo.getTotalSpace());
		BufferedReader recorreArchivo = null;
		try {

			FileReader lector = new FileReader(archivo);//abrir el archivo
			recorreArchivo = new BufferedReader(lector); 
			String linea = recorreArchivo.readLine();
//            System.out.println("Linea 1 del archivo: " + linea);
//            linea = recorreArchivo.readLine();
//            System.out.println("Linea 2 del archivo: " + linea);
			while (linea != null) {
				System.out.println(linea);
				linea = recorreArchivo.readLine();
			}
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			System.err.println("Error al abrir el archivo");

			e.printStackTrace();
		} catch (IOException e) {
			// TODO: handle exception
			System.err.println("Error recorrer el archivo");
			e.printStackTrace();
		}finally {
			if (recorreArchivo != null)
				recorreArchivo.close();
		}
	}
}