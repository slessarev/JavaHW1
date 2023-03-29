public class task3 {
    private static void printString(String source, int repeat) {
        // напечатать строку source repeat раз
        for (int i=0; i<repeat; i++) {
            System.out.println(source);
        }
    }
    public static void main(String[] args) {
    printString("Hello World!", 5);    
    }
}
