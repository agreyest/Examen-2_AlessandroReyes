package examen.pkg2_alessandroreyes;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class UCliente  extends Usuario implements Serializable {
    private ArrayList<Cuenta> cuentas = new ArrayList();
    private ArrayList<Transaccion> transacciones = new ArrayList();

    public UCliente(int id_Usuario, Date nacimiento, Date año_afiliación, String prim_nombre, String seg_nombre, String prim_apellido, String contraseña, String seg_apellido) {
        super(id_Usuario, nacimiento, año_afiliación, prim_nombre, seg_nombre, prim_apellido, contraseña, seg_apellido);
    }
    
    

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    public ArrayList<Transaccion> getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(ArrayList<Transaccion> transacciones) {
        this.transacciones = transacciones;
    }

    @Override
    public String toString() {
        return super.toString() + " numero de transacciones hechas = " + transacciones.size();
    }
    
    
}
