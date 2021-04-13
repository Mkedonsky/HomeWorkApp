package HomeWork7;

public class Plate {
    int food;

    public Plate(int food) {
        this.food = food;
    }

   void decreaseFood(int decreaseCount, boolean satiety){
        satiety = false;
        if (food >= decreaseCount){
        food = food - decreaseCount;
         satiety = true;
//         filling(food);
         System.out.println("Кот поел ");
         info();
        }

       System.out.println("Коту еды не хватает");
       filling(food);
       info();
    }


      void filling( int scraps){
        int minFood = 10;
        int maxFood = 20;
        if (scraps <= minFood ){
            food = maxFood;
        }
     }



     void info(){
         System.out.println("В миске "+food +" еды");
     }
}
