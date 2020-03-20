package examen.pkg2_alessandroreyes;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Usuario implements Serializable{
    private int id_Usuario;
    private Date nacimiento, año_afiliación;
    private String prim_nombre , seg_nombre , prim_apellido , contraseña , seg_apellido;

    public Usuario(int id_Usuario, Date nacimiento, Date año_afiliación, String prim_nombre, String seg_nombre, String prim_apellido, String contraseña, String seg_apellido) {
        this.id_Usuario = id_Usuario;
        this.nacimiento = nacimiento;
        this.año_afiliación = año_afiliación;
        this.prim_nombre = prim_nombre;
        this.seg_nombre = seg_nombre;
        this.prim_apellido = prim_apellido;
        this.contraseña = contraseña;
        this.seg_apellido = seg_apellido;
    }

    public int getId_Usuario() {
        return id_Usuario;
    }

    public void setId_Usuario(int id_Usuario) {
        this.id_Usuario = id_Usuario;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public Date getAño_afiliación() {
        return año_afiliación;
    }

    public void setAño_afiliación(Date año_afiliación) {
        this.año_afiliación = año_afiliación;
    }

    
    public String getPrim_nombre() {
        return prim_nombre;
    }

    public void setPrim_nombre(String prim_nombre) {
        this.prim_nombre = prim_nombre;
    }

    public String getSeg_nombre() {
        return seg_nombre;
    }

    public void setSeg_nombre(String seg_nombre) {
        this.seg_nombre = seg_nombre;
    }

    public String getPrim_apellido() {
        return prim_apellido;
    }

    public void setPrim_apellido(String prim_apellido) {
        this.prim_apellido = prim_apellido;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getSeg_apellido() {
        return seg_apellido;
    }

    public void setSeg_apellido(String seg_apellido) {
        this.seg_apellido = seg_apellido;
    }

    @Override
    public String toString() {
        return "Usuario{ " + "id_Usuario: " + id_Usuario + ", prim_nombre=" + prim_nombre + ", seg_nombre=" + seg_nombre + ", prim_apellido=" + prim_apellido + ", seg_apellido=" + seg_apellido + '}';
    }
    
    
}
