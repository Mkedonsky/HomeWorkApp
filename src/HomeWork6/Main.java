package HomeWork6;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Мурзик","Рыжий",4,200,0);
        Dog dog = new Dog("Мухтар","Черный",6,500,10);
        Water water = new Water(100);
        Road road = new Road(300);
        dog.info();
        cat.info();
        dog.voice();
        cat.voice();
        dog.swim(water);
        cat.swim(water);
        dog.run(road);
        cat.run(road);

    }




}
