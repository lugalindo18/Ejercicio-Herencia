package guia10ejercicio2;

import Entidades.Electrodomestico;
import Lavadora.Lavadora;
import Televisor.Televisor;
import java.util.ArrayList;
import java.util.Scanner;

public class Guia10Ejercicio2 {

    private static final Scanner leer = new Scanner(System.in).useDelimiter("\n"); //lo coloco fuera del método porque no puede ir un private adentro de un public

    public static void main(String[] args) {

        ArrayList<Electrodomestico> listaElectrodomesticos = new ArrayList();

        int precioTele = 0;
        int precioLavadora = 0;
        int precioTotal;

        System.out.println("Cuantas Lavadoras desea crear. ");
        int cantLavadoras = leer.nextInt();

        for (int i = 0; i < cantLavadoras; i++) {
            Lavadora L = new Lavadora();

            L.crearLavadora();
            L.mostrarLavadora();

            listaElectrodomesticos.add(L);

        }

        System.out.println("Cuantos Televisores desea crear. ");
        int cantTeles = leer.nextInt();

        for (int i = 0; i < cantTeles; i++) {
            Televisor T = new Televisor();

            T.crearTelevisor();
            T.mostrarTelevisor();

            listaElectrodomesticos.add(T);
        }

        calcularprecioFinal(precioLavadora, precioTele, listaElectrodomesticos);

        precioTotal = precioLavadora + precioTele;

        System.out.println("El precio de todas las Lavadoras es : " + precioLavadora);
        System.out.println("El precio de todos los Televisores es : " + precioTele);
        System.out.println("El precio total de los Electrodomésticos es : " + precioTotal);
    }

    public static void calcularprecioFinal(int precioTele, int precioLavadora, ArrayList<Electrodomestico> listaElectrodomesticos) { //lo hago adentro de la clase y fuera del main
        for (Electrodomestico aux : listaElectrodomesticos) {
            if (aux instanceof Lavadora) {
                precioLavadora += aux.getPrecio();

            }
            if (aux instanceof Televisor) {
                precioTele += aux.getPrecio();

            }
        }

    }

}

