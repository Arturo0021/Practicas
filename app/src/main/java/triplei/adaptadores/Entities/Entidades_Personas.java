package triplei.adaptadores.Entities;

import java.io.Serializable;

public class Entidades_Personas implements Serializable{

    // Entidades que usaremos
    public String Nombre;
    public String A_Paterno;
    public String A_Materno;
    public String Email;
    public String Telefono;

    // Constructor Vacio
    public Entidades_Personas() {

    }

    // Getters and Setters
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getA_Paterno() {
        return A_Paterno;
    }

    public void setA_Paterno(String a_Paterno) {
        A_Paterno = a_Paterno;
    }

    public String getA_Materno() {
        return A_Materno;
    }

    public void setA_Materno(String a_Materno) {
        A_Materno = a_Materno;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }
}
