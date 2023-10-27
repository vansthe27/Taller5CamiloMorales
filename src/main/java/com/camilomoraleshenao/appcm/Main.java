package com.camilomoraleshenao.appcm;

import com.camilomoraleshenao.dominiocm.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Creación de Empleados!!!
        Directo Juan = new Directo("Juan",4840000);
        Vendedor Julian = new Vendedor("Julian",2050000,45510000);
        Freelance Johanna = new Freelance("Johanna",71000,89);
        Vendedor Carolina = new Vendedor("Carolina",980000,35989000);
        Promotor Pedro = new Promotor("Pedro",1200,300,62);
        Directo David = new Directo("David",3975000);
        Freelance Gustavo = new Freelance("Gustavo",42500,65);


        //Calcular y mostrar los salarios de cada empleado
        System.out.println("El salario de "+Juan.getNombreCamilo()+ " es: $"+Juan.calcularSalarioMorales()+ " En el cargo de Directo");
        System.out.println("El salario de "+Julian.getNombreCamilo()+ " es: $"+Julian.calcularSalarioMorales()+ " En el cargo de Vendedor");
        System.out.println("El salario de "+Johanna.getNombreCamilo()+ " es: $"+Johanna.calcularSalarioMorales()+ " En el cargo de Freelance");
        System.out.println("El salario de "+Carolina.getNombreCamilo()+ " es: $"+Carolina.calcularSalarioMorales()+ " En el cargo de Vendedor");
        System.out.println("El salario de "+Pedro.getNombreCamilo()+ " es: $"+Pedro.calcularSalarioMorales()+ " En el cargo de Promotor");
        System.out.println("El salario de "+David.getNombreCamilo()+ " es: $"+David.calcularSalarioMorales()+ " En el cargo de Directo");
        System.out.println("El salario de "+Gustavo.getNombreCamilo()+ " es: $"+Gustavo.calcularSalarioMorales()+ " En el cargo de Freelance");



    }
}
