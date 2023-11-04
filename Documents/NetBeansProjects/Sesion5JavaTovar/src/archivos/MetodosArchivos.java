
package archivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;//libreria para entrada y salida de datos en un archivo
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;//libreria para entrada de datos


public class MetodosArchivos {//inicia clase
      //definicion de variables 
    String nom;//variable para nombre del archivo
    String linea;// Identificar lineas de escritura en el archivo
    
    //funcion para solicitar el nombre del archivo
    public void nombreA(){
        System.out.println("Ingrese el nombre del archivo a Generear: ");
        Scanner arje=new Scanner(System.in);
        nom = arje.next();
        System.out.println("El nombre de tu archivo es : "+nom+".txt");
    }//termina funcion para solicitar nombre del archivo
    
    //funcion para ingresar texto en el archivo
    public void texto(){
        System.out.println("Capture el texto que desea agregar en el archivo: ");
        Scanner arje=new Scanner(System.in);
        linea=arje.nextLine();
    }//termina funcion texto
    
    //funcion para excribir el texto en el archivo
    public void escribir(String ruta, String cadena){
        File archivo = new File(ruta);//Se lee el archivo y ruta 
        //Estructura de control para tratamiento de errores try-catch trata de hacer - cacha
        try {//inicia try
            FileWriter escribirArchivo=new FileWriter(archivo,true);//escribe en el archivo 
            BufferedWriter buffer = new BufferedWriter(escribirArchivo);//le el archivo
            buffer.write(cadena);//Escribe la linea que recibe
            buffer.newLine();//crea una nueva linea
            buffer.close();//cierra la funcion escritura
        } catch (Exception e) {//inicia chatch
            System.out.println("Error en el archivo o codigo Verifica :  "+e);
        }//termina catch
        
    }//termina funcion escribir
    
    //funcion para leer el contenido del archivo
    public String leer(String ruta){
        //tipo de datos dinamicos arrayList almacena valores y los procesa 
        ArrayList array = new ArrayList();
        String linea = ""; 
        String retornar ="";
        File archivo = new File (ruta);//leer la ruta y el archivo
        try {//inicia try
            FileReader leerArchivo = new FileReader(archivo);//Sentencia para leer el archivo
            BufferedReader buffer = new BufferedReader(leerArchivo);//para lectura de buffer
            while((linea = buffer.readLine())!=null){//inicia while
                retornar += linea +"\n";
            } //termina while
            buffer.close();
        } catch (Exception e) {//inicia catch
             System.out.println("Error verifica instrucciones!!!");
        }//termina catch

        return retornar;
    }//termina funcion leer
    
}//termina clase
