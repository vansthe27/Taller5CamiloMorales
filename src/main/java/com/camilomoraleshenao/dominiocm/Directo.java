package com.camilomoraleshenao.dominiocm;

public class Directo extends Empleado{

    private long salarioCamilo;

    public Directo(String nombreCamilo, long salarioCamilo) {
        super(nombreCamilo);
        this.salarioCamilo = salarioCamilo;
    }


    @Override
    public long calcularSalarioMorales() {
        long salarioTotal = salarioCamilo - calcularSaludMorales() - calcularPensionMorales();
        return salarioTotal;
    }


    @Override
    public String toString() {
        return "Directo{" +
                "salarioCamilo=" + salarioCamilo +
                '}';
    }


    public Long calcularSaludMorales() {
        return (long) (salarioCamilo * 0.05);
    }


    public Long calcularPensionMorales() {
        return (long) (salarioCamilo * 0.065);
    }




    public long getSalarioCamilo() {
        return salarioCamilo;
    }


    public void setSalarioCamilo(long salarioCamilo) {
        this.salarioCamilo = salarioCamilo;
    }

}
