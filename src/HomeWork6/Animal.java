package HomeWork6;


public abstract class Animal {
    protected String name ;
    protected String color ;
    protected int endurance;
    protected int buoyancy;
    protected int age ;




    public Animal(String name, String color, int age ,int endurance,int buoyancy ) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.buoyancy = buoyancy;
        this.endurance = endurance;

    }
    abstract void voice();



    /*
    Думаю логику проверки животных на возможность плыть и на их плавучесть можно сделать по другому, но пока не понял
    как.
     */

   protected void swim(Water water){
        if (this.buoyancy == 0){
            System.out.println(name + " : не умеет плавать! ");
        }
        if (water.isLong <= this.buoyancy && this.buoyancy !=0) {
            System.out.println(name + " : проплыл " + water.isLong + "m!");
        }
        if (water.isLong > this.buoyancy && this.buoyancy > 0) {
            System.out.println(name + " : утонул не доплыв " +(water.isLong - this.buoyancy) + "m!");
        }
    }

    protected void run(Road road){

        if (road.isLong<= this.endurance ) {
            System.out.println(name + " : пробежал "+ road.isLong +"m!");
        }else {
            System.out.println(name + " : упал  не добежав " +(road.isLong - this.endurance) + "m!");
        }
    }

    protected void info(){
        System.out.println("Кличка: " + name + "; Цвет: " + color + "; Возраст: " + age + "!");
    }





}
