/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.ejercicio11;

/**
 *
 * @author stanley
 */
public class claseinicial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        System.out.println(libro.toString());
        libros objetolibro1 = new libros(1, "PROGRAMACION JAVA", 100, "Deitel");
        libros objetolibro2 = new libros(1, "PROGRAMACION PHP", 600, "Deitel");
        
        objetolibro1.setNumeroPaginas(200);

        if (objetolibro1.getNumeroPaginas() < objetolibro2.getNumeroPaginas()) {
            System.out.println("El libro 2 es mayor  numero de pagina que el libro 1, el libro 2 tiene un numero de paginas de "+objetolibro2.getNumeroPaginas());
            System.out.println("la informacion del libro 2 es "+objetolibro2.toString());
            
        } else {
            System.out.println("El libro 1 es mayor numero de pagina  que el libro 2, el libro 1 tiene un numero de paginas de "+objetolibro1.getNumeroPaginas());
            System.out.println("la informacion del libro 1 es "+objetolibro1.toString());
        }
    }

}
