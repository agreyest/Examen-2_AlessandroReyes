package examen.pkg2_alessandroreyes;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Log_Sistema implements Serializable{
    private UCliente cliente;
    private UMantenimiento mantenimiento;
    private String desc_acción;
    private Date Fecha;
    private boolean u;
    SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

    public Log_Sistema(UCliente cliente, String desc_acción, Date fecha_r, boolean u) {
        this.cliente = cliente;
        this.desc_acción = desc_acción;
        this.Fecha = fecha_r;
        this.u = u;
    }

    public Log_Sistema(UMantenimiento mantenimiento, String desc_acción, Date fecha_r, boolean u) {
        this.mantenimiento = mantenimiento;
        this.desc_acción = desc_acción;
        this.Fecha = fecha_r;
        this.u = u;
    }

    public UCliente getCliente() {
        return cliente;
    }

    public void setCliente(UCliente cliente) {
        this.cliente = cliente;
    }

    public UMantenimiento getMantenimiento() {
        return mantenimiento;
    }

    public void setMantenimiento(UMantenimiento mantenimiento) {
        this.mantenimiento = mantenimiento;
    }
    

    public String getDesc_acción() {
        return desc_acción;
    }

    public void setDesc_acción(String desc_acción) {
        this.desc_acción = desc_acción;
    }

    public Date getFecha_r() {
        return Fecha;
    }

    public void setFecha_r(Date fecha_r) {
        this.Fecha = fecha_r;
    }

    @Override
    public String toString() {
        if(u){
            return "                                            Log_Sistema\n\n\n" + 
                "Usuario: "+cliente.getId_Usuario() +"\nDescripcion: " + desc_acción + "\nFecha: " + df.format(Fecha) + 
                "\nHora= " + Fecha.getHours() + '}';
        }else{
            return "                                            Log_Sistema\n\n\n" + 
                "Usuario: "+ mantenimiento.getId_Usuario() +"\nDescripcion: " + desc_acción + "\nFecha: " + df.format(Fecha) + 
                "\nHora= " + Fecha.getHours() + '}';
        } 
    }
    
}
