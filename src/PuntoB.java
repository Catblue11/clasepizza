
import java.util.Scanner;

 
public class PuntoB {
    public static void main(String[] args){
        Pizza p1 = new Pizza();
        p1.setToppings("Don cangrejo");
        p1.setSize(15);
        p1.setPrice(15900);
        System.out.println("la pizza de sabor " + p1.getToppings()+ " de tamaño " + p1.getSize()+ " pulgadas, vale  " +p1.getPrice() + " pesos.");
      
        Scanner lectura = new Scanner (System.in);
        Pizza[] pizzas = new Pizza[10];
        for (int i = 0; i < 10; i++) {
            pizzas[i] = new Pizza();
            System.out.println("Ingredientes " + i);
            pizzas[i].setToppings(lectura.next());
            System.out.println("Tamaño " + i + " pulgadas");
            pizzas[i].setSize(lectura.nextInt());
            System.out.println("Precio " + i + "pesos");
            pizzas[i].setPrice(lectura.nextDouble());
      
    }
    
    }
}

