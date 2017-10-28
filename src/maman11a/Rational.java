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
    
    public int getP() {
        return p;
    }
    
    public int getQ() {
        return q;
    }
    
    public boolean greaterThan()
    
    private void validateAndSet(int p, int q) {
        if(q > 0) {
            this.p = p;
            this.q = q;
        }
        else {
            this.p = 0;
        }
    }
}
