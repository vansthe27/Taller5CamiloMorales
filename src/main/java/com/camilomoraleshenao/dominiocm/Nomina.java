package com.camilomoraleshenao.dominiocm;

import java.util.ArrayList;

public class Nomina {

    private ArrayList<Empleado> empleadosCamilo;

    public  Nomina() {
        empleadosCamilo = new ArrayList<>();
    }


    public void calcularNominaMorales() {
        for (Empleado empleado : empleadosCamilo) {
            empleado.calcularSalarioMorales();
        }
    }



    public void listarDirectosMorales() {
        System.out.println("Empleados Directos:");
        for (Empleado empleado : empleadosCamilo) {
            if (empleado instanceof Directo) {
                System.out.println(empleado);
            }
        }
    }



    public void listarFreelanceMorales() {
        System.out.println("Freelancers:");
        for (Empleado empleado : empleadosCamilo) {
            if (empleado instanceof Freelance) {
                System.out.println(empleado);
            }
        }
    }



    public void listarPromotoresMorales() {
        System.out.println("Promotores:");
        for (Empleado empleado : empleadosCamilo) {
            if (empleado instanceof Promotor) {
                System.out.println(empleado);
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
