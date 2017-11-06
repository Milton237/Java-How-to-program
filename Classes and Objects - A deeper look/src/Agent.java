/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MILTON PRO
 */
public class Agent {
    private Board board;

    // CONSTRUCTOR
    public Agent(Board gameBoard){
        board = gameBoard;
    }
    // GETTERS
    public Board getBoard(){
        return this.board;
    }

    // ABSTRACT METHODS
    // place a piece
    abstract public void move();
}
