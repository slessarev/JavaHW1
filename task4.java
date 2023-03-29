public class task4 {
    private static boolean isLeapYear(int year) {
        // проверить, является ли год високосным. если да - return true
        // год является високосным, если он делится на 4, но не делится на 100, но делится на 400
        return ((year%4==0) && (year%100>0)) || (year%400==0);
    }
    public static void main(String[] args) {
        System.out.println(isLeapYear(2022));
        
    }
    
}
