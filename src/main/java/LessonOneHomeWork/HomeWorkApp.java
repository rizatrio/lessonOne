package LessonOneHomeWork;

/*
 * Created by Rizat Orazalina
 * */
public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords(); // 2
        line();
        checkSumSign(); // 3
        line();
        printColor(); // 4
        line();
        compareNumbers(); // 5
    }

    public static void printThreeWords(){
        System.out.println("Orange"+"\nBanana"+"\nApple");
    }

    public static void checkSumSign(){
        int a = 50;
        int b = -7;
        int sum = a + b;
        if (sum >= 0){
            System.out.println("Сумма положительная");
        }else{
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor(){
        int value = -140;
        if (value <= 0){
            System.out.println("Красный");
        } else if (value > 0 && value <= 100){
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers(){
        int a = 100;
        int b = 24;
        if (a >= b){
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static void line(){
        System.out.println("---------------------");
    }
}