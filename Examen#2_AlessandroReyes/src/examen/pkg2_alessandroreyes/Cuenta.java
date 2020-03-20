package examen.pkg2_alessandroreyes;

import java.io.Serializable;

public class Cuenta implements Serializable{
    private int NumCuenta , saldo_disponible , Id_propietario;

    public Cuenta(int NumCuenta, int saldo_disponible, int Id_propietario) {
        this.NumCuenta = NumCuenta;
        this.saldo_disponible = saldo_disponible;
        this.Id_propietario = Id_propietario;
    }

    public int getNumCuenta() {
        return NumCuenta;
    }

    public void setNumCuenta(int NumCuenta) {
        this.NumCuenta = NumCuenta;
    }

    public int getSaldo_disponible() {
        return saldo_disponible;
    }

    public void setSaldo_disponible(int saldo_disponible) {
        this.saldo_disponible = saldo_disponible;
    }

    public int getId_propietario() {
        return Id_propietario;
    }

    public void setId_propietario(int Id_propietario) {
        this.Id_propietario = Id_propietario;
    }

    @Override
    public String toString() {
        return "Cuenta{" + " NumCuenta= " + NumCuenta + ", saldo_disponible= " + saldo_disponible + ", Id_propietario= " + Id_propietario + '}';
    }
    
}
