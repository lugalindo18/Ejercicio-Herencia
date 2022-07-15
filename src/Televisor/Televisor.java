package Televisor;

import Entidades.Electrodomestico;

public class Televisor extends Electrodomestico {

    protected Integer pulgadas;
    protected boolean sintonizadorTDT;

    public Televisor() {
    }

    public Televisor(Integer pulgadas, boolean sintonizadorTDT, Integer precio, String color, String consumoenergetico, Integer peso) {
        super(precio, color, consumoenergetico, peso);
        this.pulgadas = pulgadas;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Integer getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(Integer pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public void crearTelevisor() {
        crearElectrodoméstico();
        System.out.println("Coloque la resolución del televisor en pulgadas: ");
        this.pulgadas = leer.nextInt();
        System.out.println("Coloque si el televisor tiene sincronizador TDT: ");
        String opc = leer.next();
        if (opc.equalsIgnoreCase("SI")) {
            this.sintonizadorTDT = true;
        } else {
            this.sintonizadorTDT = false;
        }
        precioFinal();
    }

    public void precioFinal() {
        super.precioFinal();

        Integer precioInteger = this.precio;
        double precioDouble = precioInteger;

        if (this.pulgadas > 40) {
            precioDouble = precioDouble + (precioDouble * 0.3);
        }
        this.precio = (int) precioDouble;
        if (sintonizadorTDT) {
            this.precio = +500;
        }

    }

    public void mostrarTelevisor() {
        System.out.println("Características del televisor: "
                + " Color " + this.color
                + " Consumo " + this.consumoenergetico
                + " Peso " + this.peso
                + " Pulgadas " + this.pulgadas
                + " Precio " + this.precio
                + " Sintetizador " + this.sintonizadorTDT);

    }

    @Override
    public String toString() {
        return " Televisor: " + " Resolución: " + pulgadas + " Sintonizador TDT " + sintonizadorTDT + super.toString();  
    }
    
    
}
