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
    
    private int p;
    private int q;
    
    Rational(int p, int q) {
        validateAndSet(p, q);
    }
    
    public int getNumerator() {
        return p;
    }
    
    public int getDenominator() {
        return q;
    }
    
    public boolean greaterThan(Rational rational) {
        return p * rational.getDenominator()> rational.getNumerator() * q;
    }
    
    @Override
    public boolean equals(Object object) {
        if(object == null || !(object instanceof Rational)) {
            return false;
        }
        
        Rational rational = (Rational) object;
        return p * rational.getDenominator() == rational.getNumerator() * q;
    }
    
    public Rational plus(Rational rational) {
        if(rational == null) {
            return new Rational(p, q);
        }
        
        int summedP = p * rational.getDenominator() + rational.getNumerator() * q;
        int summedQ = q * rational.getDenominator();
       
        return new Rational(summedP, summedQ);
    }
    
    public Rational minus(Rational rational) {
        if(rational == null) {
            return new Rational(p, q);
        }
        
        int summedP = p * rational.getDenominator() - rational.getNumerator() * q;
        int summedQ = q * rational.getDenominator();
       
        return new Rational(summedP, summedQ);
    }
    
    public Rational multiply(Rational rational) {
        if(rational == null) {
            return new Rational(0, 0);
        }
        
        int multipliedP = p * rational.getNumerator();
        int multipliedQ = q * rational.getDenominator();
       
        return new Rational(multipliedP, multipliedQ);
    }
    
    public Rational reduce() {
        
    }
    
    @Override
    public String toString() {
        return p + "/" + q;
    }
    
    private void validateAndSet(int p, int q) {
        if(q > 0) {
            this.p = p;
            this.q = q;
        }
        else {
            this.p = 0;
            this.q = 1;
        }
    }
}
