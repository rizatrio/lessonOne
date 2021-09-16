package lessonTwoHomeWorkApp;

public class HomeWorkAppTwo {
    public static void main(String[] args) {
        /*
        1. Написать метод, принимающий на вход два целых числа и проверяющий,
        что их сумма лежит в пределах от 10 до 20 (включительно),
        если да – вернуть true, в противном случае – false.
        2. Написать метод, которому в качестве параметра передается целое число,
         метод должен напечатать в консоль, положительное ли число передали или отрицательное.
         Замечание: ноль считаем положительным числом.
        3. Написать метод, которому в качестве параметра передается целое число.
        Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
        4. Написать метод, которому в качестве аргументов передается строка и число,
        метод должен отпечатать в консоль указанную строку, указанное количество раз;
        5. Написать метод, который определяет, является ли год високосным, и возвращает boolean
        (високосный - true, не високосный - false). Каждый 4-й год является високосным,
        кроме каждого 100-го, при этом каждый 400-й – високосный
        * */
        System.out.println(within10and20(50, -20));
        isPositiveOrNegative(10);
        System.out.println(isNegative(-2));
        printWordNTimes("Rizat", 5);
        System.out.println(isLeapYear(2020));

    }

    public static boolean within10and20(int x1, int x2) {
        int sum = x1 + x2;
        return sum >= 10 && sum <= 20; // оптимизированный код
    }

    public static void isPositiveOrNegative(int x) {
        if (x >= 0) {
            System.out.println(x + "- положительное число");
        } else {
            System.out.println(x + "- отрицательное число");
        }
    }

    public static boolean isNegative(int x) {
        if (x < 0) {
            return true;
        }
        return false;
    }

    public static void printWordNTimes(String word, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(word);
        }
    }

    public static boolean isLeapYear(int year){
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

}
