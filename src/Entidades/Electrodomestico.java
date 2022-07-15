package Entidades;

import java.util.Scanner;

public class Electrodomestico {

    public Scanner leer = new Scanner(System.in).useDelimiter("\n");

    protected Integer precio;
    protected String color;
    protected String consumoenergetico;
    protected Integer peso;

    public Electrodomestico() {
    }

    public Electrodomestico(Integer precio, String color, String consumoenergetico, Integer peso) {
        this.precio = precio;
        this.color = color;
        this.consumoenergetico = consumoenergetico;
        this.peso = peso;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getConsumoenergetico() {
        return consumoenergetico;
    }

    public void setConsumoenergetico(String consumoenergetico) {
        this.consumoenergetico = consumoenergetico;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    private void comprobarConsumoEnergetico(String letra) {
        if (!consumoenergetico.equals("A") && !this.consumoenergetico.equals("B") && !this.consumoenergetico.equals("C") && !this.consumoenergetico.equals("D") && !this.consumoenergetico.equals("E") && !this.consumoenergetico.equals("F")) {
            System.out.println("La letra ingresada es incorrecta, se usará por defecto la letra F");//letra incorrecta
            consumoenergetico = "F";
        } else {
            this.consumoenergetico = letra;
        }

    }

    private void comprobarColor(String color) {
        if (!this.color.equalsIgnoreCase("Blanco") && !this.color.equalsIgnoreCase("Negro") && !this.color.equalsIgnoreCase("Rojo") && !this.color.equalsIgnoreCase("Azul") && !this.color.equalsIgnoreCase("Gris")) {
            System.out.println("El color ingresado es incorrecto, se usará por defecto el blanco");
            this.color = "Blanco";//color incorrecto
        } else {
            this.color = color;
        }

    }

    public void crearElectrodoméstico() {
        System.out.println("Elija un consumo energético");
        this.consumoenergetico = leer.next().toUpperCase();
        comprobarConsumoEnergetico(this.consumoenergetico);

        System.out.println("Elija un color para el Electrodoméstico");
        this.color = leer.next();
        comprobarColor(this.color);

        System.out.println("Coloque el peso");
        this.peso = leer.nextInt();

        System.out.println("El precio base es ");
        System.out.println(this.precio = 1000);
    }

    public void precioFinal() {

        switch (this.consumoenergetico) {
            case "A":
                this.precio = +1000;
            case "B":
                this.precio = +800;
            case "C":
                this.precio = +600;
            case "D":
                this.precio = +500;
            case "E":
                this.precio = +300;
            case "F":
                this.precio = +100;
        }
        if (this.peso >= 1 && this.peso <= 19) {
            this.precio = +100;
        } else if (this.peso >= 20 && this.peso <= 49) {
            this.precio = +500;

        } else if (this.peso >= 50 && this.peso <= 79) {
            this.precio = +800;
        } else if (this.peso >= 80) {
            this.precio = +1000;
        }
    }

    @Override
    public String toString() {
        return " Precio: " + precio + " Color: " + color+ " Consumo energético: " + consumoenergetico + " Peso: " + peso; 
    }
    

}
