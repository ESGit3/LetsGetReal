public class Tester {
    public static void main(String[] args) {
        //real number tests
        RealNumber a = new RealNumber(16.0);
        RealNumber b = new RealNumber(16.0);

        System.out.println(a.equals(b));
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
        System.out.println(a.divide(b));
        System.out.println(a.subtract(b));

        //rational number tests
        RationalNumber x = new RationalNumber(4, 16);
        RationalNumber y = new RationalNumber(2, 1);
        System.out.println(x.getValue());
        System.out.println(x.getNumerator());
        System.out.println(x.getDenominator());
        System.out.println(x.equals(y));
        System.out.println(y.toString());

        System.out.println(x.multiply(y));
        System.out.println(x.divide(y));
        System.out.println(x.add(y));
        System.out.println(x.subtract(y));

        //abstract number class
        System.out.println(a.compareTo(b));
    }
}