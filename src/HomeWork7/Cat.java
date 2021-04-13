package HomeWork7;

public class Cat {
     int appetite;
     boolean satiety;

    public Cat(int appetite) {
        this.appetite = appetite;
    }


    public void eat(Plate plate){
        plate.decreaseFood(appetite,satiety);

     }
}
