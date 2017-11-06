/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MILTON PRO
 */
public class RationalTest {
    public static void main(String[] args){
        Rational r1 = new Rational(1, 2);
        Rational r2 = new Rational(1, 6);
        Rational rAdd = Rational.add(r1, r2);
        Rational rSub = Rational.subtract(r1, r2);
        Rational rMul = Rational.multiply(r1, r2);
        Rational rDiv = Rational.divide(r1, r2);

        System.out.println("r1 " + r1.toString());
        System.out.println("r2 " + r2.toString());

        System.out.println("add " + rAdd.toString());
        System.out.println("sub " + rSub.toString());
        System.out.println("mul " + rMul.toString());
        System.out.println("div " + rDiv.toString());

        System.out.println("Double representations: ");
        System.out.println("r1 " + r1.toDoubleString());
        System.out.println("r2 " + r2.toDoubleString());
        System.out.println("add " + rAdd.toDoubleString());
        System.out.println("sub " + rSub.toDoubleString());
        System.out.println("mul " + rMul.toDoubleString());
        System.out.println("div " + rDiv.toDoubleString());
    }
}
