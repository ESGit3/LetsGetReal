public class Tester {
    public static void main(String[] args) {
        //real number tests
        RealNumber a = new RealNumber(16.0);
        RealNumber b = new RealNumber(2.0);

        System.out.println(a.equals(b));
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
        System.out.println(a.divide(b));
        System.out.println(a.subtract(b));

        //rational number tests
        RationalNumber x = new RationalNumber(4, 15);
        System.out.println(x.getValue());
        System.out.println(x.getNumerator());
        System.out.println(x.getDenominator());

    }
}