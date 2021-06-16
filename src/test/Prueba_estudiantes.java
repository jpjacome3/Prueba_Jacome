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
       
        System.out.print("porcentaje de hombres por encima del promedio:");
       
        System.out.print("porcentaje de mujeres por encima del promedio: ");
     
        System.out.print("estudiante con la mas alta nota ");
 
    }
    
}
