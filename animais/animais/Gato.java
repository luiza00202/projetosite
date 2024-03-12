package animais;

public class Gato extends Animal {
    public Gato(String nome){
        super(nome);
        setSound("miau");
     }
    
      

    public void arrnar(){
        System.out.printf("%S arranhou!", getNome());
    }
    
}
    

