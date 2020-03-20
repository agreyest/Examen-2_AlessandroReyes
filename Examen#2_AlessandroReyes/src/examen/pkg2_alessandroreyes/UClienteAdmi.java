package examen.pkg2_alessandroreyes;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class UClienteAdmi {
    private ArrayList<UCliente> listaclientes = new ArrayList();
    private File archivo = null;
    
    public UClienteAdmi(String path) {
        archivo = new File(path);
    }

    public ArrayList<UCliente> getListaCliente() {
        return listaclientes;
    }

    public void setListaCliente(ArrayList<UCliente> listaParadas) {
        this.listaclientes = listaParadas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void setArtista(UCliente a){
        listaclientes.add(a);
    }
    
    
    public void cargarArchivo() {
        try {            
            listaclientes = new ArrayList();
            UCliente temp;
            if (archivo.exists()) {
                FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (UCliente) objeto.readObject()) != null) {
                        listaclientes.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (UCliente t : listaclientes) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
}
