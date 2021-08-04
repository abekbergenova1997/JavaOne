package lesson2;

public class SecondApp {
    public static void main(String[] args) {
        System.out.println(doSum(10, 10));
        isPositiveOrNegative(-10);
        printWordNTimes("Java", 5);
        System.out.println(leapYear(400));
    }
    public static boolean doSum(int a, int b) {
        int sum = a + b;
        if (sum > 10 && sum <= 20) return true;
        else return false;
    }
    public static void isPositiveOrNegative(int x) {
        if (x >= 0) {
            System.out.println(x + " - это положительное число");
        } else {
            System.out.println(x + " - это отрицательное число");
        }
    }
    public static void printWordNTimes(String a, int b) {
        for (int i = 0; i < b; i++) {
            System.out.println(a);
        }
    }
    public static boolean leapYear(int y) {
        if (!(y % 4 == 0) || ((y % 100 == 0) && !(y % 400 == 0))) return false;
        else return true;
    }
}

