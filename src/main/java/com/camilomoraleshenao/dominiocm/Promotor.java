package com.camilomoraleshenao.dominiocm;

public class Promotor extends Empleado {

    private int volantesRepartidosCamilo;
    private long valorVolanteCamilo;
    private int comprasVolanteCamilo;

    public Promotor(String nombreCamilo, int volantesRepartidosCamilo, long valorVolanteCamilo, int comprasVolanteCamilo) {
        super(nombreCamilo);
        this.volantesRepartidosCamilo = volantesRepartidosCamilo;
        this.valorVolanteCamilo = valorVolanteCamilo;
        this.comprasVolanteCamilo = comprasVolanteCamilo;
    }


    @Override
    public long calcularSalarioMorales() {
        long salarioTotal = (long) (valorVolanteCamilo * volantesRepartidosCamilo + 15000 * comprasVolanteCamilo);
        return salarioTotal;
    }


    @Override
    public String toString() {
        return "Promotor{" +
                "volantesRepartidosCamilo=" + volantesRepartidosCamilo +
                ", valorVolanteCamilo=" + valorVolanteCamilo +
                ", comprasVolanteCamilo=" + comprasVolanteCamilo +
                '}';
    }

    public int getVolantesRepartidosCamilo() {
        return volantesRepartidosCamilo;
    }

    public long getValorVolanteCamilo() {
        return valorVolanteCamilo;
    }

    public int getComprasVolanteCamilo() {
        return comprasVolanteCamilo;
    }


    public void setVolantesRepartidosCamilo(int volantesRepartidosCamilo) {
        this.volantesRepartidosCamilo = volantesRepartidosCamilo;
    }

    public void setValorVolanteCamilo(long valorVolanteCamilo) {
        this.valorVolanteCamilo = valorVolanteCamilo;
    }

    public void setComprasVolanteCamilo(int comprasVolanteCamilo) {
        this.comprasVolanteCamilo = comprasVolanteCamilo;
    }
}
