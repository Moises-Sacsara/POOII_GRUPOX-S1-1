package pooii_grupox.s1.pkg1;

import Clases.Circulo;

public class CirculoTest {
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo();
        //Utilizando el contructor por defecto
        System.out.println("----------Utilizando el contructor por defecto----------");
        System.out.println("");
        System.out.println("Radio: "+circulo1.getRadio());
        System.out.println("Area: "+circulo1.getArea());
        System.out.println("");
        //Utilizando el construcotor sobrecargado
        System.out.println("----------Utilizando el construcotor sobrecargado----------");
        System.out.println("");
        Circulo circulo2 = new Circulo(6.55);
        System.out.println("Radio: "+circulo2.getRadio());
        System.out.println("Area: "+circulo2.getArea());
        System.out.println("");
        //Modificando los valores por defecto
        Circulo circ = new Circulo();
        System.out.println("----------Valores modificados----------");
        System.out.println("");
        circ.setRadio(10.0);
        circ.setColor("Verde");
        System.out.println("Radio: " + circ.getRadio());
        System.out.println("Area: " + circ.getArea());
        System.out.println("Color: "+circ.getColor());
        System.out.println("");
        
        //Llamamos al metodo toString()
        Circulo cs = new Circulo();
        System.out.println("----------Metodo toString----------\n"
                + ""+cs.toString());
        
        /*
        //Prueba
        Circulo c1 = new Circulo();
        System.out.println(c1.radio);
        c1.radio=42.0;
        */
    }
}
