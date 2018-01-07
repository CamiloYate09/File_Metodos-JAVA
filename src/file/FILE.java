package file;

import java.io.File;
import javax.swing.JOptionPane;

public class FILE {

    public void analizarArchivo(String ruta) {

        File nombre = new File(ruta);

        if (nombre.exists()) {
            //System.out.println(nombre.getName() + "Si existe");
            JOptionPane.showMessageDialog(null, nombre.getName(), "Si existe".toUpperCase(), 0);
            if (nombre.isFile()) {
                System.out.println("Es un archivo");

            } else if (nombre.isDirectory()) {
                System.out.println("Si es un directorio");

            }
            if (nombre.isAbsolute()) {
                System.out.println("Es ruta absoluta");
            } else {
                System.out.println("No es ruta absoluta");
            }
            System.out.println("La ultima modificacion " + nombre.lastModified());
            System.out.println("Tamaño del archivo " + nombre.length());
            System.out.println("Su ruta es: " + nombre.getPath());
            System.out.println("Su ruta absoluta es : " + nombre.getAbsolutePath());

            // System.out.println("----" + nombre.listFiles());
            System.out.println(" Espacio libre " + nombre.getFreeSpace());
            System.out.println(" Espacio total " + nombre.getTotalSpace());
            System.out.println(" Espacio usado " + nombre.getUsableSpace());
            if (nombre.isDirectory()) {
                String[] directorio = nombre.list();
                System.out.println("Contenido del directorio: \n");

                for (String recorrido : directorio) {
                    System.out.println("El nombre del directorio es :" + recorrido);

                }
            }
        } else {
            System.out.println(ruta + " NOoo existe");
        }

    }

    public static void main(String[] args) {

        FILE programa = new FILE();

        programa.analizarArchivo("C:/");
    }

}
