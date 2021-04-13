package HomeWork6;

public class Cat extends Animal {

    public Cat(String name, String color, int age ,int endurance,int buoyancy) {
        super(name, color, age,endurance,buoyancy);

    }

    @Override
    void voice() {
        System.out.println(name + " - Мяукает!");
    }

}
