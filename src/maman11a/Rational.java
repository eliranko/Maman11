/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maman11a;

/**
 *
 * @author elira
 */
public class Rational {
    
    private int numerator;
    private int denomenator;
    
    Rational(int p, int q) {
        validateAndSet(p, q);
    }
    
    public int getNumerator() {
        return numerator;
    }
    
    public int getDenominator() {
        return denomenator;
    }
    
    public boolean greaterThan(Rational rational) {
        return numerator * rational.getDenominator()> rational.getNumerator() * denomenator;
    }
    
    @Override
    public boolean equals(Object object) {
        if(object == null || !(object instanceof Rational)) {
            return false;
        }
        
        Rational rational = (Rational) object;
        return numerator * rational.getDenominator() == rational.getNumerator() * denomenator;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + this.numerator;
        hash = 89 * hash + this.denomenator;
        return hash;
    }
    
    public Rational plus(Rational rational) {
        if(rational == null) {
            return new Rational(numerator, denomenator);
        }
        
        int summedP = numerator * rational.getDenominator() + rational.getNumerator() * denomenator;
        int summedQ = denomenator * rational.getDenominator();
       
        return new Rational(summedP, summedQ);
    }
    
    public Rational minus(Rational rational) {
        if(rational == null) {
            return new Rational(numerator, denomenator);
        }
        
        int summedP = numerator * rational.getDenominator() - rational.getNumerator() * denomenator;
        int summedQ = denomenator * rational.getDenominator();
       
        return new Rational(summedP, summedQ);
    }
    
    public Rational multiply(Rational rational) {
        if(rational == null) {
            return new Rational(0, 0);
        }
        
        int multipliedP = numerator * rational.getNumerator();
        int multipliedQ = denomenator * rational.getDenominator();
       
        return new Rational(multipliedP, multipliedQ);
    }
    
    public Rational reduce() {
        int absNum = Math.abs(numerator);
        int gcd = absNum > denomenator ? gcd(absNum,denomenator) : gcd(denomenator, absNum);
        return new Rational(numerator / gcd, denomenator / gcd);
    }
    
    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        
        return gcd(b, a % b);
    }
    
    @Override
    public String toString() {
        Rational reduced = reduce();
        return reduced.getNumerator() + "/" + reduced.getDenominator();
    }
    
    private void validateAndSet(int p, int q) {
        if(q > 0) {
            this.numerator = p;
            this.denomenator = q;
        }
        else {
            this.numerator = 0;
            this.denomenator = 1;
        }
    }
}
