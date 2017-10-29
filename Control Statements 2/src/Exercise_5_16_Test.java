/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Global warming facts quiz
 * @author MILTON PRO
 */
public class Exercise_5_16_Test {
    public static void main(String[] args){
        Exercise_5_16 fact = new Exercise_5_16();

        fact.startQuiz();

        System.out.printf("You scored %d/5", fact.getScore());

        switch(fact.getScore()){
            case 5:
                System.out.println("\nExcellent\n");
                break;
            case 4:
                System.out.println("\nVery good\n");
                break;
            default:
                System.out.println("\nTime to brush up on your knowledge of global warming\n");
                System.out.println("You should visit: http://lmgtfy.com/?q=global+warming\n");
                break;
        }
    }
}
