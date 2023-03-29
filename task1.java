/**
 * 1. Написать метод, принимающий на вход два целых числа и проверяющий,
 * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
 */
public class task1 {
    public static boolean SumOfValue (int a, int b) {
        return ((a+b)>=10 && (a+b) <= 20 );
    }
    public static void main(String[] args) {
        boolean result = SumOfValue(5,7);
        System.out.println(result);
    }
    
}