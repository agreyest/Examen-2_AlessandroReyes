package examen.pkg2_alessandroreyes;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class ATM implements Serializable{
    private String ubicación, mantenimiento;
    private int ID_único, dinero_cont;
    private Date año_fab;
    private ArrayList<Log_Sistema> logs = new ArrayList();

    public ATM(String ubicación, String mantenimiento, int ID_único, int dinero_cont, Date año_fab) {
        this.ubicación = ubicación;
        this.mantenimiento = mantenimiento;
        this.ID_único = ID_único;
        this.dinero_cont = dinero_cont;
        this.año_fab = año_fab;
    }
    

    public String getUbicación() {
        return ubicación;
    }

    public void setUbicación(String ubicación) {
        this.ubicación = ubicación;
    }

    public String getMantenimiento() {
        return mantenimiento;
    }

    public void setMantenimiento(String mantenimiento) {
        this.mantenimiento = mantenimiento;
    }

    public int getID_único() {
        return ID_único;
    }

    public void setID_único(int ID_único) {
        this.ID_único = ID_único;
    }

    public Date getAño_fab() {
        return año_fab;
    }

    public void setAño_fab(Date año_fab) {
        this.año_fab = año_fab;
    }

    public int getDinero_cont() {
        return dinero_cont;
    }

    public void setDinero_cont(int dinero_cont) {
        this.dinero_cont = dinero_cont;
    }

    public ArrayList<Log_Sistema> getLogs() {
        return logs;
    }

    public void setLogs(ArrayList<Log_Sistema> logs) {
        this.logs = logs;
    }
    
    
    @Override
    public String toString() {
        return "ATM{" + " Ubicacion: " + ubicación + ", ID_unico= " + ID_único + '}';
    }
    
    
}
