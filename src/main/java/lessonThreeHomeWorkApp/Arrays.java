/*Created by Rizat Orazalina 17.09.2021*/
package lessonThreeHomeWorkApp;

public class Arrays {
    static int count = 0;
    public static void main(String[] args) {

        line();
        invertArray();
        line();
        fillArray();
        line();
        changeArray();
        line();
        fillDiagonal(5);
        line();
        int [] array = fillArrayWithArguments(7,3);
        printArray(array);
        line();
        findMinMax();
        line();
        System.out.println(checkBalance(2, 2, 2, 1, 2, 8, 1));

    }
    /*1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        С помощью цикла и условия заменить 0 на 1, 1 на 0;*/
    public static void invertArray() {
        int [] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Первоначальный массив: ");
        printArray(array);
        for (int i = 0; i < array.length; i++) {
            array[i] = (array[i] == 0) ? 1 : 0; //второй вариант
        }
        System.out.println("Модифицированный массив: ");
        printArray(array);

    }

    /*2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;*/
    public static void fillArray(){
        int [] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        printArray(array);
    }

    /*3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;*/
    public static void changeArray(){
        int [] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Первоначальный массив: ");
        printArray(array);
        for (int i = 0; i < array.length; i++) {
            array[i] = (array[i] < 6) ? array[i] * 2 : array[i];
        }
        System.out.println("Модифицированный массив: ");
        printArray(array);
    }

    /*4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей,
    если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу: индексы
    таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];*/

    public static void fillDiagonal(int n){
        int[][] array = new int[n][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (i == j || i + j == array.length - 1) ? 1 : 0;
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    /*5. Написать метод, принимающий на вход два аргумента: len и initialValue,
     и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;*/
    public static int[] fillArrayWithArguments(int len, int initialValue){
        int [] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }
        return array;
    }

    /*6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;*/
    public static void findMinMax(){
        int[] array = {-100,5,10,23,-52,0,6,3,-7,70};
        printArray(array);
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] > max){
                max = array[i];
            } else if(array[i] < min){
                min = array[i];
            }
        }
        System.out.println("max element:" + max + ", min element:" + min);
    }

    /*7. ** Написать метод, в который передается не пустой одномерный
    целочисленный массив, метод должен вернуть true, если в массиве есть место,
    в котором сумма левой и правой части массива равны.
    **Примеры: checkBalance([2, 2, 2, 1, 2, 2, ||| 10, 1]) → true, т.е. 2 + 2 + 2 + 1 + 2 + 2 = 10 + 1
    checkBalance([1, 1, 1, ||| 2, 1]) → true, т.е. 1 + 1 + 1 = 2 + 1
    граница показана символами |||, эти символы в массив не входят и не имеют никакого отношения к ИЛИ.*/
    public static boolean checkBalance(int ... array){
        for (int i = 0; i < array.length - 1; i++) {
            int sumLeft = 0;
            int sumRight = 0;
            for (int left = 0; left <= i; left++) {
                sumLeft += array[left];
            }
            for (int right = i + 1; right < array.length; right++) {
                sumRight += array[right];
            }
            if(sumRight == sumLeft){
                return true;
            }
        }
        return false;
    }

    public static void printArray(int [] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.println();
    }

    public static void line(){
        count ++;
        System.out.println("\nЗадача №"+count);
        for (int i = 0; i < 100; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}

