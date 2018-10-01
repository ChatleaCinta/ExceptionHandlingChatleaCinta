/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ContohProgram2;

/**
 *
 * @author PC
 */
public class NegativeNumberException extends Exception {
    private int bilangan;
    // default constructor
    NegativeNumberException() {
    }
    // constructor dengan parameter bertipe String
    NegativeNumberException(String pesan) {
        super(pesan);
    }
    //constructor dengan parameter bertipe String dan int
    NegativeNumberException(String pesan, int nilai) {
        super(pesan);
        bilangan = nilai;
    }
    public int getBilangan(){
        return bilangan;
    }
}
