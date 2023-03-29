public class task2 {
    private static boolean isPositive(int x) {
        // проверить, что х положительное
        return x>0;
    }
    public static void main(String[] args) {
        boolean result = isPositive(-7);
        System.out.println(result);  
    }
}
