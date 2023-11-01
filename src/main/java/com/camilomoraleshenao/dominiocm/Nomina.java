package com.camilomoraleshenao.dominiocm;

import java.util.ArrayList;

public class Nomina {

    private ArrayList<Empleado> empleadosCamilo;

    public  Nomina(ArrayList<Empleado> empleados) {
        this.empleadosCamilo = new ArrayList<>();
    }


    public void calcularNominaMorales() {
        for (Empleado empleado : empleadosCamilo) {
            double salario = empleado.calcularSalarioMorales();
            System.out.println("El salario de " + empleado.getNombreCamilo() + " es: $" + salario);
        }
    }



    public void listarDirectosMorales() {
        System.out.println("Empleados Directos: ");
        for (Empleado empleado : empleadosCamilo) {
            if (empleado instanceof Directo) {
                System.out.println(empleado.getNombreCamilo());
            }
        }
    }



    public void listarFreelanceMorales() {
        System.out.println("Empleados Freelance: ");
        for (Empleado empleado : empleadosCamilo) {
            if (empleado instanceof Freelance) {
                System.out.println(empleado.getNombreCamilo());
            }
        }
    }



    public void listarPromotoresMorales() {
        System.out.println("Empleados Promotores: ");
        for (Empleado empleado : empleadosCamilo) {
            if (empleado instanceof Promotor) {
                System.out.println(empleado.getNombreCamilo());
            }
        }
    }


    public ArrayList<Empleado> getEmpleadosCamilo() {
        return empleadosCamilo;
    }

    public void setEmpleadosCamilo(ArrayList<Empleado> empleadosCamilo) {
        this.empleadosCamilo = empleadosCamilo;
    }
}
