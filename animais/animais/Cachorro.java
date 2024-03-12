package animais;


public class Cachorro extends Animal{
  
    public Cachorro(String nome){
       super(nome);
       setSound("auau");
    }
   
     
    public void cavarBuraco(){
        System.out.printf("%S cavou um buraco!", getNome());
    }
}