package HomeWork7;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat(25);
        Cat cat2 = new Cat(30);
        Cat cat3 = new Cat(28);
        Cat cat4 = new Cat(27);
        Cat cat5 = new Cat(15);
        Plate plate = new Plate(30);



        Cat[] cats = new Cat[]{cat1,cat2,cat3,cat4,cat5};

        for (Cat c : cats){
            c.eat(plate);
        }
    }
}
