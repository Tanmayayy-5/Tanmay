public class MethodOverload {
    static int add(int a, int b) {
        return a + b;
    }
    static int add(int a, int b, int c) {
        return a + b + c;
    }
    static double add(double a, double b) {
        return a + b;
    }
    public static void main(String[] args) {
        System.out.println(add(2, 3)); // Output: 5
        System.out.println(add(1, 2, 3)); // Output: 6
        System.out.println(add(2.5, 3.5)); // Output: 6.0
    }
}
