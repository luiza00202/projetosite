package animais;

import animais.Gato; 

public class App {
    public static void main(String[] args) {
    Cachorro cachorro = new Cachorro("Caramelo");
    cachorro.setFavoriteFood("Petiscos");
    cachorro.setHeight(1.30);
    cachorro.setWeight(30);
    cachorro.setSpeed(40.00);
    cachorro.comer();
    System.out.println(" ");
    cachorro.beber();
    System.out.println(" ");
    System.out.println(" ");
    System.out.println(cachorro.getNome() + " disse: " + cachorro.getSound());
    System.out.println(" ");
    System.out.println("O "+ cachorro.getNome() + " Possui " + cachorro.getWeightGrams() + " gramas");
    System.out.println(" ");
    cachorro.mover(1);
    

    Gato gato = new Gato("Listrado");
    // mesmas informacoes do cachorro podem ser colocadas



 }

    
}
