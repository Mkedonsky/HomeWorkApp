package HomeWork2;

public class lesson2 {

    public static void main(String[] args) {
        int a = 9;
        int b = -2;
        int x = 8;
        String massage = "Hello world!";
        int year = 2016;

        checkSum(a,b);
        checkNumber(a);
        checkNum(b);
        counter(x,massage);
        checkYear(year);


    }
    public static boolean checkSum(int a,int b){
        int sum = a + b;
        if (10 <=sum & sum<= 20 ){
            System.out.println("True "+ sum);
      return true;
    }else
            System.out.println("False "+ sum);
        return false;

    }

    public static void checkNumber(int a){
        if (a>=0){
            System.out.println("Полученно положительное число: " +a);
        }else {
            System.out.println("Полученно отрицательное число: " +a);
        }

    }

    public static boolean checkNum(int b){
        if (b>=0){
            System.out.println("положительное");
            return true;
        }else {
            System.out.println("отрицательное");
            return false;

        }
    }

    public static void counter(int x,String message){
        for (int i = 0; i < x; i++){
            System.out.println(message +" "+ i);
        }
    }

    public static boolean checkYear(int year){
        if ((year % 400 == 0) || (year % 4==0) && (year % 100 !=0)){
            return true;
        }else{
        return false;}
    }
}
