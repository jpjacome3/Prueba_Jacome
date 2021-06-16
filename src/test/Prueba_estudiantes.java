/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dominio.Estudiantes;

/**
 *
 * @author JEAN_PIERRE
 */
public class Prueba_estudiantes {
    Scanner datos = new(System.in);
    public static void main(String[] args){
        Estudiantes [] estudiantes;
        int n = 3;
        estudiantes = new Estudiantes[n];
        llenaDatos(estudiantes);
        for(int i=0;i<estudiantes.length;i++){
        System.out.println(estudiantes[i].getNombre()+
                estudiantes[i].getSexo()+estudiantes[i].getNota())
    }
    }
    public static void llenaDatos(Vehiculo veh[]){
        String marca;
        int aniof;
        double precio;
        System.out.print("Promedio de notas: ");
        marca= = datos.nextLine();
        System.out.print("porcentaje de hombres por encima del promedio:");
        aniof=datos.nextLine();
        System.out.print("porcentaje de mujeres por encima del promedio: ");
        precio=datos.nextLine();
        System.out.print("estudiante con la mas alta nota ");
        precio=datos.nextLine();
        veh[i]=new Vehiculo(marca,aniof,precio);
        datos.nextLine();
    }
    
}
