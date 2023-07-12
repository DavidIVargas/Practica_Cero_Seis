/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica_6.controlador;

import java.io.File;
import java.io.IOException;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author jeanp
 */
public class DirectoriosController {

    public void crearDirectorio(String ruta, String nombreDirectorio) {
        String rutaCompleta = ruta + "/" + nombreDirectorio;

        File directorio = new File(rutaCompleta);

        if (directorio.exists()) {
            System.out.println("El directorio ya existe: " + directorio.getAbsolutePath());
        } else {
            boolean exito = directorio.mkdir();

            if (exito) {
                System.out.println("Directorio creado: " + directorio.getAbsolutePath());
            } else {
                System.out.println("No se pudo crear el directorio: " + directorio.getAbsolutePath());
            }
        }
    }

    public void crearArchivo(String ruta, String nombreArchivo) {
        String rutaCompleta = ruta + "/" + nombreArchivo;

        File archivo = new File(rutaCompleta);

        if (archivo.exists()) {
            System.out.println("El archivo ya existe: " + archivo.getAbsolutePath());
        } else {
            try {
                boolean exito = archivo.createNewFile();

                if (exito) {
                    System.out.println("Archivo creado: " + archivo.getAbsolutePath());
                } else {
                    System.out.println("No se pudo crear el archivo: " + archivo.getAbsolutePath());
                }
            } catch (IOException e) {
                System.out.println("Error al crear el archivo: " + e.getMessage());
            }
        }
    }

    public void listarDirectorios(File directorio, DefaultMutableTreeNode nodoPadre) {
        if (directorio.isDirectory()) {
            File[] archivos = directorio.listFiles();
            if (archivos != null) {
                for (File archivo : archivos) {
                    if (archivo.isDirectory()) {
                        DefaultMutableTreeNode nodoDirectorio = new DefaultMutableTreeNode(archivo.getName());
                        nodoPadre.add(nodoDirectorio);
                        listarDirectorios(archivo, nodoDirectorio);
                    }
                }
            }
        }
    }

    public void listarArchivos(File directorio, DefaultMutableTreeNode nodoPadre) {
        if (directorio.isDirectory()) {
            File[] archivos = directorio.listFiles();
            if (archivos != null) {
                for (File archivo : archivos) {
                    if (archivo.isFile()) {
                        DefaultMutableTreeNode nodoArchivo = new DefaultMutableTreeNode(archivo.getName());
                        nodoPadre.add(nodoArchivo);
                    }
                }
            }
        }
    }

    public void listarDirectoriosOcultos(File directorio, DefaultMutableTreeNode nodoPadre) {
        if (directorio.isDirectory()) {
            File[] archivos = directorio.listFiles();
            if (archivos != null) {
                for (File archivo : archivos) {
                    if (archivo.isDirectory() && archivo.isHidden()) {
                        DefaultMutableTreeNode nodoDirectorio = new DefaultMutableTreeNode(archivo.getName());
                        nodoPadre.add(nodoDirectorio);
                        listarDirectoriosOcultos(archivo, nodoDirectorio);
                    }
                }
            }
        }
    }

    public void listarArchivosOcultos(File directorio, DefaultMutableTreeNode nodoPadre) {
        if (directorio.isDirectory()) {
            File[] archivos = directorio.listFiles();
            if (archivos != null) {
                for (File archivo : archivos) {
                    if (archivo.isFile() && archivo.isHidden()) {
                        DefaultMutableTreeNode nodoArchivo = new DefaultMutableTreeNode(archivo.getName());
                        nodoPadre.add(nodoArchivo);
                    }
                }
            }
        }
    }

    public void listarTodo(File directorio, DefaultMutableTreeNode nodoPadre) {
        if (directorio.isDirectory()) {
            File[] archivos = directorio.listFiles();
            if (archivos != null) {
                for (File archivo : archivos) {
                    if (archivo.isDirectory()) {
                        DefaultMutableTreeNode nodoDirectorio = new DefaultMutableTreeNode(archivo.getName());
                        nodoPadre.add(nodoDirectorio);
                        listarTodo(archivo, nodoDirectorio);
                    } else {
                        DefaultMutableTreeNode nodoArchivo = new DefaultMutableTreeNode(archivo.getName());
                        nodoPadre.add(nodoArchivo);
                    }
                }
            }
        }
    }

    public void eliminarArchivoODirectorio(String rutaArchivoODirectorio) {
        File archivoODirectorio = new File(rutaArchivoODirectorio);

        if (archivoODirectorio.exists()) {
            if (archivoODirectorio.isDirectory()) {
                eliminarDirectorio(archivoODirectorio);
            } else {
                if (archivoODirectorio.delete()) {
                    System.out.println("Archivo eliminado: " + rutaArchivoODirectorio);
                } else {
                    System.out.println("No se pudo eliminar el archivo: " + rutaArchivoODirectorio);
                }
            }
        } else {
            System.out.println("El archivo o directorio no existe: " + rutaArchivoODirectorio);
        }
    }

    private void eliminarDirectorio(File directorio) {
        File[] archivos = directorio.listFiles();

        if (archivos != null) {
            for (File archivo : archivos) {
                if (archivo.isDirectory()) {
                    eliminarDirectorio(archivo);
                } else {
                    archivo.delete();
                }
            }
        }

        if (directorio.delete()) {
            System.out.println("Directorio eliminado: " + directorio.getAbsolutePath());
        } else {
            System.out.println("No se pudo eliminar el directorio: " + directorio.getAbsolutePath());
        }
    }

    public void renombrarArchivoODirectorio(String ruta, String nuevoNombre) {
        File archivoODirectorio = new File(ruta);
        String nuevaRuta = archivoODirectorio.getParent() + File.separator + nuevoNombre;
        File archivoODirectorioNuevo = new File(nuevaRuta);
        archivoODirectorio.renameTo(archivoODirectorioNuevo);
    }
}
