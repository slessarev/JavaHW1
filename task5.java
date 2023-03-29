public class task5 {
    private static int[] createArray(int len, int initialValue) {
        // должен вернуть массив длины len, каждое значение которого равно initialValue
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = createArray(5, 10);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
