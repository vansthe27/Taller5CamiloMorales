package com.camilomoraleshenao.dominiocm;

public class Freelance extends Empleado{

    private long valorHoraCamilo;
    private int horasTrabajadasCamilo;

    public Freelance(String nombreCamilo, long valorHoraCamilo, int horasTrabajadasCamilo) {
        super(nombreCamilo);
        this.valorHoraCamilo = valorHoraCamilo;
        this.horasTrabajadasCamilo = horasTrabajadasCamilo;
    }


    @Override
    public long calcularSalarioMorales() {
        return valorHoraCamilo * horasTrabajadasCamilo;
    }


    @Override
    public String toString() {
        return "Freelance{" +
                "valorHoraCamilo=" + valorHoraCamilo +
                ", horasTrabajadasCamilo=" + horasTrabajadasCamilo +
                '}';
    }

    public long getValorHoraCamilo() {
        return valorHoraCamilo;
    }

    public int getHorasTrabajadasCamilo() {
        return horasTrabajadasCamilo;
    }


    public void setValorHoraCamilo(long valorHoraCamilo) {
        this.valorHoraCamilo = valorHoraCamilo;
    }

    public void setHorasTrabajadasCamilo(int horasTrabajadasCamilo) {
        this.horasTrabajadasCamilo = horasTrabajadasCamilo;
    }
}
