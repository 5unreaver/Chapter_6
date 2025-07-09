public class Page244Ex13 {
    public static void main(String[] args) {
        System.out.println("Результат: " +
                sum(10, 10, 10, 10, 10));
    }

    static int sum(int a, int b, int... v) {
        int result = a + b;
        for (int i = 0; i < v.length; i++)
            result = result + v[i];

        return result;
    }
}
