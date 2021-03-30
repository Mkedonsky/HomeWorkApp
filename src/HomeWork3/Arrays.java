package HomeWork3;

public class Arrays {

    public static void main(String[] args) {

        int len = 6;
        int initialValue = 4;

        arraySimple();
        arrayHundred();
        withoutSix();
        arrayMeasurable(len ,initialValue);
        fillInTheDiagonals();




    }


    public static void arraySimple(){
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < arr.length; i++){
            if (arr[i]== 0){
                arr[i]= 1;
            }else
                arr[i]= 0;
        }
    }


    public static void arrayHundred(){
        int[]arr = new int[100];
        for (int i=0;i< arr.length;i++){
            arr[i]=i+1;
        }
    }

    public static void withoutSix(){
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i= 0; i< arr.length;i++){
            if (arr[i]<6){
                arr[i] *= 2;
            }
        }
    }

    public static int[] arrayMeasurable(int len,int initialValue){

        int [] arr = new int[len];
        for (int i= 0;i<arr.length;i++) {

            arr[i] = initialValue;
        }

        return arr;
    }

    public static void fillInTheDiagonals(){
        int[][] arr = new int[3][3];
         arr[0][0] = 1;
         arr[0][2] = 1;
         arr[1][1] = 1;
         arr[2][0] = 1;
         arr[2][2] = 1;

    }


}
