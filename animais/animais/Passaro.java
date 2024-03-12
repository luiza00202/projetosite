package animais;

public class Passaro extends Animal{
    public Passaro(String nome){
        super(nome);
        setSound("~piupiu");
     }
    public void voar(){
        System.out.printf("%S voou!", getNome());
    }
    
}
