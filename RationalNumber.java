public class RationalNumber extends RealNumber {
    private int numerator, denominator;

    /**Initialize the RationalNumber with the provided values
     *  if the denominator is 0, make the fraction 0/1 instead
     *  If the denominator is negative, negate both numerator and denominator
     *@param nume the numerator
     *@param deno the denominator
     */
    public RationalNumber(int nume, int deno) {
        super((double)nume / (double)deno);
        if (deno == 0) {
            numerator = 0;
            denominator = 1;
        }
        numerator = nume;
        denominator = deno;
    }

    public double getValue() {
        if (denominator == 0) {
            return 0;
        }
        return super.getValue();
    }


    public int getNumerator(){
        return numerator;
    }
    /**
     *@return the denominator
     */
    public int getDenominator(){
        return denominator;
    }
    /**
     *@return a new RationalNumber that has the same numerator
     *and denominator as this RationalNumber but reversed.
     */
    public RationalNumber reciprocal(){
        return new RationalNumber(denominator, numerator);
    }
    /**
     *@return true when the RationalNumbers have the same numerators and denominators, false otherwise.
     */
    public boolean equals(RationalNumber other){
        return (numerator == other.getNumerator() && denominator == other.getDenominator());
    }


    /**
     *@return the value expressed as "3/4" or "8/3"
     */
    public String toString(){
        if (numerator == 0) return "0";
        if (denominator == 1) return "" + numerator;
        return "" + numerator + "/" + denominator;
    }

    /**Calculate the GCD of two integers.
     *@param a the first integers
     *@param b the second integer
     *@return the value of the GCD
     */
    private static int gcd(int a, int b){
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }
        int r = a % b;
        while (r != 0) {
            a = b;
            b = r;
            r = a % b;
        }
        return b;
    }

    /**
     *Divide the numerator and denominator by the GCD
     *This must be used to maintain that all RationalNumbers are
     *reduced after construction.
     */
    private void reduce() {
        int GCD = gcd(numerator, denominator);
        numerator = numerator / GCD;
        denominator = denominator / GCD;
    }
    /******************Operations Return a new RationalNumber!!!!****************/
    /**
     *Return a new RationalNumber that is the product of this and the other
     */
    public RationalNumber multiply(RationalNumber other){
        RationalNumber temp = new RationalNumber((numerator * other.getNumerator()), (denominator * other.getDenominator()));
        temp.reduce();
        return temp;
    }

    /**
     *Return a new RationalNumber that is the this divided by the other
     */
    public RationalNumber divide(RationalNumber other){
        RationalNumber temp = new RationalNumber((numerator * other.getDenominator()), (denominator * other.getNumerator()));
        temp.reduce();
        return temp;
    }

    /**
     *Return a new RationalNumber that is the sum of this and the other
     */
    public RationalNumber add(RationalNumber other){
        RationalNumber temp = new RationalNumber((numerator * other.getDenominator() + other.getNumerator() * denominator), (denominator * other.getDenominator()));
        temp.reduce();
        return temp;
    }
    /**
     *Return a new RationalNumber that this minus the other
     */
    public RationalNumber subtract(RationalNumber other){
        RationalNumber temp = new RationalNumber((numerator * other.getDenominator() - other.getNumerator() * denominator), (denominator * other.getDenominator()));
        temp.reduce();
        return temp;
    }
}