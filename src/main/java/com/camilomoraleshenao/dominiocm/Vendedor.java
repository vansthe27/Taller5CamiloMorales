package com.camilomoraleshenao.dominiocm;

public final class Vendedor extends Directo {

    private long ventasDelMesCamilo;


    public Vendedor(String nombreCamilo, long salarioCamilo, long ventasDelMesCamilo) {
        super(nombreCamilo, salarioCamilo);
        this.ventasDelMesCamilo = ventasDelMesCamilo;
    }


    @Override
    public long calcularSalarioMorales() {
        long salarioTotal = super.calcularSalarioMorales() + calcularComisionMorales();
        return salarioTotal;
    }


    @Override
    public String toString() {
        return "Vendedor{" +
                "ventasDelMesCamilo=" + ventasDelMesCamilo +
                '}';
    }

    public Long calcularComisionMorales() {
        if (ventasDelMesCamilo > 1000000) {
            return (long) (ventasDelMesCamilo * 0.035);
        } else {
            return (long) (ventasDelMesCamilo * 0.04);
        }
    }


    public long getVentasDelMesCamilo() {
        return ventasDelMesCamilo;
    }

    public void setVentasDelMesCamilo(long ventasDelMesCamilo) {
        this.ventasDelMesCamilo = ventasDelMesCamilo;
    }
}
