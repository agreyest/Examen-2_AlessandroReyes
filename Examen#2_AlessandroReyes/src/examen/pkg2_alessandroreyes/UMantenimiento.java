package examen.pkg2_alessandroreyes;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class UMantenimiento extends Usuario implements Serializable{
    private ArrayList<ATM> ATMs = new ArrayList();

    public UMantenimiento(int id_Usuario, Date nacimiento, Date año_afiliación, String prim_nombre, String seg_nombre, String prim_apellido, String contraseña, String seg_apellido) {
        super(id_Usuario, nacimiento, año_afiliación, prim_nombre, seg_nombre, prim_apellido, contraseña, seg_apellido);
    }
    
    public ArrayList<ATM> getATMs() {
        return ATMs;
    }

    public void setATMs(ArrayList<ATM> ATMs) {
        this.ATMs = ATMs;
    }
    
    
}
