/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio_01_02_completo;

/**
 *
 * @author PC-17
 */
public class Ejercicio_01_02_Completo {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        var empleadito = new Empleado();
       empleadito.nombre = "Erick Lojano";
       empleadito.horasTrabajadas = 100;
       empleadito.costoHora = 6;
       empleadito.anioIngreso = 2010;
       
       var empleados = new Empleado();
       empleados.nombre = "Maria Ortiz";
       empleados.horasTrabajadas = 100;
       empleados.costoHora = 9;
       empleados.anioIngreso = 2010;
       
       System.out.println(empleadito.nombre+" | "+
                          empleadito.horasTrabajadas+" | "+
                          empleadito.costoHora+" | "+
                          empleadito.anioIngreso+" | ");
       
       System.out.println(empleados.nombre+" | "+
                          empleados.horasTrabajadas+" | "+
                          empleados.costoHora+" | "+
                          empleados.anioIngreso+" | ");
    
   
        System.out.println("Su ingreso es:"+empleadito.calcularIngresos(2022,2010));
        
    }
}
