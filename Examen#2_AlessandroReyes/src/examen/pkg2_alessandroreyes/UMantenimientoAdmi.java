package examen.pkg2_alessandroreyes;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class UMantenimientoAdmi {
    private ArrayList<UMantenimiento> listaMantenimientos = new ArrayList();
    private File archivo = null;
    
    public UMantenimientoAdmi(String path) {
        archivo = new File(path);
    }

    public ArrayList<UMantenimiento> getListaMantenimiento() {
        return listaMantenimientos;
    }

    public void setListaMantenimiento(ArrayList<UMantenimiento> listaParadas) {
        this.listaMantenimientos = listaParadas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void setArtista(UMantenimiento a){
        listaMantenimientos.add(a);
    }
    
    
    public void cargarArchivo() {
        try {            
            listaMantenimientos = new ArrayList();
            UMantenimiento temp;
            if (archivo.exists()) {
                FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (UMantenimiento) objeto.readObject()) != null) {
                        listaMantenimientos.add(temp);
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
            for (UMantenimiento t : listaMantenimientos) {
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
