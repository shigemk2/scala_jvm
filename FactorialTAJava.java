public class FactorialTAJava {
    public static int fact(int n) {
        return go(n, 1);
    }

    private static int go(int n, int acc) {
        if (n <= 0) return acc;
        else return go(n - 1, n * acc);
    }

    public static void main(String[] args){
        System.out.println(fact(5));
    }
}
