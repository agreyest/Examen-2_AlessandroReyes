package examen.pkg2_alessandroreyes;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ATMAdmi {
    private ArrayList<ATM> listaATM = new ArrayList();
    private File archivo = null;
    
    public ATMAdmi(String path) {
        archivo = new File(path);
    }

    public ArrayList<ATM> getListaATM() {
        return listaATM;
    }

    public void setListaATM(ArrayList<ATM> listaParadas) {
        this.listaATM = listaParadas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void setArtista(ATM a){
        listaATM.add(a);
    }
    
    
    public void cargarArchivo() {
        try {            
            listaATM = new ArrayList();
            ATM temp;
            if (archivo.exists()) {
                FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (ATM) objeto.readObject()) != null) {
                        listaATM.add(temp);
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
            for (ATM t : listaATM) {
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
