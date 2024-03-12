package animais;

public class Animal {

    private String nome;
    public Animal(String nome) {
        this.nome = nome;
    }
    private double height;
    private String sound;
    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
    private int weight;
    private String favoriteFood;
    private double speed;

    public int getWeightGrams(){
        int gram = 1000;
        return weight * gram;
        
    }
    

    public void mover(int movimento){
        if(movimento>0){
            System.out.printf("%S está se movendo", nome);
            System.out.println(" a " + getSpeed()+ " KM por hora");
        }
        else{
            System.out.printf("%S está parado", nome);
        }
    }

    public void comer(){
        // %S recebe a variavel string indicada apos os ""
        // printf de format
        System.out.printf("%S comeu", nome);
    }
    public void beber(){
        System.out.printf("%S bebeu", nome);
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int newWeight){
        if (newWeight > 0) {
        weight = newWeight;
    }else
        System.out.println("erro");
    }
    public String getFavoriteFood() {
        return favoriteFood;
    }
    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }
    public double getSpeed() {
        return speed;
    }
    public void setSpeed(double speed) {
        this.speed = speed;
    }

    }

