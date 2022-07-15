
package Lavadora;

import Entidades.Electrodomestico;
import java.util.Scanner;

public class Lavadora extends Electrodomestico{
    
    public Scanner leer= new Scanner(System.in).useDelimiter("\n");
    
    protected Integer carga;

    public Lavadora() {
    }

    public Lavadora(Integer carga, Integer precio, String color, String consumoenergetico, Integer peso) {
        super(precio, color, consumoenergetico, peso);
        this.carga = carga;
    }

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }

    public void crearLavadora(){
        crearElectrodoméstico();
        System.out.println("Ingrese la carga: ");
        this.carga= leer.nextInt();
        
        precioFinal();
        
    }
    public void precioFinal(){
        super.precioFinal();
        
        if(this.carga>30){
            this.precio=+500;
        }
    }
    
    public void mostrarLavadora(){
        System.out.println("Las características de su Lavadora son: "
        + " Color " + this.color
        + " Consumo " + this.consumoenergetico
        + " Peso " + this.peso
        + " Carga " + this.carga
        + "Precio " + this.precio);
    }

    @Override
    public String toString() {
        return " Lavadora " + "Carga " + carga + super.toString(); 
    }
    
    
    
}
