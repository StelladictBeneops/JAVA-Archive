//constucts a new rational number to represent the ratio (numerator/denominator). The denominator cannot be zero
public RationalNumber(int numerator, int demoninator){
if (denominator <= 0) {
      throw new IllegalArgumentException("Denominator cannot 0" + 0);
    }

private int numerator = numerator;
private int denominator = denominator;

//constucts a new rational number to represent the ratio (0/1).
public int RationalNumber () {
numerator = 0;
denominator = 1;
}

public int getDenominator(int q){
this.denominator = denominator;
return denominator;
}

public int getNumerator(int p){
this.numerator = numerator;
return numerator;
}

public String toString(int numerator, int denominator){
String toString = numerator + "/" + denominator;
return toString;
}
//mutator thing

}