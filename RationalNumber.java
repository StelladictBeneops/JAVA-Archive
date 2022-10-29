public class RationalNumber{
private int numerator; 
private int denominator;

//constucts a new rational number to represent the ratio (numerator/denominator). The denominator cannot be zero
public RationalNumber(int numerator, int denominator){ 
this.numerator = numerator; 
this.denominator = denominator;
if (denominator == 0) {throw new IllegalArgumentException("Denominator cannot be " + 0);}
}

//constucts a new rational number to represent the ratio (0/1).
public RationalNumber () { 
numerator = 0;
denominator = 1;
}

public int getDenominator(){ 
return denominator;
}

public int getNumerator(){ 
return numerator;
}

public String toString(){ 
String toString = numerator + "/" + denominator;
return toString;
}

}

