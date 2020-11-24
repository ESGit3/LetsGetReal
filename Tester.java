public class Tester {
    public static void main(String[] args) {
        RealNumber a = new RealNumber(4.0);
        RealNumber b = new RealNumber(34.723572);

        System.out.println(a.equals(b));
        System.out.println(a.add(b));
    }
}