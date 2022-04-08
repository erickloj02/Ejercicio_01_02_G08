/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_01_02_completo;

/**
 *
 * @author PC-17
 */
public class Empleado {
    
    String nombre;
    int horasTrabajadas;
    double costoHora;
    int anioIngreso;
    
     public double calcularTiempo(int currentYear){
            var retorno = (currentYear - this.anioIngreso);
       
        return retorno;
         
    }
    
    public double calcularIngresos(int currentYear, int anioIngreso){
             var retorno = ((0.02)*(currentYear-anioIngreso)*(costoHora*horasTrabajadas)+(costoHora*horasTrabajadas));
        
             return retorno;
    } 
}
