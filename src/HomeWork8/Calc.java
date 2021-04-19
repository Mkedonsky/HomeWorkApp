package HomeWork8;

public class Calc {

    int total;


    public int computation(int num1, int num2, String operator){
        switch (operator){
            case ("+"):
                total = num1 + num2;
                break;

            case ("-"):
                total = num1 - num2;
                break;

            case ("/"):
                total = num1 / num2;
                break;

            case ("*"):
                total = num1 * num2;
                break;

            default: total = 0;
            break;
        }
        return total;

    }
}
