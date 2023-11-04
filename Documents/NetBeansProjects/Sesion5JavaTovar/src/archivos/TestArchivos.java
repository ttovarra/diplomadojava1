
package archivos;

import java.util.Scanner;

public class TestArchivos {//inicia clase
    
    public static void main(String[] args) {//inicia main
        int opcion=0;
        MetodosArchivos miArchivo=new MetodosArchivos();
        
        do{//inicia do-while
            System.out.println("Ingresa una opcion\n1.- Solicitar nombre de archivo"
                                +"\n2. Ingrese texto del archivo"
                                +"\n3. Agregar mas texto en el archivo"
                                +"\n4. Leer-Consultar texto del archivo"
                                +"\n5. Salir ");   
            Scanner arje=new Scanner(System.in);
            opcion=arje.nextInt();
String ruta="C:\\Users\\beto\\Documents\\NetBeansProjects\\Sesion5JavaTovar\\src\\archivos"+miArchivo.nom+".txt";
        switch(opcion){//inicia switch
            case 1: miArchivo.nombreA(); break;
            case 2: 
                miArchivo.texto();
                    miArchivo.escribir(ruta, miArchivo.linea);
                        break;
            case 3: 
                miArchivo.texto();
                miArchivo.escribir(ruta, miArchivo.linea);
                        ;break;
            case 4:System.out.println(miArchivo.leer(ruta)); break;
            case 5: System.out.println("Finalizo Programa");break;
            default:System.out.println("Opcion invalida: Solo tengo Opcion: 1.- \n2.- \n3.- \n4.- \n5.- ");break;
        }//termina switch            

        }while(opcion<5);  //termina do-while
        
    }//termina main
    
}//termina clase
