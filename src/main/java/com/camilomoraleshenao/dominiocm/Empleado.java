package com.camilomoraleshenao.dominiocm;

public abstract class Empleado {

    private String nombreCamilo;

    public Empleado(String nombreCamilo) {
        this.nombreCamilo = nombreCamilo;
    }

    public abstract long calcularSalarioMorales();

    @Override
    public String toString() {
        return "Empleado{" +
                "nombreCamilo='" + nombreCamilo + '\'' +
                '}';
    }


    public String getNombreCamilo() {
        return nombreCamilo;
    }

    public void setNombreCamilo(String nombreCamilo) {
        this.nombreCamilo = nombreCamilo;
    }
}
