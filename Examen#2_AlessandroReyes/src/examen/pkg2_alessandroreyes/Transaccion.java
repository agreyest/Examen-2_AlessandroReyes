package examen.pkg2_alessandroreyes;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Transaccion implements Serializable{
    private int Num_Cuenta;
    private String desc_acción;
    private Date Fecha;
    private int  ID_unico;
    SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

    public Transaccion(int Num_Cuenta, String desc_acción, Date Fecha, int ID_unico) {
        this.Num_Cuenta = Num_Cuenta;
        this.desc_acción = desc_acción;
        this.Fecha = Fecha;
        this.ID_unico = ID_unico;
        
    }

    public int getNum_Cuenta() {
        return Num_Cuenta;
    }

    public void setNum_Cuenta(int Num_Cuenta) {
        this.Num_Cuenta = Num_Cuenta;
    }

    public String getDesc_acción() {
        return desc_acción;
    }

    public void setDesc_acción(String desc_acción) {
        this.desc_acción = desc_acción;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    
    public int getID_unico() {
        return ID_unico;
    }

    public void setID_unico(int ID_unico) {
        this.ID_unico = ID_unico;
    }

    @Override
    public String toString() {
        return "                                   Transaccion \n\n\n" + 
                "Num_Cuenta= " + Num_Cuenta + "\nDescripcion:    " + desc_acción + "\nFecha= " + df.format(Fecha) + 
                "\nHora= " + Fecha.getHours() + "\nID_unico= " + ID_unico + '}';
    }
    
    
}
