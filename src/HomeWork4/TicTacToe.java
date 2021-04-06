package HomeWork4;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    public static char [][] map;
    public static final int SIZE = 3;

    public static final char DOT_EMPTY = '*';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';

    public static void main(String[] args) {

        initMap();
        printMap();
        while (true) {

            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Победил Человек");
                break;
            }

            if (isMapFull()) {
                System.out.println("Это ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Победила Машина");
                break;
            }

            if (isMapFull()) {
                System.out.println("Это ничья");
                break;
            }

        }
        System.out.println("Игра завершена");



    }

    public static void initMap(){
        map = new char [SIZE][SIZE];
        for (int i = 0;i < map.length;i++){
            for (int j = 0; j < map.length; j++){
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {

        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 0; i < SIZE; i++){
            System.out.print((i + 1) +  " ");
            for (int j = 0; j < SIZE; j++){
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void humanTurn(){
        Scanner scanner = new Scanner(System.in);
        int x;
        int y;
        do {
            System.out.println(" Введите координаты в фомате X Y");
           x =  scanner.nextInt() - 1;
           y = scanner.nextInt() - 1;

        }while (!isCellValid(x,y));

        map[y][x]= DOT_X;
    }

    public static void aiTurn(){
        Random random = new Random();
        int x;
        int y;
        do {
            System.out.println("Компьютер ходит");
            x =  random.nextInt(SIZE) ;
            y = random.nextInt(SIZE);

        }while (!isCellValid(x,y));

        map[y][x]= DOT_O;
    }

    public static boolean isCellValid(int x, int y){
        if(x<0 || x >= SIZE || y < 0 || y >= SIZE){
            return false;
        }
        if (map[y][x]==DOT_EMPTY){
            return true;
        }
        return false;

    }

    private static boolean checkWin(char symb) {
        boolean result = false;


        if (checkWinDiagonal(symb) || checkWinLines(symb)) {
            result = true;
        }

        return result;
    }

    private static boolean checkWinDiagonal(char symb) {
        boolean leftRight, rightLeft, result;

        leftRight = true;
        rightLeft = true;
        result = false;


        for (int i = 0; i < SIZE; i++) {
            leftRight &= (map[i][i] == symb);
            rightLeft &= (map[SIZE - i - 1][i] == symb);
        }
        if (leftRight || rightLeft) {
            result = true;
        }
        return result;

    }

    private static boolean checkWinLines(char symb) {
        boolean cols, rows, result;

        result = false;

        for (int col = 0; col < SIZE; col++) {
            cols = true;
            rows = true;

            for (int row = 0; row < SIZE; row++) {
                cols &= (map[col][row] == symb);
                rows &= (map[row][col] == symb);
            }
            if (cols || rows) {
                result = true;
                break;
            }
        }
        return result;

    }

    private static boolean isMapFull() {

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {

                    return false;
                }
            }
        }
        return true;
    }
}


