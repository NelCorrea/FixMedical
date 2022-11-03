package com.unab.fixmedical.Models;

public class RespuestaPacienteModelo {
    private String Nombre;
    private String Apellido;
    private String Direccion;
    private String Telefono;
    private int Edad;
    private String Sexo;
    private boolean Estado;

    public String getNombre() {
        return this.Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return this.Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getDireccion() {
        return this.Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTelefono() {
        return this.Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public int getEdad() {
        return this.Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getSexo() {
        return this.Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public boolean isEstado() {
        return this.Estado;
    }

    public boolean getEstado() {
        return this.Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }
}
