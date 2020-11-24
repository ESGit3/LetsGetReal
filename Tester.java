public class Tester {
    public static void main(String[] args) {
        RealNumber a = new RealNumber(16.0);
        RealNumber b = new RealNumber(2.0);

        System.out.println(a.equals(b));
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
        System.out.println(a.divide(b));
    }
}