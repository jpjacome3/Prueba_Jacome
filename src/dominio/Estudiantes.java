/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

/**
 *
 * @author JEAN_PIERRE
 */
public class Estudiantes {
    private String nombre;
    private String sexo;
    private double nota;

    public Estudiantes(String nombre, String sexo, double nota) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public double getNota() {
        return nota;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    
    public double porcentaje_h(){
        
    }

    @Override
    public String toString(){
        return this.nombre+"  "+this.sexo+"   "+this.nota;
    }
}

   
    

