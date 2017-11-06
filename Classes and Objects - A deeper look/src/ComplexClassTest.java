/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MILTON PRO
 */
public class ComplexClassTest {
    public static void main(String[] args){
        ComplexClass cNum1 = new ComplexClass(1.5, 2.0);
        ComplexClass cNum2 = new ComplexClass(5.3, 2.3);
        ComplexClass cNumAddition = ComplexClass.addComplexNumbers(cNum1, cNum2);
        ComplexClass cNumSubtract = ComplexClass.subtractComplexNumbers(cNum1, cNum2);

        System.out.println("Initial values: ");
        System.out.printf("cNum1 : %s\n", cNum1.toString());
        System.out.printf("cNum2 : %s\n", cNum2.toString());

        // addition
        System.out.printf("cNumAddition : %s\n", cNumAddition.toString());

        // subtraction
        System.out.printf("cNumSubtract : %s\n", cNumSubtract.toString());
    }
}
